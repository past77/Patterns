package com.prototype;

public class Article implements Clonable {

    private static int id;
    String title;
    String text;

    public Article(String title, String text){
        this.title = title;
        this.text = text;
        id++;
    }

    public static void setId(int id) {
        Article.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }
    public static int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Object copy() {
        Article copy = new Article(title, text);
        return copy;
    }

    @Override
    public String toString() {
        return title + "\n" + text + "\n";
    }

}