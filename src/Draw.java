import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
	public static int add = 0;
	public static int speed = 10;
	@Override
	public void paintComponent(Graphics g){
		int midX = Window.WIDTH / 2, midY = Window.HEIGHT / 2;

		g.setColor(Color.RED);
		g.drawLine(0, midY, Window.WIDTH, midY);
		g.drawLine(midX, 0, midX, Window.HEIGHT);

		g.setColor(Color.BLACK);
		for (int x = 0; x < Window.WIDTH; x = x + 1){
			int y1 = (int)(Math.sin((x - midX + add) / 100.0) * 100.0 + midY);
			int y2 = (int)(Math.sin((x - midX + 1 + add) / 100.0) * 100.0 + midY);
			g.drawLine(x, y1, x + 1, y2);
		}

		g.drawString("Speed: " + speed, 10, 10);
	}
}
