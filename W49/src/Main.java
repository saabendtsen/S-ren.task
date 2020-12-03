import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tasks t = new Tasks();
        ArrayList<String> arrString = new ArrayList<>();

        System.out.println(t.addString(arrString,"Niller"));
        System.out.println(t.addString(arrString,"Niller"));

        System.out.println(arrString.toString());


    }


}
