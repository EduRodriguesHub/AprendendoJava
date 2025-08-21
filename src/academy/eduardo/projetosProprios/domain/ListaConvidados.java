package academy.eduardo.projetosProprios.domain;

import java.util.ArrayList;

public class ListaConvidados {
    private ArrayList<String> listaconvidados = new ArrayList<>();

    public void add(String nome){
        listaconvidados.add(nome);
    }

    public void remove(String nome){
        listaconvidados.remove(nome);
    }

    public ArrayList<String> getLista(){
        return listaconvidados;
    }
}
