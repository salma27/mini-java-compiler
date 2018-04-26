package mjc.core.parser;

import mjc.core.parser.interfaces.IExpression;
import mjc.core.parser.interfaces.IExpressionItems;

public class ExpressionItems12 implements IExpressionItems {
	// ExpressionItems::= "/" Expression
	IExpression expression;

	public ExpressionItems12(IExpression expression) {
		super();
		this.expression = expression;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "/" + expression.getValue();
	}
}
