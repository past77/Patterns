package Builder;

/**
 * Created by ppolozhe on 4/14/19.
 */
public class Recipe {

    Bills bills;
    private byte time;

    @Override
    public String toString() {
        return "Recipe " +
                "bills = '" + bills + '\'' +
                ", time = " + time + " days";
    }

    public void setBills(Bills bills) {
        this.bills = bills;
    }

    public void setTime(byte time) {
        this.time = time;
    }

}
