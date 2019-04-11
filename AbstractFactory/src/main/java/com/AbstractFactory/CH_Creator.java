package com.AbstractFactory;

import com.AbstractFactory.MovieWay.CH_Sounds;
import com.AbstractFactory.MovieWay.CH_subtitres;
import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;

public class CH_Creator extends FactoryOfMovieWay {

    public Sounds createSounds(){
        return new CH_Sounds();
    }

    public Subtitres createSubtitres(){
        return new CH_subtitres();
    }
}