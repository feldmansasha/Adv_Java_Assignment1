package aleksandrfeldman_sec003_ex03;

public class DataQueueTest {

	public static void main(String[] args) {
		 DataQueue<String> stringQueue=new DataQueue<>();
		 System.out.println("Queue of Strings:");
		 System.out.println("Let's add few words:");
		 stringQueue.enqueue("Hello");
	     stringQueue.enqueue("world");
	     stringQueue.enqueue("from");
	     stringQueue.enqueue("Barrie");
	     stringQueue.enqueue("Canada");
	     stringQueue.printQueue();
	     System.out.println("Let's delete word Barrie");
	     stringQueue.dequeue("Barrie");
	     stringQueue.printQueue();
	     
	     System.out.println("\nQueue of Strings:");
	     DataQueue<Double> stockQueue = new DataQueue<>();
	     System.out.println("Let's add few numbers:");
	     stockQueue.enqueue(543.78);
	     stockQueue.enqueue(2356.77);
	     stockQueue.enqueue(75436.1);
	     stockQueue.enqueue(101.654);
	     stockQueue.enqueue(13.44);
	     stockQueue.printQueue();
	     System.out.println("Let's delete 2356.77:");
	     stockQueue.dequeue(2356.77);
	     stockQueue.printQueue();
	}

}
