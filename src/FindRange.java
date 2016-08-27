
import java.util.Scanner;

public class FindRange {
	public static void main(String[] args) {
		int minInt = Integer.MAX_VALUE;
		int maxInt = Integer.MIN_VALUE;
		float sum = 0;
		float numOfValidInputs = 0;
		int currentInt = 0;
		System.out.print("?");
		Scanner userInput = new Scanner(System.in);
		
		while (userInput.hasNext()) {
			try {
				currentInt = Integer.parseInt(userInput.nextLine());
				if (currentInt == 0) {
					break;
				}
				sum +=currentInt;
				numOfValidInputs++;
				
				System.out.print("?");

				if (currentInt > maxInt) {
					maxInt = currentInt;
				}

				if (currentInt < minInt) {
					minInt = currentInt;
				}
			} catch (NumberFormatException e) {
				continue;
			}

		}

		if (maxInt == Integer.MIN_VALUE && minInt == Integer.MAX_VALUE) {
			System.out.println("Please enter a number other than 0.");
		} else {
			System.out.println("smallest: " + minInt);
			System.out.println("largest: " + maxInt);
			System.out.println("sum: " + (int)sum);
			System.out.format("mean: %.3f%n", sum/numOfValidInputs);
		}

	}
}
