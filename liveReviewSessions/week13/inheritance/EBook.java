package week13.inheritance;

public class EBook extends Book{

    int size;
    int pages;

    public EBook(String title, String type, String author, double price) {
        super(title, type, author, price);

    }

    public void readBook(){
        System.out.println("Reading the book from Tablet");
        System.out.println("size = " + size);
        System.out.println("pages = " + pages);
        System.out.println("title = " + title);
    }

}
