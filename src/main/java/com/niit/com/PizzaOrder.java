package com.niit.com;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        // initialize scanner class
        Scanner Scanner = new Scanner(System.in);

        // prompt the customer name
        String customerName = input.nextLine();

        // prompt the customer email
        String customerEmail = input.nextline();

        // prompt the customer phone number
        long phoneNumber = input.nextLong();

        // prompt the customer address
        String address = input.nextLine();

        input.nextLine();

          float pizzaPrice = 12.99f;

          char pizzaSize = 'M';

          float garlicBread = 5.99f;

          float beveragePrice = 1.99f;

          int number = input.nextInt();
          switch (number) {
              case 1: {
                  System.out.println("please enter the number of pizza, you want to order :");
                  int first = input.nextInt();

                  float finalOne = first * pizzaPrice;
                  System.out.println("your total pizza bill : $ " + finalOne);
              }
              break;

              case 2: {
                  System.out.println("please enter the number of garlic braed you want to order :");
                  int second = input.nextInt();

                  {
                      float finalTwo = second * garlicBread;
                      System.out.println("your total garlic bread bill : $" + finalTwo);
                  }

              }
              break;

              case 3: {

              }

          }









    }
}
