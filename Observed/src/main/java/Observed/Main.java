package Observed;


/**
 * Created by ppolozhe on 4/11/19.
 */
public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        Observer follower1 = new Follower("Pasha");
        Observer follower2 = new Follower("Vitalik");

        post.addFollower(follower1);
        post.addMagazine("maxim");
        post.removeFollower(follower1);
        post.addFollower(follower2);
        post.addMagazine("play");
        post.addMagazine("real footbal");
        post.addFollower(follower2);
    }
}
