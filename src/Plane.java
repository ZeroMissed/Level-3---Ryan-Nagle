import java.util.ArrayList;
import java.util.Random;


public class Plane {
	int numberPassengers = 100;
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	Random random = new Random();
	
	int rand = random.nextInt(50) + 51; 
	public Plane() {
	for(int i = 0; i < rand; i++){
		snakes.add(new Snake());
	}
	}
}
