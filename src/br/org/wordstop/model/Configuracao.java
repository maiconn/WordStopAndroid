package br.org.wordstop.model;

import java.util.ArrayList;
import java.util.List;

import br.org.wordstop.model.enumerator.Letra;
import br.org.wordstop.model.exception.BusinessException;

/**
 * Classe responsável por configurar o jogo.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public abstract class Configuracao {
	private int qtdMaxJogadores;
	private List<Jogador> jogadores;
	private List<Categoria> categorias;
	private List<Letra> letras;
	private int quantidadeRodadas;

	public Configuracao(int qtdMaxJogadores) {
		this.qtdMaxJogadores = qtdMaxJogadores;

		this.categorias = new ArrayList<Categoria>();
		this.jogadores = new ArrayList<Jogador>();
		this.letras = new ArrayList<Letra>();
	}

	public synchronized boolean adicionarJogador(Jogador jogador) {
		if (jogadores.size() < qtdMaxJogadores) {
			return jogadores.add(jogador);
		}
		return false;
	}

	public synchronized boolean removerJogador(Jogador jogador) {
		return jogadores.remove(jogador);
	}

	public boolean adicionarCategoria(Categoria categoria) {
		return categorias.add(categoria);
	}

	public boolean removerCategoria(Categoria categoria) {
		return categorias.remove(categoria);
	}

	public Letra escolherLetra() throws BusinessException {
		if (this.letras.size() == 0) {
			throw new BusinessException(
					"Selecione ao menos uma letra para jogar.");
		}
		int index = 0 + (int) (Math.random() * (this.letras.size() - 1));
		Letra letra = letras.get(index);
		removerLetra(letra);
		return letra;
	}

	public boolean removerLetra(Letra letra) {
		return this.letras.remove(letra);
	}

	public boolean adicionarLetra(Letra letra) {
		if (!letras.contains(letra)) {
			return letras.add(letra);
		}
		return false;
	}

	public void setQuantidadeRodadas(int quantidade) {
		this.quantidadeRodadas = quantidade;
	}

	public int getQuantidadeRodadas() {
		return quantidadeRodadas;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public List<Letra> getLetras() {
		return letras;
	}
}
