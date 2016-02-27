import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider { public static void main(String[] args) {
	ArrayList<String> dinner = new ArrayList<String>();
	dinner.add(new String("Taco"));
	dinner.add(new String("Pizza"));
	dinner.add(new String("Pasta"));
	int random = new Random().nextInt(dinner.size);
	System.out.println(dinner.get(random));
}

}
