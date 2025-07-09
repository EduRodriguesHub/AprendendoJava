package academy.eduardo.maratonajava.exerciciosufrm;

import java.util.Scanner;

public class AprovadoRecuperacaoReprovado {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a nota do aluno: ");
            double nota = sc.nextDouble();

            if(nota > 60) {
                System.out.println("Aluno aprovado!");
            }else if(nota > 20 && nota < 60) {
                System.out.println("Aluno em recuperação! ");
            }else {
                System.out.println("Aluno reprovado! ");
            }if(nota == 100) {
                System.out.println("Meus parabéns pelo 100!! ");
            }
        }
    }
}
