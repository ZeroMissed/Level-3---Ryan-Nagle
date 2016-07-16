import java.util.ArrayList;

public class MasterOrder {
ArrayList<CookieOrder> orders;
public MasterOrder() {
		orders = new ArrayList<CookieOrder>();
	}

	public ArrayList<CookieOrder> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<CookieOrder> orders) {
		this.orders = orders;
	}
	
	public int getTotalBoxes(){
		int count = 0;
		for(CookieOrder i : orders) {
			count += i.getNumBoxes();
		}
		return count;
	}
	public void addOrder(CookieOrder newOrder) {
		orders.add(newOrder);
	}
	public int removeVariety(String variety) {
		int count = 0;
		for(int i = orders.size() - 1; i >= 0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				count += orders.get(i).getNumBoxes();
				orders.remove(i);
			}
		}
		return count; 
	}

}
