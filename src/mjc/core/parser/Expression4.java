package mjc.core.parser;

import mjc.core.parser.interfaces.IExpression;
import mjc.core.parser.interfaces.IExpressionPrime;

public class Expression4 implements IExpression {
	// Expression ::= "false" Expression`
	IExpressionPrime expressionPrime;

	public Expression4(IExpressionPrime expressionPrime) {
		this.expressionPrime = expressionPrime;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "false" + expressionPrime.getValue();
	}
}
