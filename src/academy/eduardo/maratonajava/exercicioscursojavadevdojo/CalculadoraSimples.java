package academy.eduardo.maratonajava.exercicioscursojavadevdojo;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        //Entrada do usuário (dois números)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numeroUmDoUsuario = sc.nextDouble();

        System.out.print("\nDigite o segundo número: ");
        double numeroDoisDoUsuario = sc.nextDouble();

        System.out.print("\nDigite a operação a ser escolhida: (+ - * / %): ");
        String operacaoEscolhida = sc.next(); 
        //Processamento de dados (criando a calculadora)
        
    }
}
