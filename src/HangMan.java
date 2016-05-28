import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class HangMan implements KeyListener {
	Stack<String> puzzles = new Stack<String>();
	ArrayList<JLabel> boxes = new ArrayList<JLabel>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String currentPuzzle;

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.createUI();
		hm.addPuzzles();
		hm.run();
	}
	public void createUI() {
		frame.add(panel);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void addPuzzles() {
		puzzles.push("Programmer");
		puzzles.push("Teachers");
		puzzles.push("Interface");
		puzzles.push("MainMethod");
		
	}
	public void nextPuzzle() {
		panel.removeAll();
		currentPuzzle = puzzles.pop();
		for(int i = 0; i < currentPuzzle.length(); i++) {
			JLabel label = new JLabel();
			label.setText("_");;
			panel.add(label);
			boxes.add(label);
		}
	}
	public void run() {
		
	}
	public void updateSpacesWithUserInput(char keyChar) {
		for (int i = 0; i < currentPuzzle.length(); i++) {
			if (currentPuzzle.charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		nextPuzzle();

	}
}
