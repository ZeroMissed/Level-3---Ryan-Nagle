import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DressPoll implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton whiteB = new JButton("White");
	JButton blueB = new JButton("Blue");
	JButton calcB = new JButton("Calculate Results");
	HashMap<String, String> dressColors = new HashMap<String, String>();
	float white = 0;
	float blue = 0;

	public static void main(String[] args) {
		DressPoll ins = new DressPoll();
		ins.createUI();
	}

	private void createUI() {	
		frame.add(panel);
		panel.add(whiteB);
		panel.add(blueB);
		panel.add(calcB);
		frame.pack();
		frame.show();
		whiteB.addActionListener(this);
		blueB.addActionListener(this);
		calcB.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(calcB))
			System.out.println((blue / (blue + white)) * 100 + "% of people think the dress is blue and " + (white / (blue + white)) * 100 + "% of people think the dress is white!");
		if(e.getSource().equals(whiteB)) {
			white++;
		}
		if(e.getSource().equals(blueB)) {
			blue++;
		}
	}

}
