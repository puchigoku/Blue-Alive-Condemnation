import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pirate here.
 * 
 * Javier 
 * 1.0
 */
public class Pirate extends Actor
{
    /**
     * Act - do whatever the Pirate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
    }
    
    public void wandern(Gebeude pGebeude)
    {
        if (getX() != pGebeude.x && getY() != pGebeude.y)
        {
            turn(360-getRotation());
            turn(pGebeude.getRotation());
            while (getX() != pGebeude.x && getY() != pGebeude.y)
            {
                move(2);
            }
        }
    }
}
