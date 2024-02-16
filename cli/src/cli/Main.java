package cli;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import cli.parsers.*;
import cli.parsers.exceptions.*;

public class Main {

	public static void main(String[] args) {
		GitHubActionsParser parser = new GitHubActionsParser();
		
		try {
			parser.parse(Files.readString(Path.of(args[0])));
		} catch (SyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
