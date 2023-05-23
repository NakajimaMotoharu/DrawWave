import javax.swing.*;

public class Window extends JFrame {
	public static final int WIDTH = 1280, HEIGHT = 720;
	public Window(String title){
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);

		getContentPane().add(new Draw());

		setVisible(true);
	}
}
