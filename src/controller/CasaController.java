package controller;

import model.Casa;
import model.Membro;
import model.Tarefa;

public class CasaController {
    private Casa casa;

    public CasaController() {
        this.casa = new Casa();
    }

    public void adicionarMembro(String nome) {
        Membro novoMembro = new Membro(nome);
        casa.adicionarMembro(novoMembro);
        System.out.println("Membro adicionada com sucesso!");
        System.out.println("");
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        casa.adicionarTarefa(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
        System.out.println();
    }

    public void atribuirTarefaAMembro(int tarefaIndice, int membroIndice) {
        casa.atribuirTarefaAMembro(tarefaIndice, membroIndice);
    }

    public void marcarTarefaComoConcluida(int tarefaIndice) {
        casa.marcarTarefaComoConcluida(tarefaIndice);
        System.out.println("Tarefa concluida com sucesso! " + tarefaIndice);
        System.out.println();
    }

    public void listarMembros() {
        System.out.println("Membros cadastrados no sistema");
        casa.listarMembros();
    }

    public void listarTarefas() {
        System.out.println("Tarefas cadastradas no sistema");
        casa.listarTarefas();
    }
}
