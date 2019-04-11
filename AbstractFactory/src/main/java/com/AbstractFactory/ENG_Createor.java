package com.AbstractFactory;


import com.AbstractFactory.MovieWay.ENG_Sounds;
import com.AbstractFactory.MovieWay.ENG_Subtitres;
import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;

public class ENG_Createor extends FactoryOfMovieWay{

public Sounds createSounds(){
    return new ENG_Sounds();
    }

public Subtitres createSubtitres(){
    return new ENG_Subtitres();
    }
}
