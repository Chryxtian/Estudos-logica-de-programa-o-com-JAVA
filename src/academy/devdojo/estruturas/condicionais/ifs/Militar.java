package academy.devdojo.estruturas.condicionais.ifs;

import java.util.Scanner;

public class Militar {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        String  name;
        char resp, sex;
        int age;

        System.out.println("Digite o seu nome: ");
        name = keyboard.next();

        System.out.println("Digite seu sexo: (M/F)");
        sex = Character.toUpperCase(keyboard.next().charAt(0));

        System.out.println("Digite sua idade: ");
        age = keyboard.nextInt();

// string usa equals, char usa ==
        if (sex == 'M' && age >= 18){
            System.out.println("Alistamento obrigatotio, " +name);

        }else if ( sex == 'M' && age < 18){
            System.out.println("Alistamento nao permitido, " +name);

        }else if (sex == 'F' && age >= 18){
            System.out.println("Deseja se alistar ? (S/N) ");
            resp = Character.toUpperCase( keyboard.next().charAt(0));

            if (resp == 'S'){

                System.out.println("Alistamento realizado.");
            } else {
                System.out.println("Alistamento cancelado.");

        }



    } else {
            System.out.println("Alistamento nao permitido.");
        }
}}
