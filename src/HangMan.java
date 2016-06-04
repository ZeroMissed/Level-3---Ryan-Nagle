import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class HangMan implements KeyListener {
	Stack<String> puzzles = new Stack<String>();
	ArrayList<JLabel> boxes = new ArrayList<JLabel>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String currentPuzzle;
	int lives = 9;
	JLabel livesLabel = new JLabel();

	public static void main(String[] args) {
		HangMan hm = new HangMan();
		hm.createUI();
		hm.addPuzzles();
	}
	public void createUI() {
		frame.add(panel);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
	}

	public void addPuzzles() {
		puzzles.push("programmer");
		puzzles.push("teachers");
		puzzles.push("interface");
		puzzles.push("mainmethod");
		
	}
	public void nextPuzzle() {
		lives = 9;
		livesLabel.setText(Integer.toString(lives) + " lives remaining!");
		livesLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
		panel.removeAll();
		panel.add(livesLabel);
	
		boxes.removeAll(boxes);
		currentPuzzle = puzzles.pop();
		for(int i = 0; i < currentPuzzle.length(); i++) {
			JLabel label = new JLabel();
			label.setText("_");;
			panel.add(label);
			boxes.add(label);
			frame.pack();
		}
	}
	
	public void updateSpacesWithUserInput(char keyChar) {
		boolean right = false;
		for (int i = 0; i < currentPuzzle.length(); i++) {
			if (currentPuzzle.charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
				frame.pack();
				right = true;
			}
		}
		if(!right)
			lives--;
		livesLabel.setText(Integer.toString(lives) + " lives remaining!");
		if(lives<=0) {
			JOptionPane.showMessageDialog(null, "You LOSE");
			System.exit(0);
		}
	}
	
	public void checkAnswers() {
		StringBuffer answer = new StringBuffer();
		for (JLabel textBox : boxes) {
			answer.append(textBox.getText());
		}
		if(answer.toString().equals(currentPuzzle)) {
			JOptionPane.showMessageDialog(null, "Good Job!");
			nextPuzzle();
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER)
			nextPuzzle();
		else {
			updateSpacesWithUserInput(e.getKeyChar());
			checkAnswers();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
