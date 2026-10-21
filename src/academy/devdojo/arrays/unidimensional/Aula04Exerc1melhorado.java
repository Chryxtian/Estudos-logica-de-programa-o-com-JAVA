package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula04Exerc1melhorado {
    public static void main(String[] args) {
        
        int [] v1 = new int [5];
        int [] v2 = new int [5];
        int [] vr = new int [5];

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite os valores de v1 e v2");

        for (int i = 0; i < v1.length; i++) {

            System.out.println("vetor 1, posição " +i+ ": ");
            v1[i] = keyboard.nextInt();

            System.out.println("vetor 2, posição " +i+ ": ");
            v2[i] = keyboard.nextInt();



            
        }
        for (int i = 0; i < vr.length; i++) {
            System.out.println("multiplicação do vetor 1, posição " +i+ " e do vetor 2, posição " +i+ ": ");
            vr[i] = v1[i] * v2[i];
            System.out.println(vr[i]);
        }


}}
