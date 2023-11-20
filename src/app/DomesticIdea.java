package app;
import java.util.Scanner;
import controller.CasaController;

public class DomesticIdea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CasaController casaController = new CasaController();

        while (true) {
            System.out.println("Menu do APP:");
            System.out.println("1. Adicionar Membro");
            System.out.println("2. Adicionar Tarefa");
            System.out.println("3. Atribuir Tarefa a Membro");
            System.out.println("4. Marcar Tarefa como Concluída");
            System.out.println("5. Listar Membros");
            System.out.println("6. Listar Tarefas");
            System.out.println("9. Sair");
            System.out.println("Escolha uma ação:");

            if(!scanner.hasNextInt()){
                System.out.println("Opção digitida é inválida. tente novamente.");
                scanner.nextLine();
                continue;
            }

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o nome do membro:");
                    String nomeMembro = scanner.nextLine();
                    casaController.adicionarMembro(nomeMembro);
                    break;
                case 2:
                    System.out.println("Digite a descrição da tarefa:");
                    String descricaoTarefa = scanner.nextLine();
                    casaController.adicionarTarefa(descricaoTarefa);
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa:");
                    int tarefaIndice = scanner.nextInt();
                    System.out.println("Digite o número do membro:");
                    int membroIndice = scanner.nextInt();
                    casaController.atribuirTarefaAMembro(tarefaIndice, membroIndice);
                    break;
                case 4:
                    System.out.println("Digite o número da tarefa a ser marcada como concluída:");
                    int tarefaIndiceConclusao = scanner.nextInt();
                    casaController.marcarTarefaComoConcluida(tarefaIndiceConclusao);
                    break;
                case 5:
                    casaController.listarMembros();
                    break;
                case 6:
                    casaController.listarTarefas();
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
