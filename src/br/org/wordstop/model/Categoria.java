package br.org.wordstop.model;

/**
 * Classe que define uma categoria de jogo.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class Categoria {
	private String nome;

	public Categoria(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Categoria) {
			Categoria cat = (Categoria) o;
			if (cat.getNome().equals(this.nome)) {
				return true;
			}
		}
		return false;
	}
}
