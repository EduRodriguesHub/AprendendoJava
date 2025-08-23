//AUTOR: Eduardo Rodrigues
//Data: 20/08/2025

package academy.eduardo.projetosProprios.main;
import java.util.Scanner;

import academy.eduardo.projetosProprios.domain.ListaConvidados;

class ListaConvidadosCasamento {
    public static void main(String[] args) throws InterruptedException { // Permite que o método lance exceção se Thread.sleep for interrompido
        
        Scanner sc = new Scanner(System.in);
        
        int finalizador = 0;
        
        System.out.println("Olá");
        
        System.out.println("Adicione o nome da noiva: ");
        String nomeNoiva = sc.nextLine();
        while (nomeNoiva.isBlank()){
            System.out.println("Não pode ser vazio, digite novamente: ");
            nomeNoiva = sc.nextLine();
        }
        System.out.println("Adicione o nome do noivo: ");
        String nomeNoivo = sc.nextLine();
        while (nomeNoivo.isBlank()){
            System.out.println("Não pode ser vazio, digite novamente: ");
            nomeNoivo = sc.nextLine();
        }

        ListaConvidados listaConvidados = new ListaConvidados(nomeNoivo, nomeNoiva);
        
        while (true) {
            if (finalizador == 4){
                break;
            }
            int escolha;
            while (true) {
                try {
                System.out.println("_________________________");
                System.out.println("Escolha uma opção: \n1-Adicionar novo convidado  \n2-mostrar convidados" + 
                                    "\n3-remover convidado \n4-sair");
                System.out.println("_________________________");
                escolha = Integer.parseInt(sc.nextLine());
                finalizador = escolha;
                if (escolha >= 1 && escolha <= 4){  
                    break;
                }else{
                    System.out.println("\nNúmero não está na lista!");
                }
                } catch (NumberFormatException e) {
                System.out.println("\nOpção inválida");
                }
            }
            
            switch (finalizador) {
                case 1:
                    Thread.sleep(1000);
                    System.out.println("_________________________");
                    System.out.println("Adicione o nome do convidado: ");
                    String nomeConvidado = sc.nextLine();
                    while (nomeConvidado.isBlank()){
                        System.out.println("Não pode ser vazio, digite novamente: ");
                        nomeConvidado = sc.nextLine();
                    }
                    if (listaConvidados.getLista().contains(nomeConvidado)) {
                        System.out.println(nomeConvidado + " Já está na lista");
                        break;
                    }
                    listaConvidados.add(nomeConvidado);
                    Thread.sleep(1000);
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
                    if (removido.equalsIgnoreCase(nomeNoiva) || removido.equalsIgnoreCase(nomeNoivo) ){
                        System.out.println("Noivos não podem ser retirados do casamento.");
                        break;
                    }

                    String convidadoEncontrado = null;
                    for (String convidadoNaLista : listaConvidados.getLista() ){
                        if(removido.equalsIgnoreCase(convidadoNaLista)){
                            convidadoEncontrado = convidadoNaLista;
                            break;
                        }
                    }

                    if (convidadoEncontrado != null){
                        listaConvidados.remove(convidadoEncontrado);
                        System.out.println(convidadoEncontrado + " removido com sucesso");
                        System.out.println("_________________________");
                        Thread.sleep(1000);
                        break;
                    }else{
                        System.out.println("Convidado Não encontrado!");
                        Thread.sleep(1000);
                    }
                    break;
                case 4:
                    System.out.println("Até mais");
                default:
                break;
            }
        }   
    }
}

//Proximos passos, fazer tratamento de erros, integrar com uma tabela usando SQL