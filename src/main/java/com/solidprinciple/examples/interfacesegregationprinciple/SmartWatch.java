package com.solidprinciple.examples.interfacesegregationprinciple;

public class SmartWatch implements BasicFunctionality, AdvancedFunctionality{
    @Override
    public void turnOn() {
        System.out.println("Smartwatch is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartwatch is turned off");
    }

    @Override
    public void performAction() {
        System.out.println("Smartwatch performs a basic action");
    }
    @Override
    public void connectToWiFi() {
        System.out.println("Smartwatch is connected to WiFi");
    }

    @Override
    public void performAdvancedAction() {
        System.out.println("Smartwatch performs an advanced action");
    }


}
