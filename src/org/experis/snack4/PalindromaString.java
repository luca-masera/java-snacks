package org.experis.snack4;

import java.util.Scanner;

public class PalindromaString {
    public static void main(String[] args) {
        //inizializzo lo scanner
        Scanner scan = new Scanner(System.in);
        //chiedo una parola
        System.out.println("Inserisci una parola:");
        //salvo la parola in una variabile
        String parola = scan.nextLine();
        //variabile booleana
        boolean palindroma = true;
        //ciclo sulla parola
        for (int i = 0; i < parola.length() / 2; i++) {
            if (parola.charAt(i) != parola.charAt(parola.length() -1-i)){
                palindroma = false;
                break;
            }
        }
        //controllo
        if(palindroma){
            System.out.println("La parola è palindroma!");
        }else{
            System.out.println("La parola non è palindroma!");
        }
        scan.close();
    }
}
