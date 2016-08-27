import java.util.ArrayList;

public class OncogeneDetector {
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequences, String candidate) {
		if(cancerSequences.isEmpty()) {
			throw new IllegalArgumentException("cancerSequences must contain at least one element");
		}
		if(healthySequences.isEmpty()) {
			throw new IllegalArgumentException("healthySequences must contain at least one element");
		}
		if(!candidate.matches("[ATGC]*")){
			throw new IllegalArgumentException("candidate must contain only the letters A, C, G or T");
		}
		for(String i : healthySequences) {
			if(!i.matches("[ATGC]*")){
				throw new IllegalArgumentException();
			}
		}
		for(String i : cancerSequences) {
			if(!i.matches("[ATGC]*")){
				throw new IllegalArgumentException();
			}
		}
		float cancerous = 0;
		float healthy = 0;
		for(String i:healthySequences) {
			if(i.contains(candidate)) 
				healthy++;
		}
		for(String i: cancerSequences) {
			if(i.contains(candidate)) 
				cancerous++;
		}
		if(cancerous/ (float) cancerSequences.size() > healthy/ (float) healthySequences.size()){
		  return true;
		}
		  return false;
	} 
}
