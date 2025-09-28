package models;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>(); 
	private List<Autor> autores = new ArrayList<>(); 
	private List<Emprestimo> emprestimos = new ArrayList<>();
	
	
	public List<Livro> getLivros() {
		return livros;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	} 
	

	
}
