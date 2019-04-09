package com.Shape;

import com.Shape.Figures.*;


public class Factory {

    public Shape getShape(typesOfShapes type) {
        Shape shapeReturn = null;
        switch (type){
            case a:
                shapeReturn = new aFigure();
                break ;
            case b:
                shapeReturn = new bFigure();
                break;
            case c:
                shapeReturn = new cFigure();
                break;
            case h:
                shapeReturn = new hFigure();
                break;
            case w:
                shapeReturn = new wFigure();
                break;
            case W:
                shapeReturn = new bigWFigure();
                break;
            case A:
                shapeReturn = new bigAFigure();
                break;
            case B:
                shapeReturn = new bigBFigure();
                break;
            case C:
                shapeReturn = new bigCFigure();
                break;
            case H:
                shapeReturn = new bigHFigure();
                break;
            default:
                throw new IllegalArgumentException("wrong inpute type:" + type);
        }
        return shapeReturn;
    }
}
