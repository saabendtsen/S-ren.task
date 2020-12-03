import java.util.ArrayList;

public class Tasks {
    ArrayList<String> arrString = new ArrayList<>();

    public boolean addString (ArrayList< String > arr, String s){

        if (arr.size() >= 1) {
            for (int i = 1 ; i < arr.size(); i++) {
                if (arrString.get(i).equals(s)) {
                    return false;
                } else {
                    arr.add(s);
                    return true;
                }
            }
        } else {
            arr.add(s);
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Tasks{" +
                "arrString=" + arrString.get(0) +
                '}';
    }
}
