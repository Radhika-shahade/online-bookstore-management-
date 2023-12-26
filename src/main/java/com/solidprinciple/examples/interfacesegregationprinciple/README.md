# Interface Segregation Principle Example: Device Functionality

## Overview

This example illustrates the application of the Interface Segregation Principle (ISP) in a Java-based system managing various devices. ISP emphasizes that a class should not be forced to implement interfaces it does not use, promoting a design where clients are not forced to depend on interfaces they do not need.

## Classes

### 1. `BasicDevice` Interface

Defines basic functionalities common to all devices:

- `turnOn()`: Turns on the device.
- `turnOff()`: Turns off the device.
- `performAction()`: Performs a basic action on the device.

### 2. `AdvancedDevice` Interface

Includes advanced functionalities specific to some devices:

- `connectToWiFi()`: Connects the device to WiFi.
- `performAdvancedAction()`: Performs an advanced action on the device.

### 3. `SimpleSwitch` Class

Represents a simple switch, implementing only the `BasicDevice` interface:

- `turnOn()`
- `turnOff()`
- `performAction()`

### 4. `SmartWatch` Class

Represents a smartwatch, implementing both `BasicDevice` and `AdvancedDevice` interfaces:

- `turnOn()`
- `turnOff()`
- `performAction()`
- `connectToWiFi()`
- `performAdvancedAction()`

## Applying the Interface Segregation Principle

In this example:

- The `SimpleSwitch` class implements only the `BasicDevice` interface, ensuring that basic devices are not burdened with unnecessary advanced functionalities.

- The `SmartWatch` class implements both `BasicDevice` and `AdvancedDevice` interfaces, providing a comprehensive interface for devices with advanced capabilities.

## Example Usage

The `Main` class demonstrates the usage of the implemented classes by creating instances of a simple switch and a smartwatch, and invoking their respective methods.

## Conclusion

By adhering to the Interface Segregation Principle, this example promotes a more modular and flexible design, allowing classes to depend only on the interfaces they actually use.

