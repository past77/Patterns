package Chain;

import Chain.Chain.Commision;
import Chain.Chain.Percent;
import Chain.Chain.Taxes;
import Chain.Chain.Type;

/**
 * Created by ppolozhe on 4/12/19.
 */
public class Main {
    public static void main(String[] args) {
        Commision com1 = new Type(1);
        Commision com2 = new Taxes(5);
        Commision com3 = new Percent(8);


        Commision filterChain = com1.setNext(com2.setNext(com3));

        Payment innerBank = new Payment(1,2, 900);
        Payment gov = new Payment(2,300, 1100);
        Payment external = new Payment(3,20, 1000);

        System.out.println("Inner in the bank: ");
        filterChain.filter(innerBank, 1);
        System.out.println("\nGoverment Transfers: ");
        filterChain.filter(gov, 6);
        System.out.println("\nExternal Transfers: ");
        filterChain.filter(external, 9);

    }
}
