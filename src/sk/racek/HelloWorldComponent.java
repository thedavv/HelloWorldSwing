package sk.racek;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {
	private static final long	serialVersionUID = -1272161087896473407L;

	private static final String	msg				 = "Hello World";

	private static final int	DEFAULT_WIDTH	 = 300;
	private static final int	DEFAULT_HEIGHT	 = 200;
    

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		FontMetrics fm = g2d.getFontMetrics();
	    Rectangle2D r = fm.getStringBounds(msg, g2d);
		int centeredString[] = centerStringXY(g2d, fm, r);
	    
		g.drawString(msg, centeredString[0], centeredString[1]);
		
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

	public int[] centerStringXY(Graphics2D g, FontMetrics fm, Rectangle2D r){
	        int x = (this.getWidth() - (int) r.getWidth()) / 2;
	        int y = (this.getHeight() - (int) r.getHeight()) / 2 + fm.getAscent();
	        return new int[]{x, y};
	}
}
