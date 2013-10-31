package br.org.wordstop.model;

import br.org.wordstop.model.enumerator.Conclusao;
import br.org.wordstop.model.interfaces.Pontuavel;

/**
 * Classe para classificar um ponto - implementar o m�todo pontuar
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public abstract class Pontuacao implements Pontuavel {
	private Avaliacao avaliacao;
	private Conclusao conclusao;
	private int peso;

	/**
	 * � partir de uma resposta e uma conclus�o tirada sobre aquela resposta que
	 * � gerado um ponto
	 * 
	 * @param resposta
	 * @param conclusao
	 */
	public Pontuacao(Avaliacao avaliacao, Conclusao conclusao) {
		this.avaliacao = avaliacao;
		this.conclusao = conclusao;
		this.peso = this.pontuar(conclusao);
	}

	public Conclusao getConclusao() {
		return conclusao;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public int getPeso() {
		return peso;
	}
}
