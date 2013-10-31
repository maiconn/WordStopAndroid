package br.org.wordstop.model;

import br.org.wordstop.model.interfaces.Conferivel;

public class Conferencia implements Conferivel {
	private Resposta resposta;
	private int respostaCorreta;

	public Conferencia(Resposta resposta) {
		this.resposta = resposta;
	}

	public void respostaCorreta() {
		respostaCorreta++;
	}

	public void respostaNaoCorreta() {
		respostaCorreta--;
	}

	@Override
	public boolean correta() {
		return respostaCorreta >= 0;
	}

	public Resposta getResposta() {
		return resposta;
	}
}
