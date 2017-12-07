import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hipopotam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hipopotam extends Actor
{
    int predkosc = 1;
    int kat = 0;
    public void poruszanie()
    {
        move(predkosc);
        World world = this.getWorld();
        int szerokosc = world.getWidth() -1;
        int mojeX = getX();
        if(mojeX >= szerokosc)
        {
            turn(180);
            predkosc = Greenfoot.getRandomNumber(5);
            
            kat = Greenfoot.getRandomNumber(90);
            turn(kat);
        }

        if(mojeX <= 0)
        {

            turn(180);
            predkosc = Greenfoot.getRandomNumber(5);
            kat = Greenfoot.getRandomNumber(90);
            turn(kat);
        }
    }
    public void uciekajZabie()
    {
        if( isTouching(Zaba.class))
        {
            setLocation(
            
            Greenfoot.getRandomNumber(getWorld().getWidth()-4),
            Greenfoot.getRandomNumber(getWorld().getWidth()-4));
        
        }
    }

    public void act() 
    {
        poruszanie();
        uciekajZabie();

    }  
}
