package br.org.wordstop.model.interfaces;

import br.org.wordstop.model.Categoria;
import br.org.wordstop.model.Jogador;
import br.org.wordstop.model.Resposta;
import br.org.wordstop.model.exception.BusinessException;

/**
 * Define uma interface para a classe Jogo
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public interface Jogavel {

	/**
	 * Define uma nova rodada.
	 * 
	 * @return
	 */
	public boolean novaRodada();

	/**
	 * Confere a resposta.
	 * 
	 * @param resposta
	 * @param correta
	 */
	public void conferirResposta(Resposta resposta, boolean correta);

	public void avaliarResposta(Resposta resposta);

	/**
	 * Define uma jogada.
	 * 
	 * @param jogador
	 *            jogador que irá efetuar a jogada.
	 * @param categoria
	 *            categoria jogada.
	 * @param resposta
	 *            resposta que ira dar para a categoria.
	 * @return
	 * @throws BusinessException
	 */
	public Resposta jogar(Jogador jogador, Categoria categoria, String resposta)
			throws BusinessException;

}
