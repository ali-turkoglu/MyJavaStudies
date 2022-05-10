package day47_Polymorphism_GeneralReview;

public class EncapsulationReview {
    private String bookTitle;
    private final String publishedData;


    public EncapsulationReview(String bookTitle, String publishedData) {
        //this.bookTitle = bookTitle;
        setBookTitle(bookTitle);
        this.publishedData = publishedData;
    }

    public String getBookTitle() {
        if (bookTitle==null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null||bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedData() {
        return publishedData;
    }
}
