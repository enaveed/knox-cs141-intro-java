import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Eeman Naveed) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class FruitWorld extends World {
    private int score = 0;

    public FruitWorld() {    
        super(600, 400, 1); // Set screen size
        addObject(new Bucket(), getWidth() / 2, getHeight() - 50); // Place bucket at the bottom
        spawnFruit(); // Spawn the first fruit
        showText("Score: " + score, 50, 25); // Display initial score
    }

    public void act() {
        // Occasionally spawn a new fruit
        if (Greenfoot.getRandomNumber(100) < 2) {
            spawnFruit();
        }
    }

    // Method to spawn a new fruit at a random x position at the top of the screen
    public void spawnFruit() {
        int xPosition = Greenfoot.getRandomNumber(getWidth());
        addObject(new Fruit(), xPosition, 0);
    }

    // Method to increase the score when a fruit is caught
    public void increaseScore() {
        score++;
        showText("Score: " + score, 50, 25);
    }

    // Method to end the game when a fruit is missed
    public void gameOver() {
        showText("Game Over! Final Score: " + score, getWidth() / 2, getHeight() / 2);
        Greenfoot.stop(); // Stop the game
    }
}


