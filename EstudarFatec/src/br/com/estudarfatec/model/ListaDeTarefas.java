package br.com.estudarfatec.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {
	List<Tarefa> listaTarefas = new ArrayList<>(); 
	
	LimparConsole limpar = new LimparConsole();
	
	Scanner scanner = new Scanner(System.in);
	
	 public void Menu() {
		 
		 boolean continuar = true;
		 
		 while(continuar) {
			 
			 limpar.limparTela();
			 System.out.println("\n== Lista de Tarefas ==");
				
				System.out.println("\n-= MENU =-");
				
				System.out.println("\n(1) Ver lista de tarefas\n(2) Adicionar nova tarefa");
				
				Scanner scanner = new Scanner(System.in);		
				
				System.out.print("\nEscolha do usuário: ");
				String escolhaMenu = scanner.nextLine();
				
				switch (escolhaMenu) {
				case "1": {
					verTarefas();
					break;
				}
				
				case "2": {
					criarTarefa();
					break;
				}
				
				default:
					System.out.println("\nOpção inválida! Insira novamente.");
					continuar = true;
					limpar.limparTela();
				}
			 
		 }
		
	}
	 
	 private void verTarefas() {
		 
		 System.out.println("\n== Tarefas cadastradas  ==\n");
		 
		 if(listaTarefas.isEmpty()) {
			 System.out.println("\n Não há tarefas cadastradas.");
		 }
		 else {
			 for(Tarefa t : listaTarefas) {
					System.out.println(t);
				}
		 }
		 
	 }
	 
	 private void criarTarefa() {
		 
		 int contadorId = 1;
		 
		 System.out.print("\nTítulo da tarefa: ");
		 String tituloTarefa = scanner.nextLine();
		 
		 System.out.print("Descrição da tarefa: ");
		 String descricaoTarefa = scanner.nextLine();
		 
		 Tarefa tarefa = new Tarefa(contadorId++, tituloTarefa, descricaoTarefa);
		 
		 listaTarefas.add(tarefa);
		 
		 verTarefas();
	 }
	 
	 
	 
	  
}
