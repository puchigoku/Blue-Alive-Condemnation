import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int zeit=0;
    private boolean tag = true;
    private boolean nacht = false;
    private int Geld=300;
    private int Resourcen=300;
    private int Glück=50;
    public int Tag=0;
    private int Platz = 35;
    private PirateBand whitebeard;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       
    }
    public void act()
    {
        Tagnacht();
    }
     public void Tagnacht()
     { zeit++;
        if (zeit>100)
        {
         if (tag==true)
         {
         System.out.println("Nacht");
         zeit=0;
         tag = false;
         //Steuern Zahlen
         //Geld von Gebeuden Kreigen
         //Piraten kommen
         }
         else
         {
         System.out.println("Tag");
         zeit=0;
         tag = true;
         Tag++;
         //Piraten gehen
         }
        }
    }
    public void setgeld(int pgeld)
    {
        Geld = pgeld;
    }
    public int getgeld()
    {
        return Geld;
    }
    public int gettage()
    {
        return Tag;
    }
    public void Resourcenändern(){}
    public void Steuernzahlen(){}
    public void Steuernerhöhen(){}
}

