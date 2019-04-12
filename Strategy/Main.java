
public class Main {

    public static void main(String[] args) {
    Talents talent = new Talents();
    talent.add(new Ork());
    talent.add(new Vampire());
    talent.add(new Elf());
    talent.add(new Pegas());

    talent.setMove(Enum.RUN);
    System.out.println("-------------------------------");
    talent.setMove(Enum.FLY);
    System.out.println("-------------------------------");
    talent.setMove(Enum.MAGIC);
    }
}
