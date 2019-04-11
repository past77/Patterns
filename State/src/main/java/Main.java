import State.Case;
import State.Confirmed;
import Context.Logic;
import State.Reject;

/**
 * Created by ppolozhe on 4/11/19.
 */
public class Main {
    public static void main(String[] args) {
        Case case1 = new Confirmed();
        Case case2 = new Reject();
        Logic logic = new Logic();
        logic.setCases(case2);
        for (int i = 0; i <3; i++) {
            //logic.show();
            //logic.show();
            logic.nextStep();
            logic.show();
        }
    }
}
