import java.text.NumberFormat;
import java.util.Scanner;

public class ProjectMortgageCalculator {
    public static void main (String[] args) {

        final byte monthsInYear = 12;
        final byte percent = 100;

        int principal;
        int numberOfPayments;
        float annualInterestRate;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_0000_00) {
                break;
            }
            else
                System.out.println("Please enter a principal amount between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30) {
                annualInterestRate = annualInterestRate / monthsInYear / percent;
                break;
            }
            else
                System.out.println("Please enter a annual Interest Rate greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            numberOfPayments = scanner.nextInt();
            if (numberOfPayments > 0 && numberOfPayments <= 30) {
                numberOfPayments = numberOfPayments * monthsInYear;
                break;
            }
            else {
                System.out.println("Please enter the number Of Payments greater than 0 and less than or equal to 30");
            }
        }

            //        Mortgage calculator formula
            double m = principal * (annualInterestRate * Math.pow((1 + annualInterestRate), numberOfPayments)) /
                    (Math.pow((1 + annualInterestRate), numberOfPayments) - 1);
            String mortgage = NumberFormat.getCurrencyInstance().format(m);
            System.out.println("Mortgage: " + mortgage);
    }
}
