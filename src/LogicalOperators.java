public class LogicalOperators {
    public static void main (String[] args) {
        int temperature  = 25;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecords = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) & !hasCriminalRecords;
        System.out.println(isEligible);

    }
}
