package br.org.wordstop.model.interfaces;

import br.org.wordstop.model.enumerator.Conclusao;

/**
 * Idenficação para classes pontuáveis.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public interface Pontuavel {
	/**
	 * Pontuar conforme a conclusão passada por parâmetro.
	 * 
	 * @param conclusao
	 * @return
	 */
	public int pontuar(Conclusao conclusao);
}
