import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    public void ruch()
    {
        if(Greenfoot.isKeyDown("right")) move(2);
        if(Greenfoot.isKeyDown("left")) move(-2);
    }

    public void act() 
    {
        ruch();
    }    
}
