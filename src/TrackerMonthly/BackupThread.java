package TrackerMonthly;

public class BackupThread extends Thread {
	public void run() {
		while (true) {
			try {
				Thread.sleep(10000);
				System.out.println(" Backup completed....");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
