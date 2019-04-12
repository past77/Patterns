public class Vampire implements Move {
    public void move(Enum move){
        if (move == Enum.FLY){
            System.out.println("Vampire fly");
        }
        else if (move == Enum.RUN)
            System.out.println("Vampire run");
    }
}
