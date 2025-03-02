package academy.eduardo.maratonajava.exerciciosufrm;

import java.util.Scanner;

public class ReajusteUmPorcento {
    public static void main(String[] args) {
        System.out.println("Informe um saldo: ");
        Scanner sc = new Scanner(System.in);

        double saldo = sc.nextDouble();

        double umPorcento = saldo / 100;    
        double reajuste = saldo + umPorcento;

        System.out.println("O valor reajustado como aumento em 1% é "+reajuste);
    }
}
