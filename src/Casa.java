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
        }
    }

    public void marcarTarefaComoConcluida(int tarefaIndice) {
        if (tarefaIndice >= 0 && tarefaIndice < tarefas.size()) {
            Tarefa tarefa = tarefas.get(tarefaIndice);
            tarefa.marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída. Créditos atribuídos ao membro.");
        }
    }

    public void listarMembros() {
        System.out.println("Membros da Casa:");
        for (int i = 0; i < membros.size(); i++) {
            System.out.println(i + ". " + membros.get(i).getNome() + " - Créditos: " + membros.get(i).getCreditos());
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas na Casa:");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefas.get(i);
            String atribuicao = (tarefa.getMembroAtribuido() != null)
                    ? " (Atribuída a: " + tarefa.getMembroAtribuido().getNome() + ")"
                    : "";
            System.out.println(i + ". " + tarefa.getDescricao() + atribuicao);
        }
    }
}
