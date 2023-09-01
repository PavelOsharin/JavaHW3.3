
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        /*int period = 1;
        int summ = 1_000_000;
        double percent = 9.99;*/
        //int summMonth = (int) service.calculate(period, summ, percent);
        //System.out.println(summMonth);

        System.out.println();
        System.out.println("1 год, сумма 1 000 000 рублей, под 9,99%");
        System.out.println(service.calculate(1, 1000000, 9.99));

        System.out.println();
        System.out.println("2 года, сумма 1 000 000 рублей, под 9,99%");
        System.out.println(service.calculate(2, 1000000, 9.99));

        System.out.println();
        System.out.println("3 года, сумма 1 000 000 рублей, под 9,99%");
        System.out.println(service.calculate(3, 1000000, 9.99));

    }
}