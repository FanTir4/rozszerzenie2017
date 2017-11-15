import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kocik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kocik extends Actor
{
    final int STAN_SIEDZI = 0;
    final int STAN_W_PRAWO_1 = 1;
    final int STAN_W_PRAWO_2 = 2;
    final int STAN_W_LEWO_1 = 3;
    final int STAN_W_LEWO_2 = 4;

    int stanKocika = STAN_SIEDZI;
    int punkty = 0;
    boolean tanczyc = false;

    public void ruch()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            move(2);
            if(stanKocika == STAN_W_PRAWO_1)
                stanKocika = STAN_W_PRAWO_2;
            else
                stanKocika = STAN_W_PRAWO_1;
        }
        if(Greenfoot.isKeyDown("left")) 
        {
            move(-2);
            if(stanKocika == STAN_W_LEWO_1)
                stanKocika = STAN_W_LEWO_2;
            else
                stanKocika = STAN_W_LEWO_1;
        }
        if(!Greenfoot.isKeyDown("left") && !Greenfoot.isKeyDown("right"))
        {
            stanKocika = STAN_SIEDZI;
        }
    }

    public void zjadajPizze()
    {
        if(isTouching(Pizza.class))
        {
            removeTouching(Pizza.class);
            punkty++;
            tanczyc = true;
        }
    }

    public void ustawWyglad()
    {
        if(stanKocika == STAN_SIEDZI)
            setImage("cat-sit.png");
        if(stanKocika == STAN_W_PRAWO_1)
            setImage("cat-walk-right.png");
        if(stanKocika == STAN_W_PRAWO_2)
            setImage("cat-walk-right2.png");
        if(stanKocika == STAN_W_LEWO_1)
            setImage("cat-walk-left.png");
        if(stanKocika == STAN_W_LEWO_2)
            setImage("cat-walk-left2.png");

    }
    public void pokazPunkty()
    {
        World world = getWorld();
        world.showText("Punkty:" +punkty, 200, 100);

    }
    public void taniec()
    {
        if((punkty % 10 == 1)&&tanczyc)
        {
            setImage("cat-dance.png");
            Greenfoot.delay(10);
            setImage("cat-dance-2.png");
            Greenfoot.delay(10);
            tanczyc = false;
        }
    }

    public void act() 
    {
        ruch();
        zjadajPizze();
        ustawWyglad();
        pokazPunkty();
        taniec();
    }    
}
