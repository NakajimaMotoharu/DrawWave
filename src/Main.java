import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		Window frame = new Window("Test");
		Ctrl ctrl = new Ctrl();

		Timer timer = new Timer(false);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Draw.add = Draw.add + Draw.speed;
				frame.repaint();
			}
		};
		timer.schedule(task, 0, 1000 / 60);
	}
}
