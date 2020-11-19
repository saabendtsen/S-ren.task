public class City {

    String name;
    int populatoin;

    public City(String name, int populatoin) {
        this.name = name;
        this.populatoin = populatoin;
    }

    //Task E
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", populatoin=" + populatoin +
                '}' + "\n";
    }
}
