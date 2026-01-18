import java.util.*;

public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Cherry");
        System.out.println("Fruits in the list:");
        for(String fruit : arr){
            System.out.println(fruit);
        }
        arr.remove("Banana");
        System.out.println("After removing Banana:");
        for(String fruit : arr){
            System.out.println(fruit);
        }
        arr.set(0, "Mango");
        System.out.println("After updating first element to Mango:");   
        for(String fruit : arr){
            System.out.println(fruit);
        }
    }
}
