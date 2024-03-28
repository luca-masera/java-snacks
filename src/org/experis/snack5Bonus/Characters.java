package org.experis.snack5Bonus;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        //inizializzo lo scanner
        Scanner scan = new Scanner(System.in);

        //chiedo una frase e la salvo in una variabile
        System.out.println("Scrivi una frase:");
        String frase = scan.nextLine();

        //dichiaro le tre variabili
        int lettere = 0;
        int numeri = 0;
        int simboli = 0;

        //ciclo per andare a sommare le variabili
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)){
                lettere++;
            } else if (Character.isDigit(c)) {
                numeri++;
            } else {
                simboli++;
            }
        }

        //risultati

        System.out.println("I caratteri letterari sono:" + lettere);
        System.out.println("I caratteri numerici sono:" + numeri);
        System.out.println("I caratteri simboli sono:" + simboli);

        //chiudo lo scanner
        scan.close();
    }
}
