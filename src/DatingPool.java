import java.util.HashMap;

public class DatingPool { public static void main(String[] args) {
	HashMap<String, String> eligibleBachlor = new HashMap<String, String>();
	eligibleBachlor.put("Freddie", "Frog");
	eligibleBachlor.put("Jeff", "Human");
	eligibleBachlor.put("James", "Elefant");
	eligibleBachlor.put("Clarence", "Frog");
	eligibleBachlor.put("Jack", "Human");
	eligibleBachlor.put("Alex", "Frog");
	int frog = 0;
	for(String i: eligibleBachlor.values()) {
		if(i.equalsIgnoreCase("frog")) 
			frog++;
	}
	System.out.println("She can kiss " + frog + " of them!");
}

}
