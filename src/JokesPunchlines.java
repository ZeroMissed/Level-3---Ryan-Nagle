import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JokesPunchlines implements ActionListener { 
	JButton button = new JButton("Tell a Joke");
	String joke = "";
	String punchline = "";
	ArrayList<String> jokes = new ArrayList<String>();
	ArrayList<String> punchlines = new ArrayList<String>();
	
	public static void main(String[] args) {
	new JokesPunchlines().createUI();
}

private void createUI() {
	
	jokes.add("What do you call a fish with no eyes?");
	punchlines.add("A fsh");
	jokes.add("I miss my umbilical cord!");
	punchlines.add("I grew attached to it");
	jokes.add("What did Mario say when he broke up with Princess Peach?");
	punchlines.add("It's not you, it's a-me ahh, Mario!");
	
	
	// TODO Auto-generated method stub
	JFrame frame = new JFrame();
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
		int random = new Random().nextInt(jokes.size());
		joke = jokes.get(random);
		punchline = punchlines.get(random);
		speak(joke + punchline);
	}

}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }


}
