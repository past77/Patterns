package Chain.Chain;

import Chain.Payment;


public class Taxes extends Commision {

    public Taxes(int type){
        this.type = type;
    }

    void doFilter(Payment payment) {
        float aFlo = (float)type/100;
        payment.setTax((long) (payment.getTax() * aFlo));
        payment.setSum(( payment.getSum() - payment.getTax()));
        System.out.println("with taxes : " + payment.toString1());
    }
}
