package com.kodluyoruz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /**
     * This is the main class for the application, interacting
     * with the customer, adding to the cart different products to
     * be purchased and finally calculating the total amount to be paid
     */

    /**
     * Allows a cashier to enter the details for a product
     * to be purchased by a customer
     * @param cart the shopping cart of a given customer
     */
    public static void askCustomer(Cart cart) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter 1 to buy a product\n" +
                    "Enter 0 to checkout and proceed with the payment");
            int user = in.nextInt();
            in.nextLine();
            if (user == 0) {
                System.out.println(cart.toString());
                System.out.println("In total you have to pay " + cart.totalPrice() + "TL");
                break;
            }else{
                System.out.println("Product name: ");
                String pName = in.nextLine();

                System.out.println("Seller: ");
                String seller = in.nextLine();

                System.out.println("The product or products price: ");
                double price = in.nextDouble();
                in.nextLine();

                System.out.println("How many?");
                int numberOfProduct = in.nextInt();

                System.out.println("Discount (enter 0 if no discount applies): ");
                double userDiscount = in.nextDouble();
                in.nextLine();

                System.out.println("Does Buy2Take3 apply? Y/N");
                String userBuy = in.nextLine();

                Product product = new Product(seller,pName,price);

                if (userDiscount > 0 && userBuy.equals("y")) {
                    System.out.println("Please choose one option!");
                }

                if (userDiscount != 0 && userBuy.equals("n")) {
                    Product p = new DiscountedProduct(product, userDiscount);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }

                if (userBuy.equals("y") && (userDiscount == 0)) {
                    Product p = new Buy2Take3Product(product);
                    cart.addProduct(p, numberOfProduct);
                    continue;
                }

                cart.addProduct(product, numberOfProduct);
            }
        }
            }


            // Code to read from console the product name, seller,
            // price, number of products, discount and
            // if Buy2Take3 applies.
            // Then create a product of the correct type
            // and add it to the shopping cart


        // Main method to interact with a customer
        public static void main (String[]args){
            System.out.println("Welcome to kodluyoruz shop");
            System.out.println("What’s your name? ");
            Scanner scanner = new Scanner(System.in);
            String customer = scanner.nextLine();
            System.out.println("Hi " + customer + ". Please choose one of the following options:");
            System.out.print(" ");
            Cart cart = new Cart();
            askCustomer(cart);
    }




        //Implement the user interface here
        // Ask the user to choose 0 (buy product) or
        // 1 (checkout), depending on what they want to do.
        // Use the method askCustomer
    }

