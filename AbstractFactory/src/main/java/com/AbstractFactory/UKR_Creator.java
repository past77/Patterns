package com.AbstractFactory;

import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;
import com.AbstractFactory.MovieWay.UKR_Sounds;
import com.AbstractFactory.MovieWay.UKR_Subtitres;

public class UKR_Creator extends FactoryOfMovieWay {

    public Sounds createSounds(){
        return new UKR_Sounds();
    }

    public Subtitres createSubtitres(){
        return new UKR_Subtitres();
    }
}