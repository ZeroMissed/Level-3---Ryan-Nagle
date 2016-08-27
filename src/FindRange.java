
	import java.util.Scanner;

	public class FindRange {
		public static void main(String[] args) {
			int minInt = Integer.MAX_VALUE;
			int maxInt = Integer.MIN_VALUE;
			int currentInt = 0;
			System.out.print("?");
			Scanner userInput = new Scanner(System.in);
			while (userInput.hasNext()) {
				System.out.print("?");
				currentInt = Integer.parseInt(userInput.nextLine());
				if(currentInt > maxInt){
					maxInt = currentInt;
				}
				if(currentInt < minInt){
					minInt = currentInt;
				}
				
			}

		}
	}


