package collections;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		//priorityQueue has element will sort elements priority wise
		//It use comparable interface comapreTo method for deciding the priority of elements addedd
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		//LinkedList
		System.out.println("output from LinkedList implementsation of queue interface:");
		q = new LinkedList<Integer>();
		q.offer(15);
		q.offer(10);
		q.offer(12);
		q.offer(1);
		
		//peak returns ele at mouth of queue but doesnot remove it.
		//poll returns ele at mouth of queue but also remove it from mouth of queue so that
		//next element then moves in to mouth.
		System.out.println(q.size());
		System.out.println("peek:"+q.peek());
		System.out.println(q.size());
		
		System.out.println("poll:"+q.poll());
		System.out.println(q.size());
		
		System.out.println("poll:"+q.poll());
		System.out.println(q.size());
		
		q.offer(15);
		q.offer(10);
		q.offer(12);
		q.offer(1);
		
		//peak returns ele at mouth of queue but doesnot remove it.
		//poll returns ele at mouth of queue but also remove it from mouth of queue so that
		//next element then moves in to mouth.
		System.out.println(q.size());
		System.out.println("peek:"+q.peek());
		System.out.println(q.size());
		
		System.out.println("poll:"+q.poll());
		System.out.println(q.size());
		
		System.out.println("poll:"+q.poll());
		System.out.println(q.size());
		

		

	}

}
