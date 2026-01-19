import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();
        
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        System.out.println("List:"+l);
        l.set(1,"Too");
        System.out.println("List after set:"+l);
        l.remove(3);
        System.out.println("List after removing:"+l);
        l.add(2, "ABC");
        System.out.println("List after adding in index 2:"+l);
    }
}
