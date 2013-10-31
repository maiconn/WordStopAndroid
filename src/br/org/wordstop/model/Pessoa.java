package br.org.wordstop.model;

/**
 * Classe que define uma Pessoa
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
