package models;

import java.time.LocalDateTime;

public class Livro {
	private int id;
	private String titulo;
	private String autor;
	private Status status;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataAtualizacao;
	
	public Livro(int id, String titulo, String autor, LocalDateTime dataCadastro, LocalDateTime dataAtualizacao) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.status = Status.DISPONIVEL;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public LocalDateTime getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDateTime dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	public String toString() {
		return "Livro: " + titulo + "\nAutor: " + autor + " \nStatus: " + status + "\nData de cadastro: " + dataCadastro;
	}
	
}
