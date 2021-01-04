import java.util.Scanner;

public class Menu {


    public int mainMenu() {

        boolean running = true;
        while (running) {

            System.out.println("1. Beregn");
            System.out.println("2. Udskriv");
            System.out.println("3. Hjælp");


            Scanner input = new Scanner(System.in);
            int cmd = Integer.parseInt(input.nextLine());

            if (cmd == 1) {
                System.out.println("Du har valgt menu 1");
                return 1;
            }
            if (cmd == 2) {
                System.out.println("Du har valgt menu 2");
                return 2;
            }
            if (cmd == 3) {
                System.out.println("Du har valgt menu 3");
                return 3;
            } else {
                System.out.println("du har valgt noget ugyldigt lol");
            }
        }
        return 0;
    }


}

