
import java.awt.Color;

/**
 * 
 * You can experiment with this class to get different patterns
 * 
 */
public class CoolPattern
{
    
    public static void main(String[] args)
    {
        World world = new World();
        Turtle turt = new Turtle(world);

        turt.hide();
        turt.moveTo(10, world.getHeight()/2);
        turt.setPenColor(Color.BLUE);
        turt.setPenWidth(4);
        
        int side1 = 100;
        int side2 = 30;
        
        turt.turn(45);        
        for (int i=0; i<10; i++) {
            turt.forward(side1);
            turt.turn(45);
            turt.forward(side2);
            turt.turn(135);
            turt.forward(side1);
            turt.turn(45);
            turt.forward(side2);
            turt.backward(side2);
            turt.turn(135);
        }
    }
}
