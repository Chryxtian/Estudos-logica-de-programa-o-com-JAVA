package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class ExercicioChatgpt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int [][] notas = new int[4][3];
        String [] alunos = new String[4];
        double [] nota = new double[3];
        double maiorMedia = -1, mediaTurma = 0, mediaAluno = 0, somaMedia = 0, soma = 0;
        int quantAcimaMedia = 0, indiceMaiorMedia = 0;

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite o nome do aluno: ");
            alunos[i] = keyboard.next();
            for (int j = 0; j < notas[i].length ; j++) {
                System.out.print("Digite a " +(j+1)+"ª nota: ");
                notas[i][j]= keyboard.nextInt();


        }
    } keyboard.close();


        for (int i = 0; i < notas.length ; i++) {
            soma = 0;


            for (int j = 0; j < notas[i].length; j++) {
                soma = soma + notas[i][j];


            }

             mediaAluno = soma / notas[i].length;
            System.out.println("Media de " + alunos[i] + ": " + mediaAluno);

            somaMedia = somaMedia + mediaAluno;


            if (mediaAluno > maiorMedia){
                maiorMedia = mediaAluno;
                indiceMaiorMedia = i;

            }
        }

            if (mediaAluno > mediaTurma) {

                quantAcimaMedia = quantAcimaMedia + 1;

            }
            mediaTurma = somaMedia/alunos.length;
            System.out.println("A media da turma é: " +mediaTurma);
        System.out.println("O aluno com a maior media foi: " +alunos[indiceMaiorMedia]);
        System.out.println("quantidade de aluno com media acima da media da turma: " +quantAcimaMedia);
}}
