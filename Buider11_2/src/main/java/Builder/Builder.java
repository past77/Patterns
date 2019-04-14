package Builder;

public class Builder {

    Bills bills = Bills.ALPRAZOLAM;
    private byte time = 1;

    Builder buildBills(Bills bills){
        this.bills = bills;
        return this;
    }
    Builder buildTime(byte time) {
        this.time = time;
        return this;
    }
    Recipe buid(){
        Recipe recipe = new Recipe();
        recipe.setBills(bills);
        recipe.setTime(time);
        return recipe;
    }

}
