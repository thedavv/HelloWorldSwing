package sk.racek;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {
	private static final long serialVersionUID = -1272161087896473407L;
	
	private static final String msg = "Hello World"; 
	
	private static final int  DEFAULT_WIDTH	   = 300;
	private static final int  DEFAULT_HEIGHT   = 200;
	
	@Override
	public void paintComponent(Graphics g) {
		//System.out.println(getWidth());
		//System.out.println(getHeight());
		g.drawString(msg ,getWidth() / 2 - msg.length() *2, getHeight() / 2);
		g.getFont();
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}
}
