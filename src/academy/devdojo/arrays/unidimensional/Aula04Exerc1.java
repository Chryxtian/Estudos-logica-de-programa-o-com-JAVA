package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula04Exerc1 {
    public static void main(String[] args) {
        
        int [] v1 = new int [5];
        int [] v2 = new int [5];
        int [] vr = new int [5];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite os valores de v1 e v2");

        for (int i = 0; i < v1.length; i++) {

            v1[i] = keyboard.nextInt();


        }

        for (int j = 0; j < v2.length; j++) {

            v2[j] = keyboard.nextInt();

        }
        for (int i = 0; i < v1.length; i++) {
            System.out.println("os valores de v1 sao: " +v1[i]);

    }
        for (int j = 0; j < v2.length; j++) {
            System.out.println("os valores de v2 sao: " +v2[j]);

        }

        for (int i = 0; i < vr.length; i++) {

            vr[i] = v1[i] * v2[i];

            System.out.println("a multiplicacao de "+v1[i]+ " e "+ v2[i]+ ": " +vr[i]);

        }
}}
