package Activities;

import org.apache.commons.io.filefilter.TrueFileFilter;

import java.util.ArrayList;

public class Activity2 {

    public static void main(String[] args) {


        int[] numarr = {10, 22, 32, 11, 10};
        int targetSum = 30;
        int sum = 0;
        int count = 0;

        for (int num : numarr) {
            if (num == 10) {
                sum += num;
                count++;

            }

        }
        System.out.println("Sum of 10's is :" + sum);
        if (sum == targetSum) {
            System.out.println("Sum is equal to :" + targetSum);

        } else {
            System.out.println("Sum of 10's is not equal to:" + targetSum);
        }
    }
}


