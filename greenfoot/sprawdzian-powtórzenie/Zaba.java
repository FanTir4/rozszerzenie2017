import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zaba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zaba extends Actor
{ int zycia = 3;
    int punkty = 0;
    /**
     * Act - do whatever the Zaba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void poruszanie()
    {

        if(Greenfoot.isKeyDown("d"))
        {
            move (2);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move (-2);
        }
        if(Greenfoot.isKeyDown("w"))
        {
            turn(-90);
            move (2);
            turn(90);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            turn(-90);
            move (-2);
            turn(90);
        }

    }

    public void zjadanie()
    {
        World world = this.getWorld();

        if( this.isTouching(Hipopotam.class))

        {     

            punkty++;
        }
        world.showText("Punkty:" +punkty, 150, 50);
    }

    public void zycia()
    {
        World world = this.getWorld();
        int szerokosc = world.getWidth();
        int wysokosc = world.getHeight();

        if( this.isTouching(Kangur.class))

        {
            
            zycia--;
        }

        world.showText("Życia:" +zycia, 50, 50);
        if(zycia <= 0)
        {
            world.showText("GAMEOVER" , szerokosc/2, wysokosc/2);
            Greenfoot.stop();

        }
    }

    public void act() 
    {
        poruszanie();
        zjadanie();
        zycia();
    }    
}
