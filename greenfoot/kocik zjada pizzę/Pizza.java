import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    public void spadaj()
    {
        turn(90);
        move(1);
        turn(-90);
    }

    public void wykryjDno()
    {
        World world = this.getWorld();
        int wysokosc = world.getHeight() -1;
        int mojeY = getY();
        if(mojeY >= wysokosc) world.removeObject(this);
    }

    public void act() 
    {
        spadaj();
        wykryjDno();
    }    
}
