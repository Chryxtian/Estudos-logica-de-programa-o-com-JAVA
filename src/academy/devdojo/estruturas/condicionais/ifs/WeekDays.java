package academy.devdojo.estruturas.condicionais.ifs;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number;
        String day;

        System.out.println("Digite o numero: ");
        number = keyboard.nextInt();

        if (number == 1){
            System.out.println("Segunda-feira.");
        }else if (number == 2){
            System.out.println("Terça-feira.");
        }else if (number == 3){
            System.out.println("Quarta-feira.");
        } else if (number == 4) {
            System.out.println("Quinta-feira.");
        } else if (number == 5) {
            System.out.println("Sexta-feira.");
        }else if (number == 6){
            System.out.println("Sabado.");
        } else if (number == 7) {
            System.out.println("Domingo.");
        }
    }
}
