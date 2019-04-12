package com.Composite;

/**
 * Created by ppolozhe on 4/11/19.
 */
public class addFunc implements Component{
    public int sum;
    private int a;
    private int z;

    public addFunc(int a, int z){
        this.a = a;
        this.z = z;
    }

    public void sum(){
        sum = this.a + this.z;
    }

    public int getSum(){
        return sum;
    }

}
