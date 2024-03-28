package org.experis.snack2;

import java.util.Random;

public class NameSurname {
    public static void main(String[] args) {
        //creo lista nomi e cognomi
        String[] name = {"Andrea", "Francesco", "Massimo", "Ugo"};
        String[] surname = {"Roa", "MacKen", "Gangata", "Toro"};
        Random random = new Random();

        //4 invitati
        for (int i = 0; i < 4; i++) {
            String casualName = name[random.nextInt(name.length)];
            String casualSurname = surname[random.nextInt(surname.length)];
            System.out.println(casualName + " " + casualSurname);
            }
    }
}
