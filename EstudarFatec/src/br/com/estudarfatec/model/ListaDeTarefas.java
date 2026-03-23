package br.com.estudarfatec.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefas {

    List<Tarefa> listaTarefas = new ArrayList<>();
    List<Disciplina> listaDisciplinas = new ArrayList<>();

    LimparConsole limpar = new LimparConsole();
    Scanner scanner = new Scanner(System.in);

    int contadorId = 1;

    public void Menu() {

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n== Lista de Tarefas ==");

            System.out.println("\n(1) Ver tarefas");
            System.out.println("(2) Criar tarefa");
            System.out.println("(3) Cadastrar disciplina");
            System.out.println("(4) Filtrar por disciplina");
            System.out.println("(0) Sair");

            System.out.print("\nEscolha: ");
            String escolha = scanner.nextLine();

            switch (escolha) {

                case "1":
                    limpar.limparTela();
                    verTarefas();
                    break;

                case "2":
                    criarTarefa();
                    break;

                case "3":
                    cadastrarDisciplina();
                    break;

                case "4":
                    filtrarPorDisciplina();
                    break;

                case "0":
                    System.out.println("Saindo...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void cadastrarDisciplina() {
        System.out.print("Nome da disciplina: ");
        String nome = scanner.nextLine();

        listaDisciplinas.add(new Disciplina(nome));
        System.out.println("Disciplina cadastrada.");
    }

    private void criarTarefa() {

        if (listaDisciplinas.isEmpty()) {
            System.out.println("Cadastre uma disciplina primeiro.");
            return;
        }

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.println("\nEscolha a disciplina:");
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            System.out.println(i + " - " + listaDisciplinas.get(i));
        }

        int escolha = Integer.parseInt(scanner.nextLine());
        Disciplina disciplina = listaDisciplinas.get(escolha);

        Tarefa tarefa = new Tarefa(contadorId++, titulo, descricao, disciplina);
        listaTarefas.add(tarefa);

        System.out.println("Tarefa criada.");
    }

    private void verTarefas() {

        if (listaTarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa.");
            return;
        }

        for (Tarefa t : listaTarefas) {
            System.out.println(t);
        }
    }

    private void filtrarPorDisciplina() {

        if (listaDisciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada.");
            return;
        }

        System.out.println("\nEscolha a disciplina:");
        for (int i = 0; i < listaDisciplinas.size(); i++) {
            System.out.println(i + " - " + listaDisciplinas.get(i));
        }

        int escolha = Integer.parseInt(scanner.nextLine());
        Disciplina disciplinaEscolhida = listaDisciplinas.get(escolha);

        System.out.println("\nTarefas da disciplina:");

        for (Tarefa t : listaTarefas) {
            if (t.getDisciplina().equals(disciplinaEscolhida)) {
                System.out.println(t);
            }
        }
    }
}