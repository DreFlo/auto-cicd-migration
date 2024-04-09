package d.fe.up.pt.cicd.circleci.acceleo.services;

import java.util.List;

public class CICD2CircleCI {
	public List<String> splitString(String string, String regex) {
		return List.of(string.split(regex));
	}
	
	public String logString(String string) {
		System.out.println("STRING");
		System.out.println(string);
		System.out.println("ENDSTRING");
		return string;
	}
}
