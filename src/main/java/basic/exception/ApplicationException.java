package basic.exception;

/**
 * application exception
 *
 * @author linuxea
 * @date 2018/4/3
 */
public class ApplicationException extends Exception {
	
	public ApplicationException() {
		super();
	}
	
	public ApplicationException(String message) {
		super(message);
	}
	
	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ApplicationException(Throwable cause) {
		super(cause);
	}
	
	protected ApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
