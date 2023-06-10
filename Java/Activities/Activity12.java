package Activities;

@FunctionalInterface
interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (a, b) -> (a + b);
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };

        int result1 = ad1.add(5, 3);
        System.out.println("Result using lambda expression (ad1): " + result1);

        int result2 = ad2.add(7, 2);
        System.out.println("Result using lambda function (ad2): " + result2);
    }
}

