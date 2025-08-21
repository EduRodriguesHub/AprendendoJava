package academy.eduardo.maratonajava.javacore.introducaoClasses.test;

import academy.eduardo.maratonajava.javacore.introducaoClasses.dominio.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        
        carro1.nome = "Palio";
        carro1.modelo = "Young";
        carro1.ano = 2001;

        carro2.nome = "Fusca";
        carro2.modelo = "Fusca 1300";
        carro2.ano = 1976; 
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("--------------------------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
