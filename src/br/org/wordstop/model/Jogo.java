package br.org.wordstop.model;

import java.util.ArrayList;
import java.util.List;

import br.org.wordstop.model.exception.BusinessException;
import br.org.wordstop.model.interfaces.Jogavel;

/**
 * Define as regras do jogo.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class Jogo extends Configuracao implements Jogavel {
	private Configuracao configuracao;
	private List<Resposta> respostas;
	private int qtdRodadaAtual;
	private List<Pontuacao> pontuacoes;

	public Jogo(int qtdMaxJogadores) throws BusinessException {
		super(qtdMaxJogadores);
		this.pontuacoes = new ArrayList<Pontuacao>();

		if (this.novaRodada()) {
			throw new BusinessException("Jogo não possui rodadas.");
		}
	}

	@Override
	public   Resposta jogar(Jogador jogador, Categoria categoria,
			String resposta) throws BusinessException {
		Resposta resp = new Resposta(jogador, categoria, resposta);
		if (respostas.contains(resp)) {
			throw new BusinessException(
					"Resposta já contida na lista, jogador já jogou essa rodada.");
		}
		respostas.add(resp);
		return resp;
	}

	@Override
	public boolean novaRodada() {
		this.respostas = new ArrayList<Resposta>();

		if (this.qtdRodadaAtual >= this.configuracao.getQuantidadeRodadas()) {
			return false;
		}

		this.qtdRodadaAtual++;
		return true;
	}

	@Override
	public synchronized void conferirResposta(Resposta resposta, boolean correta) {
		if (correta) {
			resposta.getConferencia().respostaCorreta();
		} else {
			resposta.getConferencia().respostaNaoCorreta();
		}
	}

	@Override
	public void avaliarResposta(Resposta resposta) {
		
	}

	public Configuracao getConfiguracao() {
		return configuracao;
	}

	public List<Pontuacao> getPontuacoes() {
		return pontuacoes;
	}

	public int getQtdRodadaAtual() {
		return qtdRodadaAtual;
	}

}
