import java.util.ArrayList;

public class MyStack {
	private ArrayList<String> values = new ArrayList<String>();
	
	public void push(String value) {
		values.add(value);
	}
	public String pop() {
		return values.remove(values.size() - 1);
	}
	public String peek() {
		return values.get(values.size() - 1);
	}
	public boolean empty() {
		return values.isEmpty();
	}
}
