package d.fe.up.pt.cicd.jenkins.acceleo.services;

public class CICD2Jenkins {
	public String quoteString(String string) {
		return string.replaceAll("^|$", "'");
	}
}
