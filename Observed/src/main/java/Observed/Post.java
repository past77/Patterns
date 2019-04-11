package Observed;

import java.util.ArrayList;
import java.util.List;

public class Post implements Observe{

    private List<String> magaz = new ArrayList<>();
    private List<Observer> observ = new ArrayList<>();

    public void addMagazine(String nameM){
        magaz.add(nameM);
        notifyObserver();
    }
    public void removeMagazine(String nameM){
        magaz.remove(nameM);
    }
    public void addFollower(Observer observers){
        observ.add(observers);
    }
    public void removeFollower(Observer observers){
        observ.remove(observers);
    }
    public void notifyObserver() {
        for (Observer ob : observ) {
            ob.update(magaz.get(magaz.size() - 1));
        }
    }
}
