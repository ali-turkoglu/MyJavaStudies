package week13.inheritance;

public class AudioBook extends Book{

    public AudioBook(String title, String type, String author, double price){
        super( title,  type,  author, price);
    }

    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("title = " + title);
        System.out.println("type = " + type);
        System.out.println("narrator = " + narrator);
    }




}
