package com.Shape;

import com.Shape.Figures.Shape;

/**
 * Created by ppolozhe on 4/9/19.
 */
public class Random {
    public static void randomShapes(Factory factory){
        Shape randomShape = getRandomShape(factory);
        System.out.println(randomShape.createShape());
    }

    public  static Shape getRandomShape(Factory factory){
        java.util.Random random = new java.util.Random();
        int i = random.nextInt(10);
        if (i == 7 || i == 3) {
            typesOfShapes type = typesOfShapes.values()[random.nextInt(typesOfShapes.values().length)];
            return (factory.getShape(type));
        }
        typesOfShapes type = typesOfShapes.values()[random.nextInt(typesOfShapes.values().length - 5)];

        return (factory.getShape(type));
    }
}
