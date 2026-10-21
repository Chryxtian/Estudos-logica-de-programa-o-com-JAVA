package academy.devdojo.variaveis;

public class ReutilizandoSalario {
    public static void main (String[] args){
        double salario = 2500.00, p1 = 30, p2 = 15, p3 = 5, resultado;

        resultado = salario * p1 /100;
        System.out.println("o valor de 30% de 2.500 e: " +resultado);



        resultado = salario * p2 /100;
        System.out.println("o valor de 15% de 2.500 e: " +resultado);



        resultado = salario * p3 /100;
        System.out.println("o valor de 5% de 2.500 e: " +resultado);
    }
}
