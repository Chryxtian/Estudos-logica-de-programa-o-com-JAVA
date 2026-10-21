package academy.devdojo.estruturas.condicionais.ifs;

import java.util.Scanner;

public class CadastroUsuario {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite seu nome de usuario");
        String user = keyboard.next();

// string se usa equals para comparar

        if (user == null || user.equals("")){
            System.out.println("Usuario invalido");

          //equals ignorecase ignora maiusculo minusculo

        } else if (user.equalsIgnoreCase("admin") || user.equalsIgnoreCase("administrador")){
            System.out.println("Usuario invalido");

        }else {
            System.out.println("Usuario cadastrado com sucesso, bem vindo " +user);
        }
    }
}
