import java.util.Scanner;

public class ifStatements {
    public static void main (String[] args){
        System.out.print("Temperature: ");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        if (temperature > 30) {
            System.out.println("Too hot today!");
            System.out.println("Drink plenty of water...");
        }
        else if (temperature > 20)
            System.out.println("Beautiful day!");
        else
            System.out.println("Very cold!");
    }
}
