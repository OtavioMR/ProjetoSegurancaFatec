package br.com.estudarfatec.model;

public class Disciplina {
    private String nomeDisciplina;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    @Override
    public String toString() {
        return nomeDisciplina;
    }
}