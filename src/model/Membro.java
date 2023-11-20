package model;
public class Membro {
    private String nome;
    private int creditos;

    public Membro(String nome) {
        this.nome = nome;
        this.creditos = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void ganharCredito(int valor) {
        creditos += valor;
    }
}
