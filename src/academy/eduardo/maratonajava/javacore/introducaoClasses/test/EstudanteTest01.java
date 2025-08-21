package academy.eduardo.maratonajava.javacore.introducaoClasses.test;

import academy.eduardo.maratonajava.javacore.introducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 10;
        estudante.nome = "João";
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo); 
    }
}
