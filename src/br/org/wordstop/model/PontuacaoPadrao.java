package br.org.wordstop.model;

import br.org.wordstop.model.enumerator.Conclusao;

/**
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class PontuacaoPadrao extends Pontuacao {

	public PontuacaoPadrao(Avaliacao avaliacao, Conclusao conclusao) {
		super(avaliacao, conclusao);
	}

	@Override
	public int pontuar(Conclusao conclusao) {
		switch (conclusao) {
		case ACERTO_COMPARTILHADO:
			return 5;
		case ACERTO_UNICO:
			return 10;
		case ERRO:
			return 0;
		default:
			return 0;
		}
	}

}
