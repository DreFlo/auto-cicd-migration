package d.fe.up.pt.cicd.transformationsdsl.acceleo.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TDSL2ATL {
	public String unquoteString(String string) {
		Matcher matcher = Pattern
				.compile("\"((?:\\\\.|[^\"\\\\])*)\"|'((?:\\\\.|[^'\\\\])*)'")
				.matcher(string);
		
		if (matcher.find()) {
			string = matcher.group(1);
		}
		
		return string;
	}
}
