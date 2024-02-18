package cli.parsers.exceptions;

import java.util.List;

public class SyntaxException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SyntaxException(List<String> messages) {
        super("Syntax Error: " + String.join("\n", messages));
    }

	public SyntaxException(String message) {
		super("Syntax Error: " + message);
	}
}
