package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Entrer une valeur en VOLT: ");
         int valeurVolte=scanner.nextInt();

         String valeurBinaire=Integer.toBinaryString(valeurVolte);

        System.out.println("La valeur"+valeurVolte+"en binaire est "+valeurBinaire);



    }
}