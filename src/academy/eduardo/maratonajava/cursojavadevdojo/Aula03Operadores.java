package academy.eduardo.maratonajava.cursojavadevdojo;

import java.util.Scanner;

public class Aula03Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isDezMaiorQueVinte = 20 < 10;
        System.out.println("isDezMaiorQueVinte: " +isDezMaiorQueVinte);
        int idade = 35;
        float salarioSuica = 5000F;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salarioSuica >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salarioSuica >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println("Digite o valor da moeda");

        int moeda = sc.nextInt();

        System.out.println("O valor da moeda duplicado é "+moeda*2);

        double contaCorrente = 600;
        double investimentos = 6000;
        double precoNotebook = 3000;

        boolean isNotebookCompravel = contaCorrente > precoNotebook || investimentos > precoNotebook;

        System.out.println(isNotebookCompravel);

        //Operadores de atribuição
        // = += -= *= /= %=
        double bonus = 1800;
        bonus %= 1000;
        System.out.println(bonus); 

        // forma de contar mais um:
        int contador = 0;
        contador++;
        contador--;
        System.out.println(contador);
    }
    
} 
 