import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = this.getX();
        int y = this.getY();
        
        if(Greenfoot.isKeyDown("up"))
        {
            y = y - 1;
        }
        else if(this.isTouching(Ground.class))
        {
            // no gravity
        }
        else
        {
            // gravity
            y = y + 1;
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            x = x - 1;
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            x = x + 1;
        }
        
        this.setLocation(x,y);
    }
    
    public void setLocation(int x, int y)
    {
        int maxY = this.getWorld().getHeight() - (this.getImage().getHeight() / 2);
        int minY = this.getImage().getHeight() / 2;
        
        int maxX = this.getWorld().getWidth() - (this.getImage().getWidth() / 2);
        int minX = this.getImage().getWidth() / 2;
        
        if(y > maxY)
        {
            y = maxY;
        }
        
        if(y < minY)
        {
            y = minY;
        }
        
        if(x > maxX)
        {
            x = maxX;
        }
        
        if(x < minX)
        {
            x = minX;
        }
        
        super.setLocation(x, y);
    }
}
