package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class aula04login {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        String correctuser = "chrys";
        String correctpass = "abcd";
        boolean showScreenLog = true;

        while (showScreenLog){

        System.out.println("Digite seu usuario");
        String user = keyboard.nextLine();

        System.out.println("Digite a senha");
        String password = keyboard.nextLine();



        if (correctuser.equals(user) && correctpass.equals(password)){
            showScreenLog = false;
            System.out.println("ACESSO CONCEDIDO ");
            break;
        }
            System.out.println("ACESSO NEGADO");
        }
    }
}
