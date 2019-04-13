package Chain.Chain;

import Chain.Payment;

/**
 * Created by ppolozhe on 4/12/19.
 */
public class Percent extends Commision{
    public Percent(int type){
        this.type = type;
    }

    void doFilter(Payment payment) {
        float aFlo = (float)type/100;
        payment.setTax((long) (payment.getSum() * aFlo));
        payment.setSum(( payment.getSum() - payment.getTax()));
        System.out.println("percent is "+ this.type);
        System.out.println("with person taxes : " + payment.toString1());
    }
}
