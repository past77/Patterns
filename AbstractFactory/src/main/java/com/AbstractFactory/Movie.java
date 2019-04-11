package com.AbstractFactory;

import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;


public  class Movie{
    private Sounds sounds;
    private Subtitres subtitres;

    public Movie(FactoryOfMovieWay factory){
        this.sounds = factory.createSounds();
        this.subtitres = factory.createSubtitres();
    }

    public void play() {
        System.out.println(sounds.language());
        System.out.println(subtitres.Subtitres());
    }

}
