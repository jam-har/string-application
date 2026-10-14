package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String car = "The price of ";
        double carPrice = 30584.98;
        int quantity = 2;
        double carTotal = carPrice * quantity;
        System.out.println(car + quantity + " new cars is $" + carTotal + ".");
    }
}
