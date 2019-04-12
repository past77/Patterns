package com.Composite;

import java.util.ArrayList;
import java.util.List;


public class Composite implements Component {
    static int i;
    static int i1;

    List<Component> components = new ArrayList<Component>();
    public void add(Component component){
        components.add(component);
    }

    public void sum() {
        i1 = i;
        for(Component component : components) {
            component.sum();
            i =+ component.getSum();
        }
        System.out.println(i);
    }

    public int getSum() {
        return i + i1;
    }

}
