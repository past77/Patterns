package Context;

import State.*;

/**
 * Created by ppolozhe on 4/11/19.
 */
public class Logic {
    Case cases;

    public void setCases(Case c){
        cases = c;
    }
    public void nextStep(){

        if ((cases instanceof Reject)){
            setCases(new Recalled());
        }
        else if (cases instanceof Recalled){
            setCases(new Prorogue());
        }
        else if (cases instanceof Prorogue){
            setCases(new Reject());
        }
        else if (cases instanceof Confirmed) {
            setCases(new Create());
        }
        else if (cases instanceof Create) {
            setCases(new Consider());
        }
        else if (cases instanceof Consider) {
            setCases(new Confirmed());
        }
    }
    public void show(){
        cases.show();
    }
}
