package com.solidprinciple.examples.interfacesegregationprinciple;

public class BasicAlarmClock implements BasicFunctionality{
    @Override
    public void turnOn() {
        System.out.println("BasicAlarmClock is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("BasicAlarmClock is turned off");
    }

    @Override
    public void performAction() {
        System.out.println("BasicAlarmClock performs a basic action");
    }
}
