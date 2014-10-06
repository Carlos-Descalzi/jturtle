package logo.expressions;

import java.util.ArrayList;
import java.util.List;

import logo.ui.Context;

public class Statement {

	private List<Sentence> sentences = new ArrayList<Sentence>();
	
	public Statement(List<Sentence> sentences){
		this.sentences.addAll(sentences);
	}
	
	public void execute(Context context){
		for (Sentence sentence:sentences){
			sentence.evaluate(context);
		}
	}
}
