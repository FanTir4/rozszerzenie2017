import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swinia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Swinia extends Actor
{

    public void poruszanie()
    {

        if(Greenfoot.isKeyDown("right"))
        {
            move (2);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move (-2);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            turn(-90);
            move (2);
            turn(90);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            turn(-90);
            move (-2);
            turn(90);
        }
        if(Greenfoot.isKeyDown("p"))
        {
            turn(-45);
            move (4);
            turn(45);
        }

    }

    public void tworzenieBalwanow()
    {
        World world = this.getWorld();
        int szerokosc = world.getWidth();  
        int wysokosc = world.getHeight();
        if(isTouching(Balwan.class))

        {   

            int x = Greenfoot.getRandomNumber(szerokosc);
            int y = Greenfoot.getRandomNumber(wysokosc);
            Balwan balwan = new Balwan();
            getWorld().addObject(balwan, x, y);

        }
        while(isTouching(Balwan.class))
        {

            int x = Greenfoot.getRandomNumber( szerokosc);
            int y = Greenfoot.getRandomNumber( wysokosc);
            setLocation(x, y);
        }
    }

    public void act() 
    {
        poruszanie();
        tworzenieBalwanow();

    }
}
