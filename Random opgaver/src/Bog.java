import sun.nio.cs.ext.IBM037;

public class Bog {


    int ISBNnr;
    String title;
    int year;


    public Bog (int ISBNnr, String title, int year){
        this.ISBNnr = ISBNnr;
        this.title = title;
        this.year = year;
    }


    public int getISBNnr() {
        return ISBNnr;
    }


    public boolean checkISBN(int ISBNnummer){
        if(this.ISBNnr == ISBNnummer){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBNnr=" + ISBNnr +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
