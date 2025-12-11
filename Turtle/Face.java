import java.awt.Color;

public class Face
{
    public static void main(String[] args)
    {
        
        System.out.println("\n\nDraw a face\n\n");

        {
            //Creating the world for the turtle(World is the canvas)
            World world = new World(800, 800);
            //Creating the turtle, and its going to work(draw) on the world we just created
            Turtle turtle = new Turtle(world);
    
            // Pick a color for the turtle to draw with
            turtle.setPenColor(Color.BLACK);
            
        

            //Drawing the face
            for (int i = 0; i < 60; i++)
            {
                turtle.forward(19);
                // turn 18 degrees because 18 * 20 == 360 and 
                // this is a 20 sided polygon
                turtle.turn(6);
            }
            //Telling the turtle where to be to draw first eye
            turtle.penUp();
            turtle.moveTo(450, 320);
            turtle.penDown();
            
            //Drawing the eye
            for(int i=0; i< 30; i++)
            {
                turtle.forward(8);
                turtle.turn(12);

            }
            //Telloing the turtle where to be, to draw the second eye
            turtle.penUp();
            turtle.moveTo(600, 320);
            turtle.penDown();

            //Drawing the second eye
            for(int i=0; i< 30; i++)
            {
                turtle.forward(8);
                turtle.turn(12);
            }

            //Telling the turtle where to be to draw the mouth
            turtle.penUp();
            turtle.moveTo(530, 450);
            turtle.penDown();

            //Drawing the mouth
            for(int i=0; i< 30; i++)
            {
                turtle.forward(8);
                turtle.turn(12);
            }
        }
        
    }
}
            
        
        
    
    

