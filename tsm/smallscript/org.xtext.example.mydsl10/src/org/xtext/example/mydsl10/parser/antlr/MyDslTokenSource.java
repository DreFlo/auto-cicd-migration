/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl10.parser.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.parser.antlr.AbstractIndentationTokenSource;
import org.xtext.example.mydsl10.parser.antlr.internal.InternalMyDslParser;

public class MyDslTokenSource extends AbstractIndentationTokenSource {

	public MyDslTokenSource(TokenSource delegate) {
		super(delegate);
	}

	@Override
	protected boolean shouldSplitTokenImpl(Token token) {
		// TODO Review assumption
		return token.getType() == InternalMyDslParser.RULE_WS;
	}

	@Override
	protected int getBeginTokenType() {
		// TODO Review assumption
		return InternalMyDslParser.RULE_BEGIN;
	}

	@Override
	protected int getEndTokenType() {
		// TODO Review assumption
		return InternalMyDslParser.RULE_END;
	}

}
