import java.awt.Color;

public class Circle
{

    public static void main(String[] args)
    {
        World world = new World(800, 800);
        Turtle turtle = new Turtle(world);

        // Pick a color
        turtle.setPenColor(Color.BLACK);
        
        // Remember that you can't draw circles directly
        // This is a 20 sided polygon with sides of length 50
        for (int i = 0; i < 60; i++)
        {
            turtle.forward(19);
            // turn 18 degrees because 18 * 20 == 360 and 
            // this is a 20 sided polygon
            turtle.turn(6);
        }
    }
    
}
