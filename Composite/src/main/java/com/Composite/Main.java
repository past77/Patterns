package com.Composite;

public class Main {
    public static void main(String[] args) {

        Component brackets1 = new addFunc(1, 2);
        brackets1.sum();
        Component mult1 = new multFunc(brackets1.getSum(), 4);
        mult1.sum();
        Component brackets2 = new addFunc(3, 6);
        brackets2.sum();
        Component mult2 = new multFunc(brackets2.getSum(), 5);
        mult2.sum();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.add(brackets1);
        composite1.add(mult1);

        composite2.add(brackets2);
        composite2.add(mult2);

        composite.add(composite1);
        composite.add(composite2);

        composite.sum();
    }

}


