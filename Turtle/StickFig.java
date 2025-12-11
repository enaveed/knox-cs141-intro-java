import java.awt.Color;
public class StickFig
{

    public static void main(String[] args)
    {
       World world = new World(1000, 1000);
       Turtle turtle = new Turtle(world);

       turtle.setColor(Color.RED);// set color
       // Face position
       turtle.penUp();
       turtle.moveTo(400, 200);
       turtle.penDown();
       //Draw Face
       for (int i = 0 ; i<40; i++){
        turtle.turn(9);
        turtle.forward(10);
       }
       //Set body position
       turtle.penUp();
       turtle.moveTo(460, 266);
       turtle.penDown();
       //Draw body
       turtle.forward(-50);
       turtle.turn(90);
       turtle.forward(100);
       turtle.backward(200);
       turtle.penUp();
       turtle.moveTo(460, 310);
       turtle.penDown();
       turtle.turn(90);
       turtle.forward(120);

       turtle.turn(45);
       turtle.forward(90);
       turtle.backward(90);
       turtle.turn(-90);
       turtle.forward(90);




    
        
        

    }
 }
        
