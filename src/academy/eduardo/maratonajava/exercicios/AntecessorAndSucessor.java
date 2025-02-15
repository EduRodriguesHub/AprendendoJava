package academy.eduardo.maratonajava.exercicios;

import java.util.Scanner;

public class AntecessorAndSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroUsuário = sc.nextInt();
        int antecessorDoNumeroUsuário = numeroUsuário - 1;
        int sucessorDoNumeroUsuário = numeroUsuário + 1;
        System.out.printf("O numero %d tem como antecessor o número %d e como sucessor o número %d!", numeroUsuário, antecessorDoNumeroUsuário, sucessorDoNumeroUsuário);
    }
}
