package org.experis.snack1;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        //Inizializzo lo scanner
        Scanner scan = new Scanner(System.in);

        //variabile booleana
        boolean valid= false;

        //ciclo per chiedere all'utente
        while(!valid){
            System.out.println("Inserisci un numero pari fra 10 e 20:");
            int numberUser = scan.nextInt();;
            if(numberUser >= 10 && numberUser <=20){
                valid = true;
            }
            if(valid){
                System.out.println("Ottimo lavoro!");
            }
        }

        //Chiudo lo scanner
        scan.close();
    }
}
