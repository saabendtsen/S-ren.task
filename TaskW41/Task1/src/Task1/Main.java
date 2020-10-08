package Task1;

public class Main {
    public static void main(String[] args) {


        Driver bob = new Driver("bob", 27);
        Car GTI = new Car("VW","GOLF GTI MK4",1999,"Tyskerslæde");
        Car RX7 = new Car("Mazda","RX7",1993,"Japserslæde");

        GTI.setDriver(bob);
        RX7.setDriver(bob);
        System.out.println(GTI.toString());
        System.out.println(bob.toString());
        System.out.println(RX7.toString());
        System.out.println(bob.toString());
    }

}
