package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo();

        BigShaq bigShaq = new BigShaq(100);
        Kayne kayne = new Kayne(20);
        AugustHaj haj = new AugustHaj(1);

        ArrayList<Animal> collection = new ArrayList<Animal>();

        myZoo.addAnimal(collection,bigShaq);
        myZoo.addAnimal(collection,haj);
        myZoo.addAnimal(collection,kayne);

        myZoo.makeAllSounds(collection);
        myZoo.printNumberOfLegs(collection);
    }
}
