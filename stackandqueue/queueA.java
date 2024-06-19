package stackandqueue;

import java.util.Arrays;

public class queueA {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		
	
	 Queue(int size){
		this.size = size;
		arr = new int[size];
		rear = -1;
	}
	
	public static boolean isEmpty() {
		return rear==-1;
	}
	
	public static boolean isFull() {
		return rear==size-1;
	}
	
	public static void add(int data) {
		if(isFull()) {
			System.out.println("Queue is Full.");
			return;
		}
		else {
			arr[++rear]=data; //rear value: 0 --> 1
		}	
	}
	
	public static int remove() {
		if(isEmpty()) {
			System.out.println("Cannot remove!!!");
			return -1;
		}
		int front = arr[0];
		for(int i=0;i<rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return front;
	}
	public static int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		return arr[0];
	}
	
	
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("Array Elements :"+Arrays.toString(arr));
		System.out.println(q.remove());
		System.out.println(q.peek());
		
	}
}
}