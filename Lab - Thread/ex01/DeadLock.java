package ex01;

public class DeadLock {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {
		
		ThreadOne tone = new ThreadOne();
		Threadtwo ttwo = new Threadtwo();
		
		tone.start();
		ttwo.start();

	}

	// thread one

	static class ThreadOne extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println("Strarted Executing Threa 1");

			synchronized (lock1) {

				System.out.println("Thread one is holding lock 1 ....");

				try {
					Thread.sleep(10);
				//	lock1.wait();
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

	// Thread 2

	static class Threadtwo extends Thread {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println("Strarted Executing Thread 2");

			synchronized (lock2) {

				System.out.println("Thread two is holding lock 2 ....");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Thread 2 is awaiting for lock 1");

				synchronized (lock1) {

					System.out.println("thread two is holding lock 1 and lock 2");
				
				}
			}

		}

	}
	
	
	//For Runnable
	
//	public static Object lock1 = new Object();
//	public static Object lock2 = new Object();
//
//	public static void main(String[] args) {
//		
//		ThreadOne tone = new ThreadOne();
//		Threadtwo ttwo = new Threadtwo();
//		
//		Thread t1 = new Thread(tone);
//		Thread t2 = new Thread(ttwo);
//		
//		t1.start();
//		t2.start();
//
//	}
//
//	// thread one
//
//	static class ThreadOne implements Runnable {
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//			
//			System.out.println("Strarted Executing Threa 1");
//
//			synchronized (lock1) {
//
//				System.out.println("Thread one is holding lock 1 ....");
//
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				System.out.println("Thread 1 is awaiting for lock 2");
//
//				synchronized (lock2) {
//
//					System.out.println("thread one is holding lock 1 and lock 2");
//				}
//			}
//
//		}
//
//	}
//
//	// Thread 2
//
//	static class Threadtwo implements Runnable {
//
//		@Override
//		public void run() {
//			// TODO Auto-generated method stub
//	
//			System.out.println("Strarted Executing Thread 2");
//
//			synchronized (lock2) {
//
//				System.out.println("Thread one is holding lock 2 ....");
//
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//				System.out.println("Thread 2 is awaiting for lock 1");
//
//				synchronized (lock1) {
//
//					System.out.println("thread one is holding lock 1 and lock 2");
//				}
//			}
//
//		}
//
//	}

}
