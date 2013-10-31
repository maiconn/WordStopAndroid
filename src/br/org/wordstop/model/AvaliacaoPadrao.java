package br.org.wordstop.model;

import java.util.List;

import br.org.wordstop.model.enumerator.Conclusao;

public class AvaliacaoPadrao extends Avaliacao {
	private List<Resposta> respostas;

	public AvaliacaoPadrao(Resposta resposta, List<Resposta> respostas) {
		super(new Conferencia(resposta));
		this.respostas = respostas;
	}

	@Override
	public Pontuacao avaliar() {
		if (getConferencia().correta()) {
			for (Resposta resposta : respostas) {
				if (getConferencia().getResposta().getResposta()
						.equalsIgnoreCase(resposta.getResposta())) {
					return new PontuacaoPadrao(this,
							Conclusao.ACERTO_COMPARTILHADO);
				}
			}
			return new PontuacaoPadrao(this, Conclusao.ACERTO_UNICO);
		}
		return new PontuacaoPadrao(this, Conclusao.ERRO);
	}

}
