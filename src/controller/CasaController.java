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
    }

    public void adicionarTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        casa.adicionarTarefa(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void atribuirTarefaAMembro(int tarefaIndice, int membroIndice) {
        casa.atribuirTarefaAMembro(tarefaIndice, membroIndice);
        System.out.println("Tarefa atribuida com sucesso! " + tarefaIndice + " " + membroIndice);
    }

    public void marcarTarefaComoConcluida(int tarefaIndice) {
        casa.marcarTarefaComoConcluida(tarefaIndice);
        System.out.println("Tarefa atribuida com sucesso! " + tarefaIndice);
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
