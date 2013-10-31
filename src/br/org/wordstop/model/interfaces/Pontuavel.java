package br.org.wordstop.model.interfaces;

import br.org.wordstop.model.enumerator.Conclusao;

/**
 * Idenfica��o para classes pontu�veis.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public interface Pontuavel {
	/**
	 * Pontuar conforme a conclus�o passada por par�metro.
	 * 
	 * @param conclusao
	 * @return
	 */
	public int pontuar(Conclusao conclusao);
}
