package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class exercicogpt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double [] notas = new double[5];
        String [] names = new String[5];
        double soma = 0, avg;
        int abaixo = 0;

        System.out.println("Digite o nome e nota do aluno: ");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nome " +(i+1)+ "º aluno:");
            names[i] = keyboard.next();
            for (int j = 0; j < notas.length; j++) {
                System.out.print(+ (j+1)+ "ª nota: ");
                notas[j] = keyboard.nextDouble();

                soma = soma + notas[i];

                if (notas[j] < 5 ){
                    abaixo = abaixo + 1;
                }

            }


        }
        avg = soma/25;
        System.out.println("A media da turma foi: " +avg+ " e " +abaixo+ " notas abaixo da media" );

    }
}
