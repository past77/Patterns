package Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ppolozhe on 4/14/19.
 */
public class Main {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        List<Bacteria> bacterias = new ArrayList<>();

        bacterias.add(flyweightFactory.getBacteria("Coccus"));
        bacterias.add(flyweightFactory.getBacteria("Bacillus"));
        bacterias.add(flyweightFactory.getBacteria("Coccus"));
        bacterias.add(flyweightFactory.getBacteria("Coccus"));
        bacterias.add(flyweightFactory.getBacteria("Bacillus"));
        bacterias.add(flyweightFactory.getBacteria("Rickettsia"));
        bacterias.add(flyweightFactory.getBacteria("Bacillus"));
        bacterias.add(flyweightFactory.getBacteria("Rickettsia"));
        bacterias.add(flyweightFactory.getBacteria("Coccus"));


        for (Bacteria bac : bacterias ){
            bac.show();
        }

    }
}
