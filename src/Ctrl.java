import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ctrl extends JFrame implements ActionListener {
	JButton button1, button2;

	public Ctrl(){
		setSize(300, 100);
		setTitle("Control Panel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(0, Window.HEIGHT + 10);

		getContentPane().setLayout(new GridLayout(1, 2));
		button1 = new JButton("加速");
		button2 = new JButton("減速");
		getContentPane().add(button1);
		getContentPane().add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == button1){
			Draw.speed = Draw.speed + 1;
		} else {
			Draw.speed = Draw.speed - 1;
			if (Draw.speed < 0){
				Draw.speed = 0;
			}
		}
	}
}
