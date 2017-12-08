import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bałwan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balwan extends Actor
{
    public void krecenie()
    {
        int kat = Greenfoot.getRandomNumber(135);
        if (kat>45)
        {
            turn(kat);
        }
        turn(1);

    }

    public void act() 
    {
        krecenie();
    }    
}
