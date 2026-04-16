package ntu.cntt2.luyentap;

public class Book {
    private int BookID;
    private String BookName;
    private int Page;
    private float Price;
    private String Decription;

    public Book(int bookID, String bookName, int page, float price, String decription) {
        BookID = bookID;
        BookName = bookName;
        Page = page;
        Price = price;
        Decription = decription;
    }

    public int getBookID() {
        return BookID;
    }

    public void setBookID(int bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getPage() {
        return Page;
    }

    public void setPage(int page) {
        Page = page;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getDecription() {
        return Decription;
    }

    public void setDecription(String decription) {
        Decription = decription;
    }
}
