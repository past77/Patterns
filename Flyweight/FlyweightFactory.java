package Flyweight;

import Flyweight.ListOfBacteria.Bacillus;
import Flyweight.ListOfBacteria.Coccus;
import Flyweight.ListOfBacteria.Coccus;
import Flyweight.ListOfBacteria.Rickettsia;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ppolozhe on 4/14/19.
 */
public class FlyweightFactory {
    private static final Map<String, Bacteria> bacterias = new HashMap<>();
    //private String name;

    public Bacteria getBacteria(String name) {

        Bacteria bacteria = bacterias.get(name);
        if (bacteria == null) {
            switch (name) {
                case "Coccus":
                    bacteria = new Coccus();
                    break;
                case "Bacillus":
                    bacteria = new Bacillus();
                    break;
                case "Rickettsia":
                    bacteria = new Rickettsia();
                    break;
            }
            bacterias.put(name, bacteria);
        }
        return bacteria;
    }
}
