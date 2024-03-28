package org.experis.snack3;

public class ArrayNumber {
    public static void main(String[] args) {

        //creo array
        int [] numberArray = {5, 30, 45, 34, 2, 3, 56, 100, 8, 3};

        //variabile che andrò a implementare con la somma dei numeri in posizione dispari
        int position = 0;

        // ciclo l'array
        for (int i = 0; i < numberArray.length; i++) {

            //verifico quali numeri sono in posizione dispari
            if (i % 2 != 0){
                //sommo i numeri in posizione dispari
                position += numberArray[i];
            }
        }
        //stampo la somma
        System.out.println("La somma dei numeri che hanno una posizione dispari è:" + position);
    }
}
