package main;

import java.util.Scanner;

import services.BibliotecaService;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BibliotecaService bibliotecaService = new BibliotecaService();

		boolean running = true;

		while (running) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Adicionar livro");
			System.out.println("2 - Listar livros");
			System.out.println("3 - Emprestar livro");
			System.out.println("0 - Sair");

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Id: ");
				int id = sc.nextInt();

				System.out.print("Título: ");
				String titulo = sc.nextLine();

				System.out.print("Autor: ");
				String autor = sc.nextLine();

				bibliotecaService.adicionarLivro(id, titulo, autor);
				break;

			case 2:
				bibliotecaService.listarLivros();
				break;

			case 3:
				System.out.print("Título do livro a emprestar: ");
				String tituloEmprestimo = sc.nextLine();

				bibliotecaService.emprestarLivro(tituloEmprestimo);
				break;

			case 0:
				running = false;
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida!");
			}
		}

		sc.close();
	}
}
