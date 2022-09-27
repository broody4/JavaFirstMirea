package ru.mirea.task2;

public class Book {
    private String Author;
    private String title;
    private int year;

    public Book(String Author, String Title,int year){
        this.Author=Author;
        this.title=Title;
        this.year=year;
    }
    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return Author+" "+title+" "+year;
    }


}
