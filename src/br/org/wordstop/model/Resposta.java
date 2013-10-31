package br.org.wordstop.model;

/**
 * Classe para uma Resposta que irá ser data por jogador e categoria.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class Resposta {
	private Jogador jogador;
	private Categoria categoria;
	private String resposta;
	private Conferencia conferencia;

	/**
	 * Reposta dada pelo jogador sobre uma determinada categoria para que os
	 * jogadores classifiquem através de um ponto.
	 * 
	 * @param jogador
	 * @param categoria
	 * @param resposta
	 */
	public Resposta(Jogador jogador, Categoria categoria, String resposta) {
		this.jogador = jogador;
		this.categoria = categoria;
		this.resposta = resposta;
		this.conferencia = new Conferencia(this);
	}

	public Jogador getJogador() {
		return jogador;
	}

	public String getResposta() {
		return resposta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Conferencia getConferencia() {
		return conferencia;
	}

	/**
	 * Para uma resposta ser igual a outra, precisa ter o jogador e a categoria
	 * iguais.
	 */
	@Override
	public boolean equals(Object o) {
		if (o instanceof Resposta) {
			Resposta resp = (Resposta) o;
			if (resp.getJogador().equals(this.jogador)) {
				if (resp.getCategoria().equals(this.categoria)) {
					return true;
				}
			}
		}
		return false;
	}
}
