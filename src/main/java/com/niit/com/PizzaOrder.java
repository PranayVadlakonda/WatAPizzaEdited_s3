package com.niit.com;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        // initialize scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt the customer name
        String customerName = scanner.nextLine();

        // prompt the customer email
        String customerEmail = scanner.nextLine();

        // prompt the customer phone number
        long phoneNumber = scanner.nextLong();

        // prompt the customer address
        String address = scanner.nextLine();

        scanner.nextLine();

          float pizzaPrice = 12.99f;

          char pizzaSize = 'M';

          float garlicBread = 5.99f;

          float beveragePrice = 1.99f;

          int number = scanner.nextInt();
          switch (number) {
              case 1: {
                  System.out.println("please enter the number of pizza, you want to order :");
                  int first = scanner.nextInt();

                  float finalOne = first * pizzaPrice;
                  System.out.println("your total pizza bill : $ " + finalOne);
              }
              break;

              case 2: {
                  System.out.println("please enter the number of garlic braed you want to order :");
                  int second = scanner.nextInt();

                  {
                      float finalTwo = second * garlicBread;
                      System.out.println("your total garlic bread bill : $" + finalTwo);
                  }

              }
              break;

              case 3: {
                  System.out.println("please enter the number of beverages you want to order : ");
                  int third = scanner.nextInt();

                  {
                      float finalThree = third * beveragePrice;
                      System.out.println("your total beverage bill : $" + finalThree);
                  }


              }
              break;

          }









    }
}
