package academy.devdojo.estruturas.condicionais.ifs;

public class CondicionaisAula1 {
    public static void main(String[] args) {
        boolean condition = false;
// executa o if se for verdadeiro, se for falso, automaticamente executa o else

        if (condition){
            System.out.println("Dentro do IF");
        }else {
            System.out.println("Dentro do else");
        }
        System.out.println("Fora do if");
    }
}
