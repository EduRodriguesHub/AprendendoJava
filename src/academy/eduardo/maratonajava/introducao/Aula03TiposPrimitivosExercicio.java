package academy.eduardo.maratonajava.introducao;

import java.util.Scanner;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        int moeda;
        String nome = "Eduardo";
        String endereço = "Rua Chile 663";
        double salario = 2000.00;
        String dataRecebimentoSalario = "05/07/2025";
        System.out.println("Eu " + nome + " morando no endereço " + endereço + 
        " confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);
        boolean isDezMaiorQueVinte = 20 < 10;
        System.out.println("isDezMaiorQueVinte: " +isDezMaiorQueVinte);
        int idade = 35;
        float salarioSuica = 5000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salarioSuica >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salarioSuica >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da moeda");
        moeda = sc.nextInt();
        System.out.println("O valor da moeda duplicado é "+moeda*2);

    }
    
} 
