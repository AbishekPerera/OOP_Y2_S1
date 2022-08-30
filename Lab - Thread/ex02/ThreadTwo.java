package ex02;

public class ThreadTwo extends Thread {

	private Object lock2;
	private Object lock1;

	public ThreadTwo(Object lock2, Object lock1) {
		super();
		this.lock2 = lock2;
		this.lock1 = lock1;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Strarted Executing Thread 2");

		synchronized (lock2) {

			System.out.println("Thread one is holding lock 2 ....");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Thread 2 is awaiting for lock 1");

			synchronized (lock1) {

				System.out.println("thread Two is holding lock 1 and lock 2");
				lock1.notify();
			}
			
		}
	}

}
