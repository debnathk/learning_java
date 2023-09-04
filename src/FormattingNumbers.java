import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main (String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.89);
        System.out.println(result);

        String percent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percent);
    }
}
