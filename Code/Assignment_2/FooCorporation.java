public class FooCorporation {
    public static void PayCalculate(double basePay, int hourWorked) {
        if (basePay < 8.0) {
            System.out.println("You must be paid at least $8.00/hour");
        } else if (hourWorked > 60) {
            System.out.println("You can't work more than 60 hours a week");
        } else {
            double pay;
            if (hourWorked <= 40) {
                pay = basePay * hourWorked;
            } else {
                pay = basePay * 40 + basePay * (hourWorked - 40) * 1.5;
            }
            System.out.println("Pay this employee $" + pay);
        }
    }
    public static void main(String[] args) {
        PayCalculate(7.50, 35);
        PayCalculate(8.20, 47);
        PayCalculate(10.00, 73);
    }
}
