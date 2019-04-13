package Chain;

/**
 * Created by ppolozhe on 4/12/19.
 */
public class Payment {

    private long  payer;
    private long receiver;
    private long sum;
    private long tax;


    public  Payment(long payer, long receiver, long sum){
        this.payer = payer;
        this.receiver = receiver;
        this.sum = sum;
        this.tax = sum;
    }
    public long getPayer() {
        return payer;
    }

    public void setPayer(long payer) {
        this.payer = payer;
    }

    public long getReceiver() {
        return receiver;
    }

    public void setReceiver(long receiver) {
        this.receiver = receiver;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
    public long getTax() {
        return tax;
    }

    public void setTax(long sum) {
        this.tax = sum;
    }

    public String toString1() {
        return "Payment: " +
                "payer=" + payer +
                ", receiver=" + receiver +
                ", sum=" + sum + ", taxes: " + tax;
    }
    @Override
    public String toString() {
        return "Payment: " +
                "payer=" + payer +
                ", receiver=" + receiver +
                ", sum=" + sum;
    }

}
