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
    boolean tag = true;
    boolean nacht = false;
    int Geld=300;
    int Resourcen=300;
    int Glück=50;
    int Tag=0;
    int Platz = 35;
    private PiratenBande whitebeard;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        whitebeard = new PiratenBande (Greenfoot.getRandomNumber(25));
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
    public void Resourcenändern(){}
    public void Steuernzahlen(){}
    public void Steuernerhöhen(){}
}

