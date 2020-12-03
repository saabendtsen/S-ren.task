import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Book> books = new ArrayList<>();


    public boolean isisbnInList(Book b){

        for (Book i: books) {
            if (i.getIsbn() == (b.getIsbn())){
                return true;
            }
        }
        return false;
    }
}
