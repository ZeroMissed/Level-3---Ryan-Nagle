
public class Snake {
private boolean venomous;
private int viciousness;

public Snake() {
	this.viciousness = new Randomness().randomNumber();
	this.venomous = new Randomness().truth();
}

public boolean getVenomous() {
	return venomous;
}

public void setVenomous(boolean venomous) {
	this.venomous = venomous;
}

public int getViciousness() {
	return viciousness;
}

public void setViciousness(int viciousness) {
	this.viciousness = viciousness;
}

}
