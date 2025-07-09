package academy.eduardo.maratonajava.exerciciosufrm;

import java.util.Scanner;

public class ContagemDeIdadeEmDias {
    public static void main(String[] args) {
        System.out.println("Digite a idade em anos, meses e depois dias: ");

        try (Scanner sc = new Scanner(System.in)) {
            int idadeEmAnos = sc.nextInt();
            int idadeEmMeses = sc.nextInt();
            int idadeEmDias = sc.nextInt();

            int dias = (idadeEmAnos * 365) + (idadeEmMeses * 30) + idadeEmDias;
            
            System.out.println(dias);
        }
    }
}
