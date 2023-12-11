package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many products in the store? ");
        int storeSize = Integer.parseInt(scan.nextLine());
        Product [] products = new Product[storeSize];

            for (int i = 0; i < products.length; i++) {
                System.out.println("Products " + (i + 1));
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Description: ");
                String description = scan.nextLine();
                System.out.print("Price: ");
                String price = scan.nextLine();
                BigDecimal bigDecimalPrice = new BigDecimal(price);
                System.out.print("Inserisci l'Iva: ");
                String iva = scan.nextLine();
                int ivaInt = Integer.parseInt(iva);
                BigDecimal bigDecimalIva = new BigDecimal(price);


                Product carello = new Product(name, description, bigDecimalPrice, bigDecimalIva);
                products[i] = carello;
            }







        scan.close();
    }
}
