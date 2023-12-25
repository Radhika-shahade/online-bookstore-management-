package com.solidprinciple.examples.singleresponsibilityprinciple;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SrpApplication {
    public static void main(String[] args) {
        String filePath = "src/main/resources/data/user_data.txt";

        FileManager fileManager = new FileManager(filePath);
        UserDataProcessor dataProcessor = new UserDataProcessor(fileManager);

        // Use Scanner to read user data from the console
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter user data (format: Name,Age,Email): ");
            String userData = scanner.nextLine();

            // Processing user data with the enhanced logic
            dataProcessor.processData(userData);

            // Reading data from file after processing
            List<String> dataFromFile = Collections.singletonList(fileManager.readFromFile());
            System.out.println("Data read from file: " + dataFromFile);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}


