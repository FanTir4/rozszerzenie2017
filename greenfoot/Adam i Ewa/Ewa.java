import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ewa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ewa extends Actor
{
    public void klawisze()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move (1);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move (-1);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move (1);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-90);
            move (-1);
            turn(90);
        }
    }

    public void stawianieJablek()
    {
        int x = getX();
        int y = getY();
        Jablko jablko = new Jablko();
        getWorld().addObject(jablko, x, y);

    }

    public void act() 
    {
        klawisze();
        stawianieJablek();
    }    
}
