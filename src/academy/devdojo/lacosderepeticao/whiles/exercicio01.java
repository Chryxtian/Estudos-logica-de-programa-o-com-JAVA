package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class exercicio01 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int resp, i = 0 ;

        System.out.println("Digite um valor");
        resp = keyboard.nextInt();

        while ( i < resp){
            if ( i % 2 != 0){
                System.out.println(+i);

        }   i = i + 1;
    }
}
}
