import java.util.ArrayList;
import java.util.List;

public class Talents {
    private List<Move> talents = new ArrayList<Move>();


    public Talents() {
    }

    public void add(Move talent){
        talents.add(talent);
    }

    public void setMove(Enum move) {
        if (move == move.MAGIC) {
            for (Move talent : talents) {
                if (talent instanceof Elf) {
                    talent.move(move.MAGIC);
                } else{
                    talent.move(Enum.RUN);
                }
            }
        } else {
            for (Move talent : talents) {
                if (talent instanceof Vampire) {
                    talent.move(move);
                } else {
                    talent.move(Enum.RUN);
                }
            }
        }
    }
}
