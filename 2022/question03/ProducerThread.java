package question03;

import java.util.ArrayList;

public class ProducerThread implements Runnable{
	
	ArrayList<Integer> queue = new ArrayList<>();
	static int val = 1;
	
	public ProducerThread(ArrayList<Integer> queue) {
		super();
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		synchronized (queue) {
	
				System.out.println("Producer Started");
				System.out.println("Producer ading values = "+(10*val)+" the queue");
				
				queue.add(10*val);
				val++;
				
				try {
					Thread.sleep(1000);
					queue.wait();
					
					Thread producer = new Thread(new ProducerThread(queue));
					Thread consumer = new Thread(new ConsumerThread(queue));
					
					producer.start();
					consumer.start();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			
			
		}
		
	}
	
	

}
