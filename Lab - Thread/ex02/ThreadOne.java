package ex02;

public class ThreadOne extends Thread {
	
	private Object lock1;
	private Object lock2;

	public ThreadOne(Object lock1, Object lock2) {
		super();
		this.lock1 = lock1;
		this.lock2 = lock2;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Strarted Executing Threa 1");

		
		synchronized (lock1) {

			System.out.println("Thread one is holding lock 1 ....");

			try {
				Thread.sleep(10);
				lock1.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Thread 1 is awaiting for lock 2");
			
			synchronized (lock2) {

				System.out.println("thread one is holding lock 1 and lock 2");
			}
		}
	}
}
