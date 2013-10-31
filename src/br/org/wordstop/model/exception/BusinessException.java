package br.org.wordstop.model.exception;

/**
 * Classe que representa a excessão de exceção de regra de negócio.
 * 
 * @author Maicon Machado Gerardi da Silva
 * 
 */
public class BusinessException extends Throwable {
	private static final long serialVersionUID = -1383874147619436415L;
	private String message;

	public BusinessException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
