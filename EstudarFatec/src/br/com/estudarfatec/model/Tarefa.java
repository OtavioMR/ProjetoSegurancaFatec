package br.com.estudarfatec.model;

public class Tarefa{
	private int id;
	private String titulo;
	private String descricao;
	private boolean concluida;
	
	//Construtor: Garanta que o objeto nasça com os dados necessários
	public Tarefa(int id, String titulo, String descricao) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = false;
	}
	
	//Regra de negócio: O estado 'concluído' só muda através deste método
	public void concluir() {
		this.concluida = true;
	}
	
	//Getter: Acesso controlado aos dados
	public int getId() {
		return id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	//Override para facilitar a visualização no console
	public String toString() {
		String status = concluida ? "[X]" : "[]";
		return String.format("%s ID: %d | %s: %s", status, id, titulo, descricao);
	}
}