import greenfoot.*;

public class Bucket extends Actor {
    private int speed = 5;

    public Bucket() {
        GreenfootImage image = new GreenfootImage("Bucket.png");
        image.scale(80, 50); // Adjust the bucket size
        setImage(image);
    }

    public void act() {
        // Move the bucket left or right with arrow keys
        if (Greenfoot.isKeyDown("left") && getX() > 0) {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("right") && getX() < getWorld().getWidth()) {
            move(speed);
        }
    }
}
