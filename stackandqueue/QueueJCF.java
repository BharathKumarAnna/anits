package stackandqueue;

import java.util.*;

public class QueueJCF {
	public static void main(String[] args) {
//		Queue<Integer> queue=new LinkedList<>();
		
		Queue<Integer> queue=new ArrayDeque<>();
		
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		queue.peek();
		System.out.println(queue.peek());
	
	}
	}

