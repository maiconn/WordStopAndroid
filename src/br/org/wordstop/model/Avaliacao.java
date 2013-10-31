package br.org.wordstop.model;

import br.org.wordstop.model.interfaces.Avaliavel;

public abstract class Avaliacao implements Avaliavel {
	private Conferencia conferencia;

	public Avaliacao(Conferencia conferencia) {
		this.conferencia = conferencia;
	}

	public Conferencia getConferencia() {
		return conferencia;
	}
}
