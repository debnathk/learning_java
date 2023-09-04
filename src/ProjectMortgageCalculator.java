import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMortgageCalculator {
    public static void main (String[] args) {

        final byte monthsInYear = 12;
        final byte percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        annualInterestRate = annualInterestRate / monthsInYear / percent;
        System.out.print("Period (Years): ");
        int numberOfPayments = scanner.nextInt();
        numberOfPayments = numberOfPayments * monthsInYear;

        //        Mortgage calculator formula
        double m = principal * (annualInterestRate * Math.pow((1 + annualInterestRate), numberOfPayments)) /
                (Math.pow((1 + annualInterestRate), numberOfPayments) - 1);
        String mortgage = NumberFormat.getCurrencyInstance().format(m);
        System.out.println("Mortgage: " + mortgage);
    }
}
