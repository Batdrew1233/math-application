package com.plurasight;

public class MathApp {
    public static void main(String[] args) {
        // Calculating Highest Salary
        int bobSalary = 52854;
        int garySalary = 62812;
        int highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is $" + highestSalary );

        // Display smallest of two prices
        int carPrice = 21000;
        int truckPrice = 28000;
        int smallestPrice = Math.min(carPrice,truckPrice);
        System.out.println("The smallest price is $" + smallestPrice);

        // Area of circle
        double radius = 7.25;
        double circleArea = (Math.PI * Math.pow(radius,2));
        System.out.println("The area of a circle is " + Math.round(circleArea * 100.0)/100.0);

        // Square root
        double number1 = 5.0;
        double squareRoot = Math.sqrt(number1);
        System.out.println("The square root of 5.0 is: " + Math.round(squareRoot *100.0)/100.0);




    }
}
