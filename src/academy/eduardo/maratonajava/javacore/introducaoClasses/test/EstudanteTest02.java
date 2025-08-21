package academy.eduardo.maratonajava.javacore.introducaoClasses.test;

import academy.eduardo.maratonajava.javacore.introducaoClasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); 
        estudante.nome = "Eduardo";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
