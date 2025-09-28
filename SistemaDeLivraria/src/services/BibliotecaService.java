package services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import models.Emprestimo;
import models.Livro;
import models.Status;

public class BibliotecaService {

	private List<Livro> livros = new ArrayList<>();
	private List<Emprestimo> emprestimos = new ArrayList<>();

	public String emprestarLivro(Livro livro) {
		if (livro.getStatus() == Status.EMPRESTADO || livro.getStatus() == Status.INDISPONIVEL) {
			return "O livro não está disponível para empréstimo";
		}
		LocalDate dataEmprestimo = LocalDate.now();
		LocalDate dataDevolucao = dataEmprestimo.plusDays(7);
		Emprestimo emprestimo = new Emprestimo(livro, dataEmprestimo, dataDevolucao);

		emprestimos.add(emprestimo);
		livro.setStatus(Status.EMPRESTADO);

		return "O livro foi emprestado";
	}

	public void adicionarLivro(int id, String titulo, String autor) {

		LocalDateTime diaHoraAtual = LocalDateTime.now();
		Livro livro = new Livro(id, titulo, autor, diaHoraAtual, diaHoraAtual);
		livro.setId(id);
		livro.setTitulo(titulo);
		livro.setAutor(autor);
		livro.setDataCadastro(diaHoraAtual);
		livro.setDataAtualizacao(diaHoraAtual);

		livros.add(livro);

		System.out.println("O livro foi adicionado com sucesso!");
	}

	public void listarLivros() {
		System.out.println("------------ Livros cadastrados ------------");
		for (Livro livro : livros) {
			System.out.println(livro);
			System.out.println("----------------------------------------");
		}
	}

}
