package Observed;


public interface Observe{
    void addMagazine(String nameM);
    void removeMagazine(String nameM);
    void addFollower(Observer observers);
    void removeFollower(Observer observers);
    void notifyObserver();
}
