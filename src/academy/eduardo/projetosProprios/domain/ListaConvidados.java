package academy.eduardo.projetosProprios.domain;

import java.util.ArrayList;

public class ListaConvidados {
    private ArrayList<String> listaconvidados = new ArrayList<>();

    public ListaConvidados(String nomeNoivo, String nomeNoiva) {
        listaconvidados.add(nomeNoiva);
        listaconvidados.add(nomeNoivo);

    }
    public void add(String nome){
        listaconvidados.add(nome);
    }

    public void remove(String nome){
        listaconvidados.remove(nome);
    }

    public ArrayList<String> getLista(){

        ArrayList<String> listaconvidadosCopia = new ArrayList<>(listaconvidados);
        return listaconvidadosCopia;
    }
}
