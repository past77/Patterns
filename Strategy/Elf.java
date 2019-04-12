public class Elf implements Move {
    public void move(Enum move){
        if (move == Enum.MAGIC){
            System.out.println("Elf can fly");
        }
        else{
            System.out.println("Elf only run");
        }
    }
}
