import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PirateBand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PirateBand extends Actor
{
    private Pirate captain = new Pirate();
    private Pirate [] bande;
    private String name;
    private boolean imHafen;
    private int wartetage;
    public PiratenBande(int anzahl, String pname, int pwartetage)
    {
        bande = new Pirate[anzahl];
        name = pname;
        imHafen = false;
        wartetage = pwartetage;
    }
    
    /**
     * Act - do whatever the PirateBand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void come()
    {
        if (wartetage == 0)
        {
            if (imHafen = false)
            {
                imHafen = true;
            }
        }
        wartetage --;
    }
    
    public int getwartetage()
    {
        return wartetage;
    }
    
    public void standBezahlen()
    {
        
    }
}
