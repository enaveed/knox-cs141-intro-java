import greenfoot.*;

public class Fruit extends Actor {
    
    private int speed;

    public Fruit() {
        // Choose a random fruit image and set its size
        String[] fruitImages = {"apple.jpeg", "banana.jpeg", "orange.png"};
        GreenfootImage image = new GreenfootImage(fruitImages[Greenfoot.getRandomNumber(fruitImages.length)]);
        image.scale(30, 30); // Adjust the fruit size
        setImage(image);

        // Set a random speed for variety
        speed = Greenfoot.getRandomNumber(3) + 2;
    }

    public void act() {
        // Move fruit downwards
        setLocation(getX(), getY() + speed);

        // Check if the fruit reaches the bottom edge (missed)
        if (isAtEdge()) {
            ((FruitWorld) getWorld()).gameOver(); // Trigger game over
            getWorld().removeObject(this); // Remove the missed fruit
        } else {
            // Check if the fruit intersects with the bucket (caught)
            Bucket bucket = (Bucket) getOneIntersectingObject(Bucket.class);
            if (bucket != null) {
                ((FruitWorld) getWorld()).increaseScore(); // Increase score if caught
                getWorld().removeObject(this); // Remove caught fruit
            }
        }
    }
}
