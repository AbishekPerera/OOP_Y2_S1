package ex02;

public class DeadLock {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {

		ThreadOne tone = new ThreadOne(lock1, lock2);
		ThreadTwo ttwo = new ThreadTwo(lock2, lock1);

		tone.start();
		ttwo.start();

	}
}
