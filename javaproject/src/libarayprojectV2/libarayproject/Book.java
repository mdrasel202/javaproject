package libarayprojectV2.libarayproject;

public class Book {
    private String title;
    private String author;
    private int publication;
    private int pagesNumber;
    private double price;
    private boolean availability;

    public Book(String title, String author, int publication, int pagesNumber, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.pagesNumber = pagesNumber;
        this.price = price;
        this.availability = availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication() {
        return publication;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public double isPrice() {
        return price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void displayInformation(){
        System.out.println("Title of the book : "+title);
        System.out.println("Author of the book : "+author);
        System.out.println("Year of publication : "+publication);
        System.out.println("Number of pages : "+pagesNumber);
        System.out.println("Price of the book : "+price);
        System.out.println();
    }


}
