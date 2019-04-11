package com.AbstractFactory;

import com.AbstractFactory.MovieWay.Sounds;
import com.AbstractFactory.MovieWay.Subtitres;

public abstract class FactoryOfMovieWay {

    public abstract Sounds createSounds();

    public abstract Subtitres createSubtitres();

}
