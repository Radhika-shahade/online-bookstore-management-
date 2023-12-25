package com.solidprinciple.examples.singleresponsibilityprinciple;

public class UserDataProcessor {
    private FileManager fileManager;

    public UserDataProcessor(FileManager fileManager) {
        this.fileManager = fileManager;
    }
    public void processData(String userData) {
        System.out.println("Processing user data: " + userData);

        // Example logic: Extracting user information
        String[] userDataParts = userData.split(",");
        String username = userDataParts[0];
        int age = Integer.parseInt(userDataParts[1]);
        String email = userDataParts[2];

        // Example logic: Checking if the user is eligible
        boolean isEligible = checkEligibility(age);

        // Example logic: Sending a welcome email and saving data to file
        if (isEligible) {
            sendWelcomeEmail(username, email);
            fileManager.saveToFile(userData);
        } else {
            System.out.println("User not eligible.");
        }
    }

    private boolean checkEligibility(int age) {
        return age >= 18;
    }

    private void sendWelcomeEmail(String username, String email) {
        System.out.println("Sending welcome email to " + username + " at " + email);
    }
}
