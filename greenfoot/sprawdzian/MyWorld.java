import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Swinia swinia = new Swinia();
        addObject(swinia,299,208);
        Balwan balwan = new Balwan();
        addObject(balwan,200,93);
        Balwan balwan2 = new Balwan();
        addObject(balwan2,496,153);
        Balwan balwan3 = new Balwan();
        addObject(balwan3,166,320);
        

        int szerokosc = this.getWidth();
        int wysokosc = this.getHeight();

        int x = Greenfoot.getRandomNumber( szerokosc);
        int y = Greenfoot.getRandomNumber( wysokosc);
        
        
    }

    
}
