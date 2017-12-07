import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
       
   
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
        Hipopotam hipopotam = new Hipopotam();
        addObject(hipopotam,96,62);
        Hipopotam hipopotam2 = new Hipopotam();
        addObject(hipopotam2,96,151);
        Hipopotam hipopotam3 = new Hipopotam();
        addObject(hipopotam3,102,240);
        Hipopotam hipopotam4 = new Hipopotam();
        addObject(hipopotam4,104,334);
        Zaba zaba = new Zaba();
        addObject(zaba,348,142);
         
        int ile = Greenfoot.getRandomNumber(5);
        int szerokosc = this.getWidth();
        int wysokosc = this.getHeight();
        for(int i=0; i<ile; i++)
        {
            int x = Greenfoot.getRandomNumber( szerokosc);
            int y = Greenfoot.getRandomNumber( wysokosc);
            Kangur kangur = new Kangur();
            addObject( kangur, x, y);

        }
        
    }
     
    
    }

