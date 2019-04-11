package com.prototype;


public class Main {
    public static void main(String[] args) {
        textFactory kpi = new textFactory(new Article("KPI", "The best university in Ukraine"));
        Article copy = kpi.cloneAr();

        System.out.println(copy);
        copy.setTitle("KNEU");
        System.out.println(copy);

    }
}
