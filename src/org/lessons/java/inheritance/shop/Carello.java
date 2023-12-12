package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <Product> carello = new ArrayList<>();

        /* boolean stop = false;
        while(!stop){
            System.out.println("Insert new product?(yes/no)");
            String answer = scan.nextLine();
            switch (answer){
                case "yes":
                    String type;
                    System.out.println("What type of product do you want to insert? (tv, smartphone, cuffie)");
                    type = scan.nextLine();

                    if(type.equalsIgnoreCase("tv")) {
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
                        System.out.println("Quanti pollici e` la TV");
                        String pollici = scan.nextLine();
                        int polliciInt = Integer.parseInt(pollici);
                        System.out.println("E` una smart tv? (yes/no)");
                        String userInput = scan.nextLine();
                        boolean smart;
                        if (userInput.equalsIgnoreCase("yes")){
                           smart =true ;
                        } else {
                            smart = false;
                        }

                        Tv tv = new Tv(name,description,bigDecimalPrice,bigDecimalIva, polliciInt, smart);
                        carello.add(tv);


                    } else if(type.equalsIgnoreCase("smartphone")) {
                        System.out.print("Name: ");
                        String name = scan.nextLine();
                        System.out.print("Description: ");
                        String description = scan.nextLine();
                        System.out.print("Price: ");
                        String price = scan.nextLine();
                        BigDecimal bigDecimalPrice = new BigDecimal(price);
                        System.out.print("Inserisci l'Iva: ");
                        String iva = scan.nextLine();
                        BigDecimal bigDecimalIva = new BigDecimal(price);
                        System.out.println("Inserisci la memoria del dispositivo");
                        String memory = scan.nextLine();
                        int memoryInt = Integer.parseInt(memory);

                        Smartphone smartphone = new Smartphone(name,description,bigDecimalPrice,bigDecimalIva, memoryInt);
                        carello.add(smartphone);

                    } else if(type.equalsIgnoreCase("cuffie")) {
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
                        System.out.println("Di che colore sono le cuffie?");
                        String color = scan.nextLine();
                        System.out.println("Le cuffie sono cablate? (yes/no)");
                        String isCable = scan.nextLine();
                        boolean cablate;
                        if (isCable.equalsIgnoreCase("yes")){
                            cablate =true ;
                        } else {
                            cablate = false;
                        }

                        Cuffie cuffie =new Cuffie(name, description, bigDecimalPrice,bigDecimalIva,color,cablate);
                        carello.add(cuffie);

                    } else {
                        System.out.println("The product name does not match the chosen type of product");
                    }
                    break;
                case "no":
                    stop = true;
                    break;
                default:
                    System.out.println("invalid answer");
                    break;
            }
        }



        System.out.println(carello.toString());

         */
        boolean stop = false;
        while(!stop){
            System.out.println("Insert new product?(yes/no)");
            String answer = scan.nextLine();
            switch (answer){
                case "yes":
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
                    String type;
                    System.out.println("What type of product do you want to insert? (tv, smartphone, cuffie)");
                    type = scan.nextLine();

                    if(type.equalsIgnoreCase("tv")) {
                        System.out.println("Quanti pollici e` la TV");
                        String pollici = scan.nextLine();
                        int polliciInt = Integer.parseInt(pollici);
                        System.out.println("E` una smart tv? (yes/no)");
                        String userInput = scan.nextLine();
                        boolean smart;
                        if (userInput.equalsIgnoreCase("yes")){
                            smart =true ;
                        } else {
                            smart = false;
                        }

                        Tv tv = new Tv(name,description,bigDecimalPrice,bigDecimalIva, polliciInt, smart);
                        carello.add(tv);


                    } else if(type.equalsIgnoreCase("smartphone")) {
                        System.out.println("Inserisci la memoria del dispositivo");
                        String memory = scan.nextLine();
                        int memoryInt = Integer.parseInt(memory);

                        Smartphone smartphone = new Smartphone(name,description,bigDecimalPrice,bigDecimalIva, memoryInt);
                        carello.add(smartphone);

                    } else if(type.equalsIgnoreCase("cuffie")) {
                        System.out.println("Di che colore sono le cuffie?");
                        String color = scan.nextLine();
                        System.out.println("Le cuffie sono cablate? (yes/no)");
                        String isCable = scan.nextLine();
                        boolean cablate;
                        if (isCable.equalsIgnoreCase("yes")){
                            cablate =true ;
                        } else {
                            cablate = false;
                        }

                        Cuffie cuffie =new Cuffie(name, description, bigDecimalPrice,bigDecimalIva,color,cablate);
                        carello.add(cuffie);

                    } else {
                        System.out.println("The product name does not match the chosen type of product");
                    }
                    break;
                case "no":
                    stop = true;
                    break;
                default:
                    System.out.println("invalid answer");
                    break;
            }
        }


        for (int i = 0; i < carello.size() ; i++) {
            System.out.println(carello.toString());
            for (int j = 0; j < 50; j++) {
                System.out.print("-");
            }
            System.out.println();
        }








        scan.close();
    }
}
