package Activities;
import java.util.HashSet;
public class Activity10 {
        public static void main(String[] args) {
            HashSet<Object> hs = new HashSet<>();
            hs.add("Apple");
            hs.add("Banana");
            hs.add("Orange");
            hs.add("Mango");
            hs.add("Grapes");
            hs.add("Pineapple");

            System.out.println("Size of the HashSet: " + hs.size());
            boolean removed = hs.remove("Orange");
            System.out.println("Element 'Orange' removed: " + removed);
            removed = hs.remove("Watermelon");
            System.out.println("Element 'Watermelon' removed: " + removed);
            boolean contains = hs.contains("Apple");
            System.out.println("Does the HashSet contain 'Apple'? " + contains);
            System.out.println("Updated HashSet: " + hs);
        }
    }

