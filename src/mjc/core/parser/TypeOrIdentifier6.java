package mjc.core.parser;

import mjc.core.parser.interfaces.IExpression;
import mjc.core.parser.interfaces.IExpressionArgu;
import mjc.core.parser.interfaces.IIdentifier;
import mjc.core.parser.interfaces.ITypeOrIdentifier;

public class TypeOrIdentifier6 implements ITypeOrIdentifier{

	//TypeOrIdentifier ::= Identifier �(� ExpressionArgu �)�
	
	IIdentifier identifier;
	IExpressionArgu expressionArgu;
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return identifier.getValue()+"("+expressionArgu.getValue()+")";
	}
	
	
}
