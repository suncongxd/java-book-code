

import java.util.*;

public class TestQueue{
	public static void printQueue(Queue q){
		while(q.peek()!=null)
			System.out.print(q.remove()+" ");
		System.out.println();
	}
	public static void main(String[] args){
		Queue<Integer> q=new LinkedList<Integer>();
		Random rand=new Random(37);
		for(int i=0;i<10;i++)
			q.offer(rand.nextInt(i+10));
		TestQueue.printQueue(q);
		
		Queue<Character> qc=new LinkedList<Character>();
		for(char c: "JavaLanguage".toCharArray())
			qc.offer(c);
		TestQueue.printQueue(qc);
	}
}