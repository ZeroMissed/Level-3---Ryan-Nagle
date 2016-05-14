import java.util.Stack;

public class StackPractice { public static void main(String[] args) {
	Stack s = new Stack();
	String name = "Liam";
	for(char i : name.toCharArray()) {
		s.push(i);
	}
	while(!s.empty()) {
		System.out.println(s.pop());
	}
}

}
