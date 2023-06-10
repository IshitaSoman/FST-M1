package Activities;
import java.util.ArrayList;
public class Activity9 {

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");

        // Print all the names using a for loop
        System.out.println("All names:");
        for (String name : myList) {
            System.out.println(name);
        }


        String thirdName = myList.get(2);
        System.out.println("Third name: " + thirdName);
        boolean containsName = myList.contains("Bob");
        System.out.println("Does the ArrayList contain 'Bob'? " + containsName);
        int size = myList.size();
        System.out.println("Number of names in the ArrayList: " + size);
        myList.remove("Charlie");
        System.out.println("Updated number of names in the ArrayList: " + myList.size());
    }
}

