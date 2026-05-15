import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PirateBand here.
 * 
 * @Javier 
 * @1.0
 */
public class PirateBand extends Actor
{
    private Pirate captain = new Pirate();
    private Pirate [] bande;
    private String name;
    private boolean imHafen;
    private int wartetage;
    private int raidGeld = 150;
    public PirateBand(int anzahl, String pname, int pwartetage)
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
    
    public void raid()
    {
        MyWorld Welt = ((MyWorld) getWorld());
        int zehntage = 0;
        int g = Greenfoot.getRandomNumber(100);
        if (Welt.gettage() == zehntage+15)
        {
            raidGeld = raidGeld * 2;
        }
        if (g >= 1 && g<= 10)
        {
            Welt.setgeld(Welt.getgeld() - raidGeld);
        }
        
    }
    
    public int getpiratenanzahl()
    {
        return bande.length;
    }
}
