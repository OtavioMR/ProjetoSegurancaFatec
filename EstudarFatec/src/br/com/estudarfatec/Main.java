package br.com.estudarfatec;

import br.com.estudarfatec.model.Tarefa;

public class Main{
	public static void main(String[] args) {
		System.out.println("=== Bem-vindo ao EstudaFatec ===");
		
		Tarefa t1 = new Tarefa(1, "Estudar Java", "Revisar conceitos de POO");
		Tarefa t2 = new Tarefa(2, "Projeto Integrador", "Entregar Main do Projto Seguranca");
		
		System.out.println("\nAntes de concluir:");
		System.out.println(t1);
		System.out.println(t2);
		
		t1.concluir();
		t2.concluir();
		
		System.out.println("\nDepois de concluir:");
		System.out.println(t1);
		System.out.println(t2);
		}
}