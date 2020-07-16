package model.exceptions;

//Runtime Exception - tipo de execeção que o compilador não obriga você a tratar
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
