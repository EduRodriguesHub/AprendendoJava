package academy.eduardo.maratonajava.cursojavadevdojo;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 10;
        System.out.println(idade);
        int valor = 10000000;
        long value = 1000000000000L;
        System.out.println(valor + value);
        String texto = "Ola meu caro e nobere amigo!";
        
        System.out.println(texto);

        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte" +isDezMaiorQueVinte);
        String nome = "Eduardo";
        String endereço = "Rua Chile 663";
        double salario = 2000.00;
        String dataRecebimentoSalario = "05/07/2025";

        System.out.println("Eu " + nome + " morando no endereço " + endereço + 
        " confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);

    }
}
