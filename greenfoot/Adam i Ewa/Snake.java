import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    public boolean dotykaEwe()
    {
        return isTouching(Ewa.class);
    }
    public boolean dotykaAdama()
    {
        return isTouching(Adam.class);
    }
}
