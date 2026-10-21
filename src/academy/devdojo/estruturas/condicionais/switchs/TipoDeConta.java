package academy.devdojo.estruturas.condicionais.switchs;

import java.util.Scanner;

public class TipoDeConta {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        int TypeAccount;

        System.out.println("Qual tipo de conta deseja abrir ?");
        System.out.println("[1] Conta Poupança.");
        System.out.println("[2] Conta Corrente.");
        System.out.println("[3] Conta Investimento.");

        TypeAccount = keyboard.nextInt();

        switch (TypeAccount){

            case 1:
                System.out.println("A conta poupança oferece 5% de juros.");
                break;

            case 2:
                System.out.println("A conta corrente oferece 2% de juros.");
                break;

            case 3:
                System.out.println("A conta investimento oferece 1% de juros.");
                break;

            default:
                System.out.println("invalido");
                break;
        }


    }
}
