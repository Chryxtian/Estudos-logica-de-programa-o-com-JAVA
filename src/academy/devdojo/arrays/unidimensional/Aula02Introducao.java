package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula02Introducao {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double [] notas = new double[4];

        String resp = "s";
        double avg = 0, soma = 0, quantalunos = 0;


        do {


        for (int i = 0; i < notas.length; i++) {
        System.out.println("Digite a " +(i+1) +"ª nota" );
            notas[i] = keyboard.nextDouble();


        }
        System.out.println("NOTAS");
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
            avg = soma / 4;
            System.out.println("Nota " + (i+1) + ": " +notas[i]);


            if (notas[i] < 5){
                System.out.println("reprovado");
            } else {
                System.out.println("Aprovado");
            }

    }



            System.out.println("soma das notas: " +soma);
            System.out.println("Media das notas: " +avg);

        System.out.println("registrar novas notas? (s/n)");
            resp = keyboard.next();


        }while (resp.equals("s") );

}}
