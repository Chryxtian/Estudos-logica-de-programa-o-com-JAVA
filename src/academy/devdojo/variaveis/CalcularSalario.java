package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalcularSalario {
    public static void main (String[] args){
        float salario, porcentagem, resultado;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        salario = keyboard.nextFloat();

        System.out.println("Digite a porcentagem: ");
        porcentagem = keyboard.nextInt();



        resultado = (salario * porcentagem ) / 100;
    System.out.println("O valor de " + porcentagem + "% de " + salario + " sera de : " +resultado);

    }
}
