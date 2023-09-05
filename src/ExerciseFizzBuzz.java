import java.util.Scanner;

public class ExerciseFizzBuzz {
    public static void main (String[] args) {
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number%15 == 0)
            System.out.println("FizzBuzz");
        else if (number%5 == 0)
            System.out.println("Fizz");
        else if (number%3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
