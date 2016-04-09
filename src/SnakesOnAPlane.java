public class SnakesOnAPlane {
	public static void main(String[] args) {
		Plane plane = new Plane();
		float totalViciousness = 0;
		int deathProbability;
		for (int i = 0; i < plane.snakes.size(); i++) {
			Snake snake = plane.snakes.get(i);
			if(snake.getVenomous()){
				totalViciousness += snake.getViciousness();
			}
		}
		System.out.println(totalViciousness/plane.numberPassengers);
	}
}
