import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kangur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kangur extends Actor
{
    /**
     * Act - do whatever the Kangur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if( isTouching(Zaba.class))
        {
            setLocation(
            
            Greenfoot.getRandomNumber(getWorld().getWidth()-4),
            Greenfoot.getRandomNumber(getWorld().getWidth()-4));
        
        }
    }

}
    

