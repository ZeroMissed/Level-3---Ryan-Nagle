import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BandNameGenerator implements ActionListener { 
	JButton button = new JButton("Generate a Band Name");
	ArrayList<String> p1 = new ArrayList<String>();
	ArrayList<String> p2 = new ArrayList<String>();
	
	public static void main(String[] args) {
	new BandNameGenerator().createUI();
}

private void createUI() {
	p1.add("Firey");
	p2.add("Snake");
	p1.add("Restless");
	p2.add("Cake");
	p1.add("Loving");
	p2.add("Ocean");
	
	
	// TODO Auto-generated method stub
	JFrame frame = new JFrame("Band Name Generator");
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	frame.pack();
	frame.show();
	button.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed == button) {
		int rand1 = new Random().nextInt(p1.size());
		int rand2 = new Random().nextInt(p2.size());
		JOptionPane.showMessageDialog(null, "You're band name is " + p1.get(rand1) + " " + p2.get(rand2));
	}

}
}

