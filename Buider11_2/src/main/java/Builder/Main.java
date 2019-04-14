package Builder;

/**
 * Created by ppolozhe on 4/14/19.
 */
public class Main {
    public static void main(String[] args) {

        Recipe recipe = new Builder()
                .buildBills(Bills.DEMEROL)
                .buildTime((byte) 5)
                .buid();
        System.out.println(recipe);
    }
}