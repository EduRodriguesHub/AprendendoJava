package academy.eduardo.maratonajava.projetosProprios;
import java.util.ArrayList;
import java.util.Scanner;

class ListaConvidadosCasamento {
    public static void main(String[] args) throws InterruptedException { // Permite que o método lance exceção se Thread.sleep for interrompido
        ArrayList<String> convidados = new ArrayList<>();

        convidados.add("Guilherme");
        convidados.add("Lice");
        convidados.add("Marcio");

        Scanner sc = new Scanner(System.in);
        
        int finalizador = 0;

        while (finalizador != 4) {
            System.out.println("_________________________");
            System.out.println("Escolha uma opção: \n1-Adicionar novo convidado  \n2-mostrar convidados" + 
                                "\n3-remover convidado \n4-sair");
            System.out.println("_________________________");
            String escolha = sc.nextLine();
            
            finalizador = Integer.parseInt(escolha);

            if(finalizador == 1){
                Thread.sleep(1000);
                System.out.println("_________________________");
                System.out.println("Adicione o nome do convidado: ");
                String nomeConvidado = sc.nextLine();
                convidados.add(nomeConvidado);
                Thread.sleep(1000);
                System.out.println(nomeConvidado + " adicionado com sucesso !");
                System.out.println("_________________________");
                Thread.sleep(1000);
            }else if(finalizador == 2){
                Thread.sleep(1000);
                System.out.println("_________________________");
                for (String convidado : convidados){
                System.out.println(convidado);
                }
                System.out.println("_________________________");
                Thread.sleep(1000);
            }else if (finalizador == 3) {
                Thread.sleep(1000);
                System.out.println("_________________________");
                System.out.println("Escolha o convidado que deseja remover:");
                String removido = sc.nextLine();
                convidados.remove(removido);
                System.out.println(removido + " removido com sucesso!");
                System.out.println("_________________________");
                Thread.sleep(1000);
            }
            System.out.println("Até mais!");
        }   
    }
}