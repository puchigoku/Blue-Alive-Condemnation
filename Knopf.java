import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knopf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knopf extends Actor
{
    private String Gebeude;
    public Knopf(String Stringp)
    {
        Gebeude=Stringp;
    }

    public void act()
    {
        bauen();
    }

    public void bauen()
    {
        if (Greenfoot.mouseClicked(this))
        {
            if (Gebeude=="Markt")
            {

            }
            if (Gebeude=="Schiff")
            {

            }
        }
    }
    //MouseInfo mouse = Greenfoot.getMouseInfo();
    //System.out.println("Mouse coordinates: " + mouse.getX() + ", " + mouse.getY());
    //if (Greenfoot.mousePressed(this)) {
    // Mouse is down
}
