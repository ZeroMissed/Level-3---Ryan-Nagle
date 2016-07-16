import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int numOf = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i) == true) {
				numOf++;
			}
		}
		return numOf;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > tallest) {
			    tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String biggestString = "";
		int biggest = 0;
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > biggest) {
				
				biggestString = words.get(i);
			    biggest = words.get(i).length();
			    
			}
		}
		return biggestString;
		
	}

	public static boolean containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		ArrayList<String> word = new ArrayList<String>();
		for(int i = 0; i < message.size(); i++) {
			if(!(message.get(i).equals("/"))) {
				word.add(message.get(i));
			}
			System.out.println(word.toString());
			if(message.get(i).equals("/")) {
				if(word.toString().equals("··· ––– ···")) {
					return true;
				} else {
					word.clear();
				}
			}
			
		}
		return false;
	}
	public static List<String> sortDNA(List<String> sequences) {
		//Array
			Collections.sort(sequences, new LengthSorter());
			return sequences;
	}
	public static List<String> sortScores(List<String> sequences) {
}
