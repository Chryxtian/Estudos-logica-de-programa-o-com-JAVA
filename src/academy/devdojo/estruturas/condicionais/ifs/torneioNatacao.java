package academy.devdojo.estruturas.condicionais.ifs;

import java.util.Scanner;


public class torneioNatacao {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = keyboard.next();
        System.out.println("Digite sua idade");
        int age = keyboard.nextInt();



        if (age <= 10){
            System.out.println(nome + " PARTICIPARA DA CATEGORIA INFANTIL ");

        }else if (age >= 11 &&  age <= 15){
            System.out.println(nome + " PARTICIPARA DA CATEGORIA JUVENIL ");

        } else if (age >= 16 && age <= 19){
            System.out.println(nome + " PARTICIPARA DA CATEGORIA PRE-ADULTO ");

        } else  {
            System.out.println(nome + " PARTICIPARA DA CATEGORIA ADULTO " );
        }
    }
}
