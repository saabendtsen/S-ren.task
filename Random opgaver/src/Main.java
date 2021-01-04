import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Nisser");
        addStringToArray(arr,"KRIS");


        biblio biblio = new biblio();

        biblio.checkbooks(new Bog(1954,"niller",195));

        for(Bog b: biblio.books){
            System.out.println(b.toString());
        }


        Grass grass = new Grass();

        Scanner input = new Scanner(System.in);

        //double length = Double.parseDouble(input.nextLine());
        //double maxlength = Double.parseDouble(input.nextLine());


        //System.out.println(grass.daysToCutGrass(length,maxlength));

        DrawSquare sqr = new DrawSquare();
        //sqr.drawSqr(40,'&');


        Menu menu = new Menu();
        menu.mainMenu();




    }













    public static boolean addStringToArray(ArrayList<String> arrString, String string){
        if (string == null){
            System.out.println("there is nothing in your string");
            return false;
        }
        if (arrString.size() != 0) {
            for (int i = 0; i < arrString.size(); i++) {
                if (arrString.get(i).equals(string)) {
                    return false;
                } else {
                    arrString.add(string);
                    System.out.println("It was added");
                    return true;
                }
            }
        } else {
            arrString.add(string);
            System.out.println("It was added");
            return true;
        }
        System.out.println(arrString);
        return false;
    }

}
