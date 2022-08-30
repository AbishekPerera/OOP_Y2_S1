package question03;

import java.util.ArrayList;

public class ConsumerThread implements Runnable {

	ArrayList<Integer> queue = new ArrayList<>();

	public ConsumerThread(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (queue) {

			System.out.println("Consumer started");
			System.out.println("Consumer Thread consumes " + queue.get(0));

			queue.remove(0);
			// queue.removeAll(queue);
			System.out.println("Elements inQueue = " + queue);
			
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			queue.notify();

		}
	}

}
