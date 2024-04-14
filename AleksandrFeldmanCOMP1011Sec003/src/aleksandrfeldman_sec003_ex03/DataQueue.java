package aleksandrfeldman_sec003_ex03;
import java.util.PriorityQueue;

public class DataQueue<T> {
	PriorityQueue<T> queue=new PriorityQueue<>();
	//constructor
	public DataQueue() {}
	
	//function to add element
	public void enqueue(T element) {
		queue.offer(element);
	}
	
	//function to delete element
	public void dequeue(T element) {
		queue.remove(element);
	}
	
	//function to print elements
	public void printQueue() {
		for(T element : queue) {
			System.out.print(element+"\t");
		}
		System.out.println();
	}
}
