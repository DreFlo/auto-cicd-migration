/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.transformationsdsl.dsl.ui.tests;

import com.google.inject.Injector;
import d.fe.up.pt.cicd.transformationsdsl.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("d.fe.up.pt.cicd.transformationsdsl.dsl.DSL");
	}

}
