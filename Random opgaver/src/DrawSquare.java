import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DrawSquare {

    public void drawSqr(int size, char sign) {
        if (size > 50) {
            System.out.println("Der ikke plads makker");
        } else {
            for (int j = 0; j < Math.abs(size); j++) {
                for (int i = 0; i < Math.abs(size); i++) {
                    System.out.print(sign + "  ");
                }
                System.out.println(" ");
            }
        }
    }
}


