package com.solidprinciple.examples.singleresponsibilityprinciple;

import java.io.*;

public class FileManager {
    private String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile(String data) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(data);
        } catch (IOException e) {
            System.err.println("Error while saving data to file: " + e.getMessage());
        }
    }

    public String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Reading data from file");
        } catch (IOException e) {
            System.err.println("Error reading data from file: " + e.getMessage());
        }
        return content.toString();
    }
}


