package academy.eduardo.maratonajava.exerciciosufrm;
import java.util.Scanner;

public class ValorIPIAcrescido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem do IPI a ser inserido: ");
        double porcentagem = sc.nextDouble();
        System.out.println("Digite o código das peça 1: ");
        double codigoPecaUm = sc.nextDouble();
        System.out.println("Digite o valor unitário da peça 1: ");
        int valorUnitarioPecaUm = sc.nextInt();
        System.out.println("Digite a quantidades de peças 1: ");
        int quantidadeDaPecaUm = sc.nextInt();
        System.out.println("Digite o código das peça 2: ");
        double codigoPecaDois = sc.nextDouble();
        System.out.println("Digite o valor unitário da peça 2: ");
        int valorUnitarioPecaDois = sc.nextInt();
        System.out.println("Digite a quantidades de peças 2: ");
        int quantidadeDaPecaDois = sc.nextInt();

        double formula = (valorUnitarioPecaUm * quantidadeDaPecaUm + valorUnitarioPecaDois * quantidadeDaPecaDois) * (porcentagem/100+1);
        System.out.printf("O valor total a ser pago é %.2f" , formula);
    }
}
 