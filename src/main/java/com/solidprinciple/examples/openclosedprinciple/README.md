# Open/Closed Principle Example: Discount Calculator Application

## Overview

This example demonstrates the application of the Open/Closed Principle in a simple discount calculator Application implemented in Java. The Open/Closed Principle is one of the SOLID principles of object-oriented programming, stating that a class should be open for extension but closed for modification. The goal is to allow the addition of new functionality without altering existing code.

## Classes

### 1. `Book` Class

The `Book` class represents a book in the discount calculator system. It includes properties such as `title` and `price`. The class is designed with a constructor to initialize these properties, getter methods to access them, and a `setTitle` method to set or update the title.

### 2. `DiscountCalculator` Interface

The `DiscountCalculator` interface defines a contract for calculating discounts. Concrete classes implementing this interface will provide specific discount calculation logic.

### 3. `FictionalBookDiscountCalculator` and `NonFictionalBookDiscountCalculator` Classes

These concrete classes implement the `DiscountCalculator` interface and provide specific discount calculation logic for fiction and non-fiction books, respectively.

### 4. `DiscountCalculator` Class

The `DiscountCalculator` class manages book discounts. It takes a `DiscountCalculator` as a parameter during instantiation, allowing flexibility to use different discount strategies. The `calculateDiscountedPrice` method utilizes the provided discount calculator to calculate and return the discounted price of a given book.

## Applying the Open/Closed Principle

In this example, the Open/Closed Principle is applied as follows:

1. **Closed for Modification:** The `Book` class is closed for modification. Once created, the structure and behavior of the `Book` class remain unchanged. The addition of new types of books or changes in discount calculation logic does not require modifications to the `Book` class.

2. **Open for Extension:** The system is open for extension. New types of books, each with its own discount calculation logic, can be introduced by creating new classes that implement the `DiscountCalculator` interface without altering existing code.

## Example Usage

The `OCPApplication` class demonstrates the usage of the implemented classes. It creates instances of books, discount calculators, and the discount calculator system with different discount strategies. The discounted prices are calculated and displayed for both fiction and non-fiction books.

## Conclusion

By adhering to the Open/Closed Principle, this example provides a flexible and extensible discount calculator system. It allows for easy addition of new book types and discount calculation strategies without the need to modify existing code.
