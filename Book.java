import java.util.*;
import java.lang.*;




public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title){

        this.title = title;
    }
    public String getTitle(){

        return title;
    }
    public void getAuthor(String author){

        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return "Title : "+title+ " Author: "+author;
    }

}
