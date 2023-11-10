public class Tarefa {
    private String descricao;
    private boolean concluida;
    private Membro membroAtribuido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
        this.membroAtribuido = null;
    }

    public void atribuirTarefa(Membro membro) {
        membroAtribuido = membro;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
        if (membroAtribuido != null) {
            membroAtribuido.ganharCredito(1);
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public Membro getMembroAtribuido() {
        return membroAtribuido;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
