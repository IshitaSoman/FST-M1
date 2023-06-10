package Activities;
import java.util.HashMap;
import java.util.Map;
public class Activity11 {
        public static void main(String[] args) {
            Map<Integer, String> colours = new HashMap<>();

            // Add 5 random colours to the Map
            colours.put(1, "Red");
            colours.put(2, "Green");
            colours.put(3, "Blue");
            colours.put(4, "Yellow");
            colours.put(5, "Orange");

            // Print the Map to the console
            System.out.println("Map of Colours: " + colours);

            // Remove one colour using the remove() method
            colours.remove(3);
            System.out.println("Colour 'Blue' removed.");

            // Check if the colour "Green" exists in the Map using containsValue() method
            boolean containsGreen = colours.containsValue("Green");
            System.out.println("Does the Map contain the colour 'Green'? " + containsGreen);

            // Print the size of the Map using size() method
            int size = colours.size();
            System.out.println("Size of the Map: " + size);
        }
    }

