/*
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.expressions.dsl.ui.tests;

import com.google.inject.Injector;
import d.fe.up.pt.cicd.gha.expressions.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class GHAExpressionsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return DslActivator.getInstance().getInjector("d.fe.up.pt.cicd.gha.expressions.dsl.GHAExpressions");
	}

}