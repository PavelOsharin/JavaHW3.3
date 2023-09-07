public class CreditPaymentService {
    public int calculate (int period, int summ, double percent) {
        double percentInMonth = (percent / 12 / 100);
        int month = (period * 12);
        double summMonth = (summ * percentInMonth * (Math.pow(1 + percentInMonth, month))) / (Math.pow(1 + percentInMonth, month) - 1);
        return (int) summMonth;
    }
}
