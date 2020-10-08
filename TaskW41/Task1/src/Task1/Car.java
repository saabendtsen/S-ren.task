package Task1;

public class Car {



    private String maker;
    private String model;
    private int year;
    private String bodystyle;
    private Driver driver;


    public Car(String maker, String model, int year, String bodystyle) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.bodystyle = bodystyle;
    }


    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    @Override
    public String toString() {
        return  "Maker: " + maker + ", model='" + model + ", year:" + year + ", bodystyle: " + bodystyle;

    }



}
