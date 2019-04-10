package Momento.Main;

/**
 * Created by ppolozhe on 4/10/19.
 */
public class Main {
    public static void main(String[] args) {
    Originator ord = new Originator();
        ord.setStep(0,1);
        ord.setStep(1,2);
        ord.setStep(1,1);
        ord.setStep(2,2);
        System.out.println(ord);

        Momento moment = ord.save();
        ord.setStep(0,0);
        System.out.println(ord);

        System.out.println("One step back:");
        ord.saved(moment);
        System.out.println(ord);



    }
}
