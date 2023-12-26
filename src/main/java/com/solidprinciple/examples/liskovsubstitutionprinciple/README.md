# Liskov Substitution Principle (LSP) Example: College Application

## Overview

This example demonstrates the Liskov Substitution Principle (LSP) in a Java-based college Application. LSP is one of the SOLID principles, emphasizing that you should always be able to substitute the parent class with its derived class without any undesirable behaviour
## Classes

### 1. `Course` Class

The `Course` class represents a generic college course with properties such as `courseName` and `courseCredits`. It includes a constructor to initialize these properties, getter methods to access them, and a default implementation for the `getDepartment` method.

### 2. `MathCourse` and `ComputerScienceCourse` Classes

These classes extend the `Course` class, representing specialized courses in mathematics and computer science, respectively. They override the `getDepartment` method to provide specific department information.

### 3. `College` Class

The `College` class contains a method `displayCourseDetails` that takes an array of courses and displays their details, including course name, department, and credits.

## Applying the Liskov Substitution Principle

In this example, the Liskov Substitution Principle is applied as follows:

1. **Base Class Usage:** Instances of the `MathCourse` and `ComputerScienceCourse` classes are used interchangeably with instances of the base `Course` class in the `displayCourseDetails` method of the `College` class.

2. **Subclass Behavior:** Each subclass (`MathCourse` and `ComputerScienceCourse`) provides specific behavior by overriding the `getDepartment` method. However, this specialization does not break the expected behavior when used in place of the base class.

## Example Usage

The `LSPApplication` class demonstrates the usage of the implemented classes. It creates instances of different types of courses, gathers them in an array, and then uses the `College` class to display their details.

## Conclusion

By adhering to the Liskov Substitution Principle, this example demonstrates the flexibility of using different types of courses interchangeably while maintaining correctness in the college system. It promotes a design that allows for extension and specialization without compromising the integrity of the program.
