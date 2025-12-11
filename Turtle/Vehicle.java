import java.awt.Color;
public class Vehicle
{
    public static void main(String[] args)
    {
        
        // TODO: Draw a vechicle.
        // It can be a car, truck, bus, bike, spaceship, Tardis, etc.
        // Be creative!
        System.out.println("\n\nDraw a vehicle\n\n");

        // your code here:

        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world);
        turtle.setColor(Color.BLACK);
        turtle.penUp();
        turtle.moveTo(200, 400);
        turtle.penDown();
        turtle.turn(90);
        turtle.forward(600);
        turtle.turn(90);
        turtle.forward(175);
        turtle.turn(90);
        turtle.forward(600);
        turtle.turn(90);
        turtle.forward(175);
        turtle.penUp();
        turtle.moveTo(300, 575);
        turtle.penDown();

        for (int i = 0; i<40; i++){
        turtle.turn(9);
        turtle.forward(10);
        }

        turtle.penUp();
        turtle.moveTo(600, 575);
        turtle.penDown();

        for (int i = 0; i<40; i++){
        turtle.turn(9);
        turtle.forward(10);
        }

        turtle.penUp();
        turtle.moveTo(300, 400);
        turtle.penDown();
        turtle.turn(45);
        turtle.forward(150);
        turtle.turn(45);
        turtle.forward(200);
        turtle.turn(45);
        turtle.forward(150);








    }

        
    
    
}
