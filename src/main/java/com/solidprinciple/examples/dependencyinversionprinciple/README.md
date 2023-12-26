# Dependency Inversion Principle Example

## Overview

This project demonstrates the Dependency Inversion Principle (DIP) in object-oriented design. The Dependency Inversion Principle is one of the SOLID principles, emphasizing that high-level modules should not depend on low-level modules but both should depend on abstractions.

## Classes

### 1. `MessageProvider` Interface

The `MessageProvider` interface defines the abstraction for providing messages. Classes implementing this interface are responsible for supplying different types of messages.

### 2. `EmailMessageService` Class

The `EmailMessageService` class is a low-level module that implements the `MessageProvider` interface. It provides email messages.

### 3. `SMSTextService` Class

The `SMSTextService` class is another low-level module implementing the `MessageProvider` interface. It provides text messages.

### 4. `MessageSender` Class

The `MessageSender` class is a high-level module that depends on the `MessageProvider` abstraction. It uses constructor injection to receive a `MessageProvider` and sends messages without knowing the specific implementation details.

## Applying Dependency Inversion Principle

In this example, the Dependency Inversion Principle is applied as follows:

1. **Abstraction (`MessageProvider`):** An abstraction is introduced to define the capability of providing messages. Both high-level and low-level modules depend on this abstraction.

2. **Low-Level Modules (`EmailMessageService`, `SMSTextService`):** These modules implement the `MessageProvider` interface, providing specific types of messages. They depend on the abstraction.

3. **High-Level Module (`MessageSender`):** This module depends on the `MessageProvider` abstraction. It receives a `MessageProvider` through constructor injection, adhering to the Dependency Inversion Principle.

## Example Usage

The `DIPApplication` class demonstrates the usage of different message providers and the `MessageSender` class. It creates instances of `EmailMessageService` and `TextMessageService` and injects them into `MessageSender` to send messages.

## Conclusion

By adhering to the Dependency Inversion Principle, this project promotes a flexible and extensible design. The high-level module (`MessageSender`) can work with different message providers without being tightly coupled to their implementations.
