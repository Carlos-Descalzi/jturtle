package logo.expressions;

import java.util.ArrayList;
import java.util.List;

import logo.functions.Function;
import logo.ui.Context;

public class UserFunction 
	implements Function{

	private String name;
	private List<String> variables = new ArrayList<String>();
	private List<Statement> statements = new ArrayList<Statement>();

	public UserFunction(String name,List<String> variables,List<Statement> statements){
		this.name = name;
		this.variables.addAll(variables);
		this.statements.addAll(statements);
	}

	@Override
	public Object invoke(Context context,List<Object> arguments) {
		
		context = context.subContext();
		
		int nArgs = Math.min(arguments.size(), variables.size());
		
		for (int i=0;i<nArgs;i++){
			context.setVariable(variables.get(i), arguments.get(i));
		}
		
		for (Statement statement: statements){
			statement.execute(context);
		}
		
		return null;
	}

	@Override
	public String getName() {
		return name;
	}
}
