import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Drzewo drzewo = new Drzewo();
        addObject(drzewo,453,152);

        Adam adam = new Adam();
        addObject(adam,54,100);

        Ewa ewa = new Ewa();
        addObject(ewa,260,175);

        Wychodek wychodek = new Wychodek();
        addObject(wychodek,72,361);

    }

    public void act()
    {
        if(Greenfoot.isKeyDown("l"))
        {
            String odp = Greenfoot.ask("Ile węży?");
            int ile = Integer.parseInt(odp);

            int szerokosc = this.getWidth();
            int wysokosc = this.getHeight();
            for(int i=0; i <ile; i++)
            {
                int x = Greenfoot.getRandomNumber( szerokosc);
                int y = Greenfoot.getRandomNumber( wysokosc);
                Snake snake = new Snake();
                addObject( snake, x, y);
                 while(snake.dotykaEwe() || snake.dotykaAdama())
                {
                    x = Greenfoot.getRandomNumber( szerokosc);
                    y = Greenfoot.getRandomNumber( wysokosc);
                    snake.setLocation(x, y);
                }
               
            }
        }
    }
}
