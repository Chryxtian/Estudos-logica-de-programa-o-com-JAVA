package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class exercicio2menu {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        int option = 0;


        while ( option != 3 ) {
            System.out.println("[1] Calcular imposto");
            System.out.println("[2] Depositar salario");
            System.out.println("[3] Sair");
            option = keyboard.nextInt();
        }


        switch (option){

            case 1:

                break;

            case 2:

                break;

            case 3:

                break;
        }

    }
}
