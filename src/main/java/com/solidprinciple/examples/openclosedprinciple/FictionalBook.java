package com.solidprinciple.examples.openclosedprinciple;

public class FictionalBook implements DiscountCalculator{
    @Override
    public double calculateDiscount(double price) {
        // 10% discount for fiction books
        return price * 0.1;
    }
}
