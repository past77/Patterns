package com.AbstractFactory;

import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;

public class Main {

    private static Movie configure(){
    Movie movie = null;
    FactoryOfMovieWay factory;
    String name  = "chi";

        if (name.contains("ukr")) {
            factory = new UKR_Creator();
            movie = new Movie(factory);
        } else if (name.contains("chi")) {
            factory = new CH_Creator();
            movie = new Movie(factory);
        }
        else if (name.contains("eng")) {
            factory = new ENG_Createor();
            movie = new Movie(factory);
        }
        else
            System.out.println("We haven't movie with this language");
        return movie;
    }

    public static void main(String[] args) {
        Movie app = configure();
        app.play();
    }

}
