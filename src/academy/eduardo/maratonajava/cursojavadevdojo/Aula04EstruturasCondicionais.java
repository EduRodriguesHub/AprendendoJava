package academy.eduardo.maratonajava.cursojavadevdojo;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 19;
        if (idade >= 18) {
            System.out.println("maior de idade");
        }else{
            System.out.println("Menor de idade");
        }

        boolean isAutorizadoComprarBebida = idade >= 18;
        
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        }else {
            System.out.println("Negado");
        }
    }
}
