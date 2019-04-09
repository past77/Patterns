package com.Shape;

import com.Shape.Figures.Shape;

import java.util.Random;

import static com.Shape.Random.getRandomShape;
import static com.Shape.Random.randomShapes;

/**
 * Created by ppolozhe on 4/9/19.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        randomShapes(factory);
    }
}
