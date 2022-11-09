public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println();
        System.out.println("Ежемесячный платеж для кредитного срока в 1 год: ");
        System.out.println(service.calculate(12, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж для кредитного срока в 2 года: ");
        System.out.println(service.calculate(24, 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж для кредитного срока в 3 года: ");
        System.out.println(service.calculate(36, 9.99));
    }
}
