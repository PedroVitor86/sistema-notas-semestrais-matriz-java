import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int [][] tabela = new int[3][2];

    System.out.println("--------------------------------");
    System.out.println("        Sistema de notas        ");
    System.out.println("--------------------------------");

    for (int i = 0; i < tabela.length; i++) {
        System.out.println("=== ALUNO " + (i + 1) + " ===");
        for (int j = 0; j < tabela[i].length; j++) {
            System.out.print("Prova "+(j+1)+"° : ");

            tabela[i][j] = scanner.nextInt();
        }
        System.out.println();
    }

    System.out.println("----------------------------");
    System.out.println("        Notas Alunos        ");
    System.out.println("----------------------------");

    for (int i = 0; i < tabela.length; i++) {
        double soma = 0;
        System.out.println("=== ALUNO " + (i + 1) + " ===");
            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print("Prova "+ (j+1) +"° = " +tabela[i][j]+ " ");
                System.out.println();
                soma+= tabela[i][j];

            }
            double media = soma /tabela[i].length;
            System.out.println("Media do aluno: "+media);
            if (media >= 6.5){
                System.out.println("Situação: Aprovado");
            }else {
                System.out.println("Situação: Reprovado");
            }
            System.out.println("----------------------------");
    }

        scanner.close();
    }
}