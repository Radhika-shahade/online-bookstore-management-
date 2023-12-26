package com.solidprinciple.examples.openclosedprinciple;

public class OCPApplication {
    public static void main(String[] args) {
        // Create a fiction book
        Book fictionBook = new Book("The Adventure", 24.99);

        // Create a non-fiction book
        Book nonFictionBook = new Book("Science Explained", 39.99);

        // Create discount calculators
        DiscountCalculator fictionBookDiscountCalculator = new FictionalBook();
        DiscountCalculator nonFictionBookDiscountCalculator = new NonFictionalBook();

        // Create book store instances with different discount calculators
        BookStore fictionBookStore = new BookStore(fictionBookDiscountCalculator);
        BookStore nonFictionBookStore = new BookStore(nonFictionBookDiscountCalculator);

        // Calculate and display discounted prices
        System.out.println("Original Fictional Book detail "+ "Name: "+ fictionBook.getTitle() + ", Price: $"+fictionBook.getPrice());
        System.out.println("Discounted Fictional Book detail "+ "Name: "+fictionBook.getTitle()+ ", Price: $"+ fictionBookStore.calculateDiscountedPrice(fictionBook));

        System.out.println("Original Non-Fictional Book detail"+ "Name: "+ nonFictionBook.getTitle()+ ", Price: $"+ nonFictionBook.getPrice());
        System.out.println("Discounted Non-Fictional Book detail" + "Name: "+ nonFictionBook.getTitle()+ ", Price: $" + nonFictionBookStore.calculateDiscountedPrice(nonFictionBook));
    }
    }



