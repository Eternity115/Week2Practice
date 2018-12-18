import TurtleGraphics.*;
import java.awt.Color;
public class TurtleDrawing {

    
    public static void main(String[] args) {
        Pen p = new WiggleRainbowPen(new SketchPadWindow(800,600));
        p.move(100);
        p.turn (-90);
        p.move(100);
        p.turn (-90);
        p.move(100);
        p.turn (-90);
        p.move(100);
        //draw thick red square
        p.up();
        p.setDirection(270);
        p.move(100);
        p.down();
        p.setWidth(10);
        p.setColor(Color.red);
        p.move(100);
        p.turn(90);
        p.move(100);
        p.turn(90);
        p.move(100);
        p.turn(90);
        p.move(100);
        //draw super thick green square
        p.up();
        p.move(-200, 100);
        p.setDirection(0);
        p.down();
        p.setWidth(20);
        p.setColor(Color.green);
        p.move(100);
        p.turn(90);
        p.move(100);
        p.turn(90);
        p.move(100);
        p.turn(90);
        p.move(100);
        //hello
        p.up();
        p.move(-200, -150);
        p.down();
        p.setColor(Color.orange);
        p.drawString("Hello Turtle Graphics");
    }
    
}
