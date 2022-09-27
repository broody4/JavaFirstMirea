package ru.mirea.task2;
import java.util.ArrayList;
public class BookShell {
    ArrayList<Book> Shell=new ArrayList<Book>();
    int NumberOfBooks;
    public BookShell() {
        NumberOfBooks=0;
    }
    public void add(String Author,String Title,int year){
        Book book =new Book(Author, Title,year);
        Shell.add(book);
        NumberOfBooks+=1;
    }
    public Book Oldest(){
        int i,imin=0;
        int min=Shell.get(0).getYear();
        for ( i=0;i<Shell.size();i++){
            if (Shell.get(i).getYear()<min){
                min=Shell.get(i).getYear();
                imin=i;
            }
        }
        return Shell.get(imin);
    }

    public Book newest(){
        int i,imax=0;
        int max=Shell.get(0).getYear();
        for ( i=0;i<Shell.size();i++){
            if (Shell.get(i).getYear()>max){
                max=Shell.get(i).getYear();
                imax=i;
            }
        }
        return Shell.get(imax);
    }
    public void sort(){
        int n = Shell.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (Shell.get(j).getYear() > Shell.get(j+1).getYear()) {
                    // swap arr[j+1] and arr[j]
                    Book temp = Shell.get(j);
                    Shell.set(j,Shell.get(j+1));
                    Shell.set(j+1,temp);
                }
    }


}
