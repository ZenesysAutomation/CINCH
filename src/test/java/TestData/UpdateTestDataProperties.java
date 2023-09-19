package TestData;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;

public class UpdateTestDataProperties {
    public static Properties prop;

    public static void main(String[] args) {
        try {
            // Load existing properties
            Properties prop = new Properties();
            FileInputStream file = new FileInputStream("TestData/TestDataRandom.properties");
            prop.load(file);

            // Generate new test data
            String newFirstName = generateRandomSentence();
            String newLastName = generateRandomSentence2();
            String newAddressLine1=generateRandomString(8);
            String newAddressLine2=generateRandomString(8);
            String newResidentID=generateRandomString(8);
            String newMaritalStatus=generateRandomString(10);
            String newSpouseName=generateRandomString(10);
            String newReferralSource=generateRandomString(10);
            String newEssentialInformation=generateRandomString(10);
            String newfirstName = generateRandomSentence3();
            String newlastName = generateRandomSentence4();
            String newaddressLine1=generateRandomString(5);
            String newaddressLine2=generateRandomString(6);
            String newcity=generateRandomString(6);
            String newnote=generateRandomString(8);
            String newEditNote=generateRandomString(8);
            String newVisitSchedule=generateRandomString(8);
            String newGoalOfService=generateRandomString(10);
            String newFamilySocialNetwork=generateRandomString(10);
            String newDietryNeeds=generateRandomString(10);
            String newPrecautions=generateRandomString(10);
            String newRestrictions=generateRandomString(10);
            String newConditionNotes=generateRandomString(10);
            String newRecentHospitalStays=generateRandomString(10);
            String newMedicationReminders=generateRandomString(10);
            String newAllergiesDescription=generateRandomString(10);
            String newNote=generateRandomString(10);
            String newBathingDetails=generateRandomString(10);
            String newMobilityDetails=generateRandomString(10);
            String newDressingGroomingDetails=generateRandomString(10);
            String newContinenceToiletingDetails=generateRandomString(8);
            String newEatingDetails=generateRandomString(8);
            String newMealsDetails=generateRandomString(8);
            String newLaundaryDetails=generateRandomString(8);
            String newHouseholdTaskDetails=generateRandomString(8);
            String newEnviromentalSafteyConcernDetails=generateRandomString(12);
            String newEconomicsStatus=generateRandomString(12);
            String newCaregiverInstruction=generateRandomString(12);
            String newCaregiverNotes=generateRandomString(12);
            String newNotes=generateRandomString(10);
            String newCaregiverNote=generateRandomString(10);
            String newCaregiverinstruction=generateRandomString(10);
            

            //Generate a random phone number
            String newPrimaryPhone = generateRandomPhoneNumber();
            String newprimaryphnumber=generateRandomPhoneNumber();
            // Generate a random email
            String newEmail1 = generateRandomEmail();
            String newemail2 = generateRandomEmail();
            
            //generate BirthDate
            String newBirthdate = generateRandomBirthdate();
            
            String newZipCode = generateRandomZipCode();
            String newzipcode=generateRandomZipCode();
          
            //Update the properties
            prop.setProperty("FirstName", newFirstName);
            prop.setProperty("LastName", newLastName);
            prop.setProperty("AddressLine1", newAddressLine1);
            prop.setProperty("AddressLine2", newAddressLine2);
            prop.setProperty("ResidentID", newResidentID);
            prop.setProperty("ZipCode", newZipCode);
            prop.setProperty("PrimaryPhone", newPrimaryPhone);
            prop.setProperty("Email", newEmail1);
            prop.setProperty("Birthdate", newBirthdate);
            prop.setProperty("MaritalStatus", newMaritalStatus);
            prop.setProperty("SpouseName", newSpouseName);
            prop.setProperty("ReferralSource", newReferralSource);
            prop.setProperty("EssentialInformation", newEssentialInformation);
            prop.setProperty("firstName", newfirstName);  
            prop.setProperty("lastName", newlastName);
            prop.setProperty("addressLine1", newaddressLine1);
            prop.setProperty("addressLine2", newaddressLine2);
            prop.setProperty("city", newcity);
            prop.setProperty("zipcode", newzipcode);
            prop.setProperty("primaryphnumber", newprimaryphnumber);
            prop.setProperty("email", newemail2);
            prop.setProperty("note", newnote);
            prop.setProperty("EditNote",newEditNote);
            prop.setProperty("VisitSchedule",newVisitSchedule);
            prop.setProperty("GoalOfService",newGoalOfService);
            prop.setProperty("FamilySocialNetwork",newFamilySocialNetwork);
            prop.setProperty("DietryNeeds",newDietryNeeds);
            prop.setProperty("Precautions",newPrecautions);
            prop.setProperty("Restrictions",newRestrictions);
            prop.setProperty("ConditionNotes",newConditionNotes);
            prop.setProperty("RecentHospitalStays",newRecentHospitalStays);
            prop.setProperty("MedicationReminders",newMedicationReminders);
            prop.setProperty("AllergiesDescription",newAllergiesDescription);
            prop.setProperty("Note",newNote);
            prop.setProperty("BathingDetails",newBathingDetails);
            prop.setProperty("MobilityDetails",newMobilityDetails);
            prop.setProperty("DressingGroomingDetails",newDressingGroomingDetails);
            prop.setProperty("ContinenceToiletingDetails",newContinenceToiletingDetails);
            prop.setProperty("EatingDetails",newEatingDetails);
            prop.setProperty("MealsDetails",newMealsDetails);
            prop.setProperty("LaundaryDetails",newLaundaryDetails);
            prop.setProperty("HouseholdTaskDetails",newHouseholdTaskDetails);
            prop.setProperty("EnviromentalSafteyConcernDetails",newEnviromentalSafteyConcernDetails);
            prop.setProperty("EconomicsStatus",newEconomicsStatus);
            prop.setProperty("CaregiverInstruction",newCaregiverInstruction);
            prop.setProperty("CaregiverNotes",newCaregiverNotes);
            prop.setProperty("Notes",newNotes);
            prop.setProperty("CaregiverNote",newCaregiverNote);
            prop.setProperty("Caregiverinstruction",newCaregiverinstruction);

            // Save the updated properties to the file
            try (OutputStream output = new FileOutputStream("TestData/TestDataRandom.properties")) {
                prop.store(output, "Updated test data for today");
            }

            // Print the updated values
            System.out.println("Updated test data for today:");
            System.out.println("FirstName= " + newFirstName);
            System.out.println("LastName= " + newLastName);
            System.out.println("AddressLine1= " + newAddressLine1);
            System.out.println("AddressLine2= " + newAddressLine2);
            System.out.println("ResidentID= " + newResidentID);
            System.out.println("ZipCode= " + newZipCode);
            System.out.println("PrimaryPhone= " + newPrimaryPhone);
            System.out.println("Email= " + newEmail1);
            System.out.println("Birthdate= " + newBirthdate);
            System.out.println("MaritalStatus= " + newMaritalStatus);
            System.out.println("SpouseName= " + newSpouseName);
            System.out.println("ReferralSource= " + newReferralSource);
            System.out.println("EssentialInformation= " + newEssentialInformation);
            System.out.println("firstName= " + newfirstName);
            System.out.println("lastName= " + newlastName);
            System.out.println("addressLine1= " + newaddressLine1);
            System.out.println("addressLine2= " + newaddressLine2);
            System.out.println("city= " + newcity);
            System.out.println("zipcode= " + newzipcode);
            System.out.println("primaryphnumber= " + newprimaryphnumber);
            System.out.println("email= " + newemail2);
            System.out.println("note= " + newnote);
            System.out.println("EditNote= " + newEditNote);
            System.out.println("VisitSchedule= " + newVisitSchedule);
            System.out.println("GoalOfService= " + newGoalOfService);
            System.out.println("FamilySocialNetwork= " + newFamilySocialNetwork);
            System.out.println("DietryNeeds= " + newDietryNeeds);
            System.out.println("Precautions= " + newPrecautions);
            System.out.println("Restrictions= " + newRestrictions);
            System.out.println("ConditionNotes= " + newConditionNotes);
            System.out.println("RecentHospitalStays= " + newRecentHospitalStays);
            System.out.println("MedicationReminders= " + newMedicationReminders);
            System.out.println("AllergiesDescription= " + newAllergiesDescription);
            System.out.println("Notes= " + newNotes);
            System.out.println("BathingDetails= " + newBathingDetails);
            System.out.println("MobilityDetails= " + newMobilityDetails);
            System.out.println("DressingGroomingDetails= " + newDressingGroomingDetails);
            System.out.println("ContinenceToiletingDetails= " + newContinenceToiletingDetails);
            System.out.println("EatingDetails= " + newEatingDetails);
            System.out.println("MealsDetails= " + newMealsDetails);
            System.out.println("LaundaryDetails= " + newLaundaryDetails);
            System.out.println("HouseholdTaskDetails= " + newHouseholdTaskDetails);
            System.out.println("EnviromentalSafteyConcernDetails= " + newEnviromentalSafteyConcernDetails);
            System.out.println("EconomicsStatus= " + newEconomicsStatus);
            System.out.println("CaregiverInstruction= " + newCaregiverInstruction);
            System.out.println("CaregiverNotes= " + newCaregiverNotes);
            System.out.println("Notes= " + newNotes);
            System.out.println("CaregiverNote= " + newCaregiverNote);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }

        return randomString.toString();
    }
    
    private static String generateRandomSentence() {
        String[] subjects = {"Jack", "Test", "Testing", "Alice", "Bob","Smith","Wilson","Brock","Mcbride","Hickman"};
        Random random = new Random();
        String subject = subjects[random.nextInt(subjects.length)];
        return subject + " ";
    }
    
    private static String generateRandomSentence2() {
        String[] subjects = {"Mac", "Brown", "Miller", "Davis", "Richard","John","Maria","Mary","Test2","Michael","Alana"};
        Random random = new Random();
        String subject = subjects[random.nextInt(subjects.length)];
        return subject + " ";
    }
    
    private static String generateRandomSentence3() {
        String[] subjects = {"Mac", "Brown", "Miller", "Davis", "Richard","John","Maria","Test1","Test3","Michael","Alana"};
        Random random = new Random();
        String subject = subjects[random.nextInt(subjects.length)];
        return subject + " ";
    }
    private static String generateRandomSentence4() {
        String[] subjects = {"Mac", "Brown", "Miller", "Davis", "Richard","John","bobby","Mary","Jerri","Michael","Alana"};
        Random random = new Random();
        String subject = subjects[random.nextInt(subjects.length)];
        return subject + " ";
    }

    private static String generateRandomPhoneNumber() {
        StringBuilder randomPhoneNumber = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) { 
            int digit = random.nextInt(10); 
            randomPhoneNumber.append(digit);
        }
        return randomPhoneNumber.toString();
    }
    
    private static String generateRandomEmail() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomLocalPart = new StringBuilder();

        Random random = new Random();

        int localPartLength = random.nextInt(6) + 5; 

        for (int i = 0; i < localPartLength; i++) {
            int index = random.nextInt(characters.length());
            randomLocalPart.append(characters.charAt(index));
        }
        String domain = "gmail.com"; 
        // Combine the local and domain parts to create the email address
        return randomLocalPart.toString() + "@" + domain;
    }
    
    private static String generateRandomBirthdate() {
        Random random = new Random();
        int year = 1900 + random.nextInt(100); // Random year between 1900 and 1999
        int month = 1 + random.nextInt(12); // Random month between 1 and 12
        int day = 1 + random.nextInt(28); // Random day between 1 and 28 (ignoring leap years for simplicity)
        LocalDate date = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
        
    }
    
    private static String generateRandomZipCode() {
        Random random = new Random();
        StringBuilder zipCode = new StringBuilder();
        for (int i = 0; i < 6; i++) { // ZIP codes in the United States are typically 5 digits
            int digit = random.nextInt(10); // Random digit between 0 and 9
            zipCode.append(digit);
        }
        return zipCode.toString();
    }
    
    
}


   

	
	

	

