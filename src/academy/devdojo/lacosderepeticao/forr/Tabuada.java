package academy.devdojo.lacosderepeticao.forr;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        String resp;
        int t;
        Scanner keyboard = new Scanner(System.in);



        do {
            System.out.println("Qual tabuada deseja saber ?");
            t = keyboard.nextInt();

            for (int i = 1; i <= 10; i++) {

                System.out.println(t + " x " + i + " = " + (t * i));


            }
            System.out.println("deseja repetir ? [s/n]");
            resp = keyboard.next();


            if (resp.equalsIgnoreCase("n")) {
                System.out.println("Programa encerrado.");

            }
        }while (resp.equalsIgnoreCase("s")) ;
}}