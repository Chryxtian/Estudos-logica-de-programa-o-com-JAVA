package academy.devdojo.estruturas.condicionais.ifs;

public class impostoRenda {
    public static void main(String[] args) {

        double salarium = 4520;

        if (salarium <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salarium >= 1903.99 && salarium <= 2826.65) {
            System.out.println("7,5% de imposto a pagar: R$"+salarium * 0.075);

        }else if (salarium >= 2826.66 && salarium <= 3751.05) {
            System.out.println("15% de imposto a pagar: R$"+salarium * 0.15);

        } else if (salarium >= 3751.06 && salarium <= 4664.68) {
            System.out.println("22,5% de imposto a pagar: R$"+salarium * 0.225);

        } else {
            System.out.println("27,5% de imposto a pagar: R$"+salarium * 0.275);

        }
    }
}