import java.util.Comparator;

class LengthSorter implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1.toString().length() > o2.toString().length()){
			return 1;
		}
		else if(o1.toString().length() == o2.toString().length()){
			return 0;
		} else {
			return -1;
		}
	}
	
}
