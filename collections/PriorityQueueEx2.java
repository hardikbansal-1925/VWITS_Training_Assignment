package collections;
import java.util.Queue;
import java.util.PriorityQueue;
public class PriorityQueueEx2 {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		
		q.offer("Hardik");
		q.offer("Ayush");
		q.offer("Shubham");
		q.offer("Yash");
		q.offer("Naman");
		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println("Peek:"+q.peek());
		System.out.println("Poll:"+q.poll());
		
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		System.out.println("Peek:"+q.peek());
		System.out.println("Poll:"+q.poll());
		

	}

}
