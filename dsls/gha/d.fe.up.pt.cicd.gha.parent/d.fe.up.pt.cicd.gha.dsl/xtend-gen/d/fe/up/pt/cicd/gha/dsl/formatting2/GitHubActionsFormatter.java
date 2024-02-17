/**
 * generated by Xtext 2.33.0
 */
package d.fe.up.pt.cicd.gha.dsl.formatting2;

import com.google.inject.Inject;
import d.fe.up.pt.cicd.gha.dsl.services.GitHubActionsGrammarAccess;
import d.fe.up.pt.cicd.gha.metamodel.GHA.And;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Expression;
import d.fe.up.pt.cicd.gha.metamodel.GHA.Or;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GitHubActionsFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GitHubActionsGrammarAccess _gitHubActionsGrammarAccess;

  protected void _format(final Or or, @Extension final IFormattableDocument document) {
    document.<Expression>format(or.getRhs());
    document.<Expression>format(or.getLhs());
  }

  protected void _format(final And and, @Extension final IFormattableDocument document) {
    document.<Expression>format(and.getRhs());
    document.<Expression>format(and.getLhs());
  }

  public void format(final Object and, final IFormattableDocument document) {
    if (and instanceof And) {
      _format((And)and, document);
      return;
    } else if (and instanceof Or) {
      _format((Or)and, document);
      return;
    } else if (and instanceof XtextResource) {
      _format((XtextResource)and, document);
      return;
    } else if (and instanceof EObject) {
      _format((EObject)and, document);
      return;
    } else if (and == null) {
      _format((Void)null, document);
      return;
    } else if (and != null) {
      _format(and, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(and, document).toString());
    }
  }
}