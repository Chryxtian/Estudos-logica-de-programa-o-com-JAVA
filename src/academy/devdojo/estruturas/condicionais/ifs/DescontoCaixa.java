package academy.devdojo.estruturas.condicionais.ifs;

import java.util.Scanner;

public class DescontoCaixa {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o valor da compra");

        double purchase = keyboard.nextDouble();
        double off = 10;
        double finalPrice ;
        double finalOff = 0;

            if (purchase >= 100){

                finalOff = purchase * off / 100;
                finalPrice = purchase - finalOff;

                System.out.println("A compra tem um desconto de " +finalOff);
                System.out.println("O valor final da compra e R$"+finalPrice);
            }
            else{
                System.out.println("Nao ha desconto em compras abaixo de R$100.");
                System.out.println("Valor final R$"+purchase);
            }
    }
}
