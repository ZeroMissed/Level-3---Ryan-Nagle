import java.util.Random;

public class Randomness {
Random numberGenerator = new Random();
  public boolean truth(){
	  return numberGenerator.nextBoolean();
  }
  public int randomNumber(){
	  return numberGenerator.nextInt(10) + 1;
  }
	
}
