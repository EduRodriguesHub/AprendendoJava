package academy.eduardo.maratonajava.introducao;

public class TiposDeVariaveis {
    public static void main(String[] args) {
        String nome = "Eduardo";
        char sexo = 'M';
        int idade = 18;
        double salario = 2000.56;
        String result;

        result = String.format("Nome: %s\n", nome) +
                    String.format("Sexo: %c\n", sexo) +
                    String.format("Idade: %d\n", idade) +
                    String.format("Salario: %.2f", salario);
        System.out.println(result);
    }
}
