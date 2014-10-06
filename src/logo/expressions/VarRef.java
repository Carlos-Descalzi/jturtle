package logo.expressions;

import logo.ui.Context;


public class VarRef implements Expression {

	private String varName;
	
	public VarRef(String varName){
		this.varName = varName;
	}

	public String getVarName() {
		return varName;
	}

	@Override
	public Object evaluate(Context context) {
		return context.getVariable(varName);
	}
}
