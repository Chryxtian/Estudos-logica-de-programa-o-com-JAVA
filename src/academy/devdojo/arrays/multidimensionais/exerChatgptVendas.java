package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

//Uma loja tem 3 vendedores, e cada vendedor registra as vendas durante 4 dias.
//Crie uma matriz double[3][4], em que cada linha representa um vendedor e cada coluna, um dia. Peça os valores ao usuário e depois:
//1. Mostre a soma das vendas de cada vendedor.
//2. Calcule a média de vendas por dia de cada vendedor.
//3. Descubra qual vendedor teve a maior venda total.
//4. Calcule o total vendido por todos os vendedores.


public class exerChatgptVendas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double [][] vendas = new double[3][4];
        String [] vendedor = new String [3];
        double  [] mediaVendas = new double[3];
        double  soma = 0;
        double maiorTotal = -1;
        int indiceMaiorVendedor = 0;

        for (int i = 0; i < vendedor.length; i++) {
            System.out.println("Nome do vendedor: ");
            vendedor [i] = keyboard.next();

            soma=0;


            for (int j = 0; j < vendas[i].length; j++) {
                System.out.println("Venda do "+(j+1)+"º dia: ");
                vendas[i][j] = keyboard.nextDouble();

                soma = soma + vendas[i][j];

                //guarda a soma a venda total de cada vendedor

            }

            if (soma > maiorTotal){
                maiorTotal = soma;
                indiceMaiorVendedor = i;

                // para calcular quem vendeu mais
                // i guarda a posição do vendedor atual
            }

                mediaVendas[i] = soma / vendas[i].length;

                //calcula a media individual de vendas dos 4 dias


        }
        for (int i = 0; i < vendedor.length ; i++) {
            System.out.println("Media diaria de " +vendedor[i]+ ": " +mediaVendas[i]);

        }


        System.out.println("Vendedor com maior total: " +vendedor[indiceMaiorVendedor]);
        System.out.println("Total vendido: " +maiorTotal);



    }
}
