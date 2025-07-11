package academy.eduardo.maratonajava.exerciciosufrm;

import java.util.Scanner;

public class QuantidadeDeSalariosMinimos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double salarioMinimo = 788;
            System.out.println("Digite seu salário: ");
            double salarioUsuario = sc.nextDouble();

            int quantidadeDeSalarios = (int) Math.floor(salarioUsuario / salarioMinimo);
            double restanteDoSalario = salarioUsuario % salarioMinimo;
            
            System.out.printf("Dentro do seu salario cabem %d salarios minimos (R$788,00), sobrando %.2f", quantidadeDeSalarios, restanteDoSalario);
        }
    }
}
