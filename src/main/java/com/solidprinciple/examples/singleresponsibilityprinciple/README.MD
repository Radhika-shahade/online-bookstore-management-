# Single Responsibility Principle Example: User Data Processing

## Overview

This example demonstrates the Single Responsibility Principle (SRP) in a Java application that processes user data. SRP states that a class should have only one reason to change, meaning it should have only one responsibility. In this example, we have separate classes for file management and user data processing, each with a single responsibility.

## Classes

### 1. `FileManager` Class

The `FileManager` class is responsible for handling file operations. It includes methods to save data to a file and read data from a file.

### 2. `UserDataProcessor` Class

The `UserDataProcessor` class is responsible for processing user data. It includes methods to process user data, check eligibility, send a welcome email, and save data to a file.

### 3. `SrpApplication` Class

The `SrpApplication` class serves as the entry point to the application. It demonstrates the usage of the `FileManager` and `UserDataProcessor` classes by accepting user input, processing user data, and interacting with the file system.

## Applying the Single Responsibility Principle

In this example, the Single Responsibility Principle is applied as follows:

1. **FileManager Class Responsibility:** Manages file operations, including saving and reading data to/from a file.

2. **UserDataProcessor Class Responsibility:** Processes user data, checks eligibility, sends a welcome email, and saves data to a file.

## Example Usage

The `SrpApplication` class demonstrates the usage of the `FileManager` and `UserDataProcessor` classes. It prompts the user to enter data, processes the data, and outputs the results.


## Conclusion
By adhering to the Single Responsibility Principle, this example promotes maintainability and flexibility. Each class has a clear and distinct responsibility, making the code more modular and easier to understand.