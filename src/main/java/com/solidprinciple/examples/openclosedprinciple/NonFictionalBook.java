package com.solidprinciple.examples.openclosedprinciple;

public class NonFictionalBook implements DiscountCalculator{
    @Override
    public double calculateDiscount(double price) {
        // 15% discount for non-fiction books
        return price * 0.15;
    }
}
