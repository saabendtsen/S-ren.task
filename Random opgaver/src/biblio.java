import java.util.ArrayList;

public class biblio {
    ArrayList<Bog> books = new ArrayList<Bog>();

    public boolean checkbooks(Bog book) {
        if (books.size() != 0) {
            for (Bog b : books) {
                if (b.checkISBN(book.getISBNnr())) {
                    System.out.println("book already in");
                    return true;
                }
                books.add(book);
                System.out.println("book has been added");
                return false;
            }
        } else {
            books.add(book);
            System.out.println("book has been added");
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "biblio{" +
                "books=" + books +
                '}';
    }
}