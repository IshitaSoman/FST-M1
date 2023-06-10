package Activities;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            Random indexGen = new Random();
            System.out.println("Enter integer values (enter a non-integer to stop):");
            while (scan.hasNextInt()) {
                list.add(scan.nextInt());
            }

            if (list.isEmpty()) {
                System.out.println("No numbers entered.");
            } else {
                Integer[] nums = list.toArray(new Integer[0]);
                int size = nums.length;
                int randomIndex = indexGen.nextInt(size);

                System.out.println("Generated random index: " + randomIndex);
                System.out.println("Value at the generated index: " + nums[randomIndex]);
            }
        }
    }

