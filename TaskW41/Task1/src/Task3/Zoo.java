package Task3;

import java.util.ArrayList;

public class Zoo {


    ArrayList<Animal> animals = new ArrayList<Animal>();


    public void makeAllSounds(ArrayList<Animal> a) {
        for (Animal i : a) {
            i.makeSound();
        }
    }

    public ArrayList<Animal> addAnimal(ArrayList<Animal> collection, Animal animal) {

        collection.add(animal);
        return collection;

    }
    public void printNumberOfLegs (ArrayList<Animal> collection){
        int count = 0;

        for(Animal a : collection){
            count += a.getNumberOfLegs();
        }
        System.out.println("number of legs in my Zoo: " + count);
    }

}
