package com.solidprinciple.examples.openclosedprinciple;

public class BookStore {
    private DiscountCalculator discountCalculator;

    public BookStore(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }

    public double calculateDiscountedPrice(Book book) {
        double discount = discountCalculator.calculateDiscount(book.getPrice());
        return book.getPrice() - discount;
    }
}
