package logo.expressions;

public class Nothing {

	public static final Nothing VALUE = new Nothing();
	
	private Nothing(){}
	
	public String toString(){
		return "(Nothing)";
	}
}
