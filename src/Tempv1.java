import TerminalIO.*;
public class Tempv1 {

   
    public static void main(String[] args) {
        KeyboardReader r = new KeyboardReader();
        double f,c;
        //ask for f
        f = r.readDouble("Enter temperature in F > ");
        //convert to C
        c = (f-32) * 5/9;
        //print answer
        System.out.printf("%.2f°F = %.2f°C ", f, c);
    }
    
}
