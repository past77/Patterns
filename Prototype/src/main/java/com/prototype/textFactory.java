package com.prototype;

/**
 * Created by ppolozhe on 4/11/19.
 */
public class textFactory {
   private Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
    public Article cloneAr(){
        return (Article) article.copy();
    }

    public textFactory(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "textFactory{" +
                "article=" + article +
                '}';
    }
}
