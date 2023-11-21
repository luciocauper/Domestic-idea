package model;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Membro> membros = new ArrayList<>();
    private List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void atribuirTarefaAMembro(int tarefaIndice, int membroIndice) {
        if (tarefaIndice >= 0 && tarefaIndice < tarefas.size() && membroIndice >= 0 && membroIndice < membros.size()) {
            Tarefa tarefa = tarefas.get(tarefaIndice);
            Membro membro = membros.get(membroIndice);
            tarefa.atribuirTarefa(membro);

            System.out.println("Tarefa atribuída a " + membro.getNome() + ".");
            System.out.println();
        }
    }

    public void marcarTarefaComoConcluida(int tarefaIndice) {
        if (tarefaIndice >= 0 && tarefaIndice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(tarefaIndice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída. Créditos atribuídos ao membro.");
            System.out.println();
        }
    }

    public void listarMembros() {
        if(membros.isEmpty()){
             System.out.println();
            System.out.println("Nenhum membro cadastrado!");
             System.out.println();
        } else{
            System.out.println("Membros da Casa:");
            for (int i = 0; i < membros.size(); i++) {
                System.out.println((i + 1) + ". " + membros.get(i).getNome() + " - Créditos: " + membros.get(i).getCreditos());
            }
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()){
            System.out.println();
            System.out.println("Nenhuma tarefa cadastrada!");
            System.out.println();
        } else {
            System.out.println("Tarefas na Casa:");
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa tarefa = tarefas.get(i);
                String status = (tarefa.isConcluida()) ? "Concluida" : "Em andamento";
                String atribuicao = (tarefa.getMembroAtribuido() != null)
                        ? " (Atribuída a: " + tarefa.getMembroAtribuido().getNome() + ")"
                        : "";
                System.out.println((i + 1) + ". " + tarefa.getDescricao() + atribuicao + " - " + status);
            }
        }
    }
}
