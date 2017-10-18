import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adam extends Actor
{
    int miejsceWBrzuszku = 5;
    public void klawisze()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            move (1);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move (-1);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move (1);
            turn(90);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            turn(-90);
            move (-1);
            turn(90);
        }
    }

    public void zjadanieJablek()
    {
        if( this.isTouching(Jablko.class)&&
        miejsceWBrzuszku>0)
        {
            this.removeTouching(Jablko.class);
            miejsceWBrzuszku--;
        }

    }
    public void wychodek()
    {
        if(this.isTouching(Wychodek.class))
        {
            miejsceWBrzuszku = 5;
        }
    }
    public void wiekszyBrzuszek()
    {
        if(Greenfoot.isKeyDown("b"))
        {
            miejsceWBrzuszku = 15;
        }
    }

    public void act() 
    {
        klawisze();
        zjadanieJablek();
        wychodek();
        wiekszyBrzuszek();

    }    
}
