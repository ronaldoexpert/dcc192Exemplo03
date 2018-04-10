package dcc192Exemplo03;

public class Tarefas {
    String titulo;
    String descricao;
    boolean concluida;

    public Tarefas(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = true;
    }

    public Tarefas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefas: " + "Titulo: " + titulo + " / Descricao: " + descricao;
    }
    
    
    
}
