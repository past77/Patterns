package Chain.Chain;

import Chain.Payment;

/**
 * Created by ppolozhe on 4/12/19.
 */
public abstract class Commision {

    protected Commision next;
    public  int type;

    public Commision setNext(Commision next){
        this.next = next;
        return this;
    }

    public void filter(Payment payment, int type) {
        if (this.type <= type) {
            doFilter(payment);
        }
        if (next != null) {
            next.filter(payment, type);
        }
    }

    abstract void doFilter(Payment payment);

}
