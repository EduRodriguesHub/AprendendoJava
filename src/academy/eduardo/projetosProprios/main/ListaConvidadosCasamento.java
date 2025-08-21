//AUTOR: Eduardo Rodrigues
//Data: 

package academy.eduardo.projetosProprios.main;
import java.util.Scanner;

import academy.eduardo.projetosProprios.domain.ListaConvidados;

class ListaConvidadosCasamento {
    public static void main(String[] args) throws InterruptedException { // Permite que o método lance exceção se Thread.sleep for interrompido
        ListaConvidados listaConvidados = new ListaConvidados();

        Scanner sc = new Scanner(System.in);
        
        int finalizador = 0;

        System.out.println("Olá");
        while (true) {
            if (finalizador == 4){
                break;
            }
            System.out.println("_________________________");
            System.out.println("Escolha uma opção: \n1-Adicionar novo convidado  \n2-mostrar convidados" + 
                                "\n3-remover convidado \n4-sair");
            System.out.println("_________________________");
            String escolha = sc.nextLine();
            finalizador = Integer.parseInt(escolha);

            switch (finalizador) {
                case 1:
                    Thread.sleep(1000);
                    System.out.println("_________________________");
                    System.out.println("Adicione o nome do convidado: ");
                    String nomeConvidado = sc.nextLine();
                    listaConvidados.add(nomeConvidado);
                    Thread.sleep(1000);
                    System.out.println(nomeConvidado + " adicionado com sucesso !");
                    System.out.println("_________________________");
                    Thread.sleep(1000);
                    break;
                case 2:
                    Thread.sleep(1000);
                    System.out.println("_________________________");
                    for (String convidado : listaConvidados.getLista()){
                    System.out.println(convidado);
                    }
                    System.out.println("_________________________");
                    Thread.sleep(1000);
                    break;
                case 3:
                    Thread.sleep(1000);
                    System.out.println("_________________________");
                    System.out.println("Escolha o convidado que deseja remover:");
                    String removido = sc.nextLine();
                    listaConvidados.remove(removido);
                    System.out.println(removido + " removido com sucesso!");
                    System.out.println("_________________________");
                    Thread.sleep(1000);
                case 4:
                    System.out.println("Até mais");
                default:
                break;
            }
        }   
    }
}

//Proximos passos, fazer tratamento de erros, integrar com uma tabela usando SQL