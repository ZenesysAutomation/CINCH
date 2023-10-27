package ScreenRecorder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.*;
import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.Registry;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;

public class MyScreenRecording extends ScreenRecorder {
    public static ScreenRecorder screenRecorder;
    public String name;
    public static Properties prop;

    public MyScreenRecording(GraphicsConfiguration cfg, Rectangle captureArea, Format fileFormat,
    Format screenFormat, Format mouseFormat, Format audioFormat, File movieFolder, String name)
    throws IOException, AWTException {
    super(cfg, captureArea, fileFormat, screenFormat, mouseFormat, audioFormat, movieFolder);
    this.name = name;
    
    }

    @Override
    protected File createMovieFile(Format fileFormat) throws IOException {
        if (!movieFolder.exists()) {
            movieFolder.mkdirs();
        } else if (!movieFolder.isDirectory()) {
            throw new IOException("\"" + movieFolder + "\" is not a directory.");
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH.mm.ss");
        return new File(movieFolder, name + "-" + dateFormat.format(new Date()) + "." +Registry.getInstance().getExtension(fileFormat));
    }

    public static void startRecording(String methodName) throws Exception {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("TestData/Config.properties");
            prop.load(file);
            boolean recordingEnabled = Boolean.parseBoolean(prop.getProperty("recording.enabled"));

            if (recordingEnabled) {
                File file5 = new File("./recordings/");
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int width = screenSize.width;
                int height = screenSize.height;
                Rectangle captureSize = new Rectangle(0, 0, width, height);
                GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
                screenRecorder = new MyScreenRecording(gc, captureSize,
                        new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE, DepthKey, 24, FrameRateKey,
                        Rational.valueOf(15), QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
                        new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black", FrameRateKey, Rational.valueOf(30)),
                        null, file5, methodName);
                
                screenRecorder.start();
            }
            else {
                System.out.println("Recording is not enabled.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void stopRecording() throws Exception {
    	
    	 if (screenRecorder != null) {
    	        screenRecorder.stop();
    	    } else {
    	        System.out.println("Recording was not started.");
    	    }
    	}
}
	
	

		 
	


