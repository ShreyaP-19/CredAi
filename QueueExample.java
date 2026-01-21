import java.util.*;

public class QueueExample {
    public static void main(String args[]){
        
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Apple");
        pq.add("Banana");
        pq.add("Cherry");
        System.out.println("Initial Queue: " + pq);
        pq.remove("Apple");
        System.out.println("After Remove: " + pq);
        System.out.println("Poll Method: " + pq.poll());
        System.out.println("Final Queue: " + pq);
    }
}
