package Observed;


public class Follower implements Observer {
    private String name;

    public Follower(String name){
        this.name = name;
    }
    public void update(String nameM){
        System.out.println(name + ", your book: '"+ nameM + "' is sent to you");
    }
}
