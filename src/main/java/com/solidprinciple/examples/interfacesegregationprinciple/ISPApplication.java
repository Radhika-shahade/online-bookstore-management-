package com.solidprinciple.examples.interfacesegregationprinciple;

public class ISPApplication {
    public static void main(String[] args) {
        BasicAlarmClock basicAlarmClock = new BasicAlarmClock();
        basicAlarmClock.turnOn();
        basicAlarmClock.performAction();

        SmartWatch smartWatch = new SmartWatch();
        smartWatch.turnOn();
        smartWatch.performAction();
        smartWatch.connectToWiFi();
        smartWatch.performAdvancedAction();
    }

}
