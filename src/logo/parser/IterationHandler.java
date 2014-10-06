package logo.parser;

public class IterationHandler {
	int count;
	int times;
	int mark;

	public int getMark(){
		return mark;
	} 
	public void setMark(int mark){
		this.mark = mark;
	}
	public void start(Object times){
		count = 0;
		this.times = (Integer)times;
	}
	
	public boolean done(){
		return count == times;
	}
	
	public void next(){
		count++;
	}
}
