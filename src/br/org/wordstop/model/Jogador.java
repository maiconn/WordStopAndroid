package br.org.wordstop.model;

/**
 * Classe que define um jogador
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class Jogador extends Pessoa {
	private boolean pronto;

	public Jogador(String nome) {
		super(nome);
		pronto = false;
	}

	/**
	 * Prepara o jogador para o jogo
	 */
	public void preparar() {
		this.pronto = true;
	}

	/**
	 * Desprepara o jogador do jogo
	 */
	public void desprepar() {
		this.pronto = false;
	}

	/**
	 * retorna se o jogador está ou não preparado.
	 * 
	 * @return
	 */
	public boolean isPronto() {
		return pronto;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Jogador) {
			Jogador jog = (Jogador) o;
			if (jog.getNome().equalsIgnoreCase(super.getNome())) {
				return true;
			}
		}
		return false;
	}
}
