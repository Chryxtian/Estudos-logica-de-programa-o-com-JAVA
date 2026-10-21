package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class aula05dowile {
    public static void main (String[] args){
        int desejaContinuar = 1;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.println("PLAYER 1: Digite um numero de 1 a 10");
            int num1 = keyboard.nextInt();
            System.out.println("PLAYER 2: Digite um numero de 1 a 10");
            int num2 = keyboard.nextInt();
            System.out.println("Acertou ?" +(num1== num2));
            System.out.println("Deseja continuar jogando ?");
            System.out.println("1.SIM");
            System.out.println("2.NAO");
            desejaContinuar = keyboard.nextInt();
        }while (desejaContinuar == 1);
    }
}
