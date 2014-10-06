package logo.expressions;

import java.util.List;

import logo.ui.Context;

public class Block implements Sentence {

	private List<String> variables;
	private List<Sentence> sentences;
	
	public Block(List<String>variables,List<Sentence> sentences){
		this.variables = variables;
		this.sentences = sentences;
	}
	@Override
	public Object evaluate(Context context) {
		
//		Context subContext = context.subContext();
		
		for (Sentence sentence:sentences){
			sentence.evaluate(context);
		}
		
		return Nothing.VALUE;
	}

}
