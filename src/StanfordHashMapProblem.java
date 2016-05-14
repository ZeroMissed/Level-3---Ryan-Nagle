import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StanfordHashMapProblem {
	public int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
//		int amountOfPairs = 0;
//		for(Entry<String, String> a: map1.entrySet()) {
//			for(Entry<String, String> b: map2.entrySet()) {
//				if(a.equals(b))
//					amountOfPairs++;
//			}
//		}
//		
//		return amountOfPairs;
		map1.entrySet().retainAll(map2.entrySet());
		return map1.size();
	}
}