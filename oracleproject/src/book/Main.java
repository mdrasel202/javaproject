package book;

public class Main {
    public static void main(String[] args) {
        String[][] books = {
                {"The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "10.99", "2022-01-05"},
                {"George", "George Orwell", "Dystopian", "08.12", "2023-05-08"}
        };

        InsertBookData book = new InsertBookData();
        book.insertDummyDataBook(books);
    }


}
