package academy.devdojo.variaveis;

import java.util.Scanner;

public class ReceberDadosTeclados {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = teclado.next();
        System.out.println("digite sua idade");
        int idade = teclado.nextInt();
        System.out.println("nome digitado foi: " +nome);
        System.out.println("idade digitada foi: " +idade);
    }
}
