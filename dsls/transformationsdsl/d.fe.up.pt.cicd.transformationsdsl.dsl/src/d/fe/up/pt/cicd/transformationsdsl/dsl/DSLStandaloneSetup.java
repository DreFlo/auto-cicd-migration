/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.transformationsdsl.dsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DSLStandaloneSetup extends DSLStandaloneSetupGenerated {

	public static void doSetup() {
		new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
