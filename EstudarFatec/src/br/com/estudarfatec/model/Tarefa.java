package br.com.estudarfatec.model;

public class Tarefa {
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    private Disciplina disciplina;

    public Tarefa(int id, String titulo, String descricao, Disciplina disciplina) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.disciplina = disciplina;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return String.format("%s ID: %d | %s (%s): %s",
                status,
                id,
                titulo,
                disciplina.getNomeDisciplina(),
                descricao);
    }
}