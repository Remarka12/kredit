public class CreditPaymentService {
    public double calculate(int month, double percent) {
        int sum = 1_000_000;
        double i = percent / 100 / 12;
        double x = 1 + i;
        double pay = sum * (i + i / (Math.pow (x, month) -1));
        return pay;
    }
}
