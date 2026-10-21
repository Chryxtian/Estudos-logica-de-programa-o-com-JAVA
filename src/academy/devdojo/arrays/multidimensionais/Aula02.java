package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        int [][] arrayMult2 = new int[2][3];
        Scanner keyboard = new Scanner(System.in);

//        arrayMult2[0][0] = 22;
//        arrayMult2[0][1] = 11;
//        arrayMult2[0][2] = 54;
//        arrayMult2[1][0] = 44;
//        arrayMult2[1][1] = 55;
//        arrayMult2[1][2] = 76;

        for (int i = 0; i < arrayMult2.length; i++) {
            for (int j = 0; j < arrayMult2[i].length; j++) {
                System.out.println("Digite o valor da posição ["+i+"] ["+j+"]");
                arrayMult2 [i][j]= keyboard.nextInt();

            }

        }
        for (int i = 0; i < arrayMult2.length; i++) {
            for (int j = 0; j < arrayMult2[i].length; j++) {
                System.out.println("["+i+"] ["+j+"]  = "+arrayMult2[i][j]);
            }

        }



    }
}
