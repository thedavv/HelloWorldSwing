package sk.racek;

import javax.swing.JFrame;

public class HelloFrameDemo {
	public static void main(String[] args) {
		JFrame frame = new HelloFrame();
		frame.setTitle("Hello world example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
