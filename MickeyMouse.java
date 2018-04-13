import java.awt.Color;
import java.awt.Graphics;

public class MickeyMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//draw a panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		
		//get instance graphics object
		Graphics g = panel.getGraphics();
		
		panel.setBackground(Color.YELLOW);
		
		g.setColor(Color.BLUE);
		g.fillOval(50, 20, 40, 40);
		g.fillOval(130, 20, 40, 40);
		
		g.setColor(Color.RED);
		g.fillRect(70, 40, 80, 70);
		
		g.setColor(Color.BLACK);
		g.drawLine(70, 75, 150, 75);
		
		
		

	}

}
