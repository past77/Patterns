package Chain.Chain;

import Chain.Payment;

public class Type extends Commision{
    public Type(int type){
        this.type = type;
    }

    void doFilter(Payment payment) {
        System.out.println("type is " + payment);
    }
}
