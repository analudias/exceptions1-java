package model.exceptions;

//Runtime Exception - tipo de exece��o que o compilador n�o obriga voc� a tratar
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
