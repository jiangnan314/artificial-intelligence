package HTTP;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

	private String jobName = "";

	public MyTimerTask(String jobName) {
		super();
		this.jobName = jobName;
	}

	@Override
	public void run() {
		System.out.println("execute " + jobName);
	}

	public static void main(String[] args) {
		Timer timer = new Timer();
		long delay1 = 1 * 1000;
		long period1 = 1000;
		// 从现在开始 1 秒钟之后，每隔 1 秒钟执行一次 job1
		timer.schedule(new MyTimerTask("job1"), delay1, period1);

	}
}
