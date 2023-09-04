import java.util.Scanner;

public class ReadingInputs {
    public static void main (String[] args) {
        System.out.print("Age: ");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.next().trim();
        String surname = scanner.next().trim();
        System.out.println("Your name is " + name + " " + surname);
    }
}
