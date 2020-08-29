

import java.util.*;

public class TestPriorityQueue{
	public static void printQueue(Queue q){
		while(q.peek()!=null)
			System.out.print(q.remove()+" ");
		System.out.println();
	}
	public static void main(String[] args){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		Random rand=new Random(47);
		for(int i=0;i<10;i++)
			pq.offer(rand.nextInt(i+10));
		TestPriorityQueue.printQueue(pq);
		
		String fact="Java is a good programming language";
		List<String> strs=Arrays.asList(fact.split(""));
		PriorityQueue<String> strpq=new PriorityQueue<String>(strs);
		TestPriorityQueue.printQueue(strpq);
		
		strpq=new PriorityQueue<String>(strs.size(), Collections.reverseOrder());
		strpq.addAll(strs);
		TestPriorityQueue.printQueue(strpq);
	}
}