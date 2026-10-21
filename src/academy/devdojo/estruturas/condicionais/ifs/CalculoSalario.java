package academy.devdojo.estruturas.condicionais.ifs;

public class CalculoSalario {
    public static void main (String[] args) {

        double payment = 4750;
        double result;
        double off = 0;

        if (payment >= 4500){
            result = payment * 0.3 ;
            off = 30;

        } else {
            result = payment * 0.15;
            off = 15;

        }
        System.out.println(" o resultado e R$" +result+ " com a porcentagem de " +off+"%");
    }
}
