public class Grass {


    double dayliGrassgrowth = 0.8;

    public int daysToCutGrass(double grassLength, double maxLength) {
        int daysCount = 0;

        while (grassLength < maxLength) {
            grassLength += dayliGrassgrowth;
            daysCount++;
        }
        return daysCount;
    }
}
