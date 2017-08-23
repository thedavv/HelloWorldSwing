package sk.racek;

import javax.swing.JFrame;

public class HelloFrame extends JFrame{
	private static final long serialVersionUID = -3752274938135627509L;
	
	public HelloFrame(){
		add(new HelloWorldComponent());
		pack();
	}
}
