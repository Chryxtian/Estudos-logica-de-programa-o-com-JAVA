package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class exercicioCalculoMatrizes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int result = 1;

//        matriz [0][0] = 2;
//        matriz [0][1] = 5;
//        matriz [0][2] = 8;
//        matriz [0][3] = 45;
//        matriz [1][0] = 85;
//        matriz [1][1] = 36;
//        matriz [1][2] = 24;
//        matriz [1][3] = 12;
//        matriz [2][0] = 47;
//        matriz [2][1] = 16;
//        matriz [2][2] = 49;
//        matriz [2][3] = 74;
//        matriz [3][0] = 32;
//        matriz [3][1] = 25;
//        matriz [3][2] = 14;
//        matriz [3][3] = 59;


        System.out.println("digite os valores");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("posição [" +i+ "]"+ "["+j+"]");

                matriz [i][j]= keyboard.nextInt();

                if(i==j){
                   result = result*matriz[i][j];
                }
            }

        }

//        System.out.println("a multiplicação da diagonal principal e: " +matriz[0][0] * +matriz[1][1] * +matriz[2][2] *+matriz[3][3]   );
        System.out.println(+result);

    }
}
