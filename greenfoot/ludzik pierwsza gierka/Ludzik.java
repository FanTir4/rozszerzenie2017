import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ludzik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ludzik extends Actor
{
    int kierunek=1;
    public void act() 
    {
  
     move(kierunek);
     if( isAtEdge())kierunek=kierunek*(-1);
       
    }    
}
