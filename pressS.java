import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pressS here.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class pressS extends Actor
{
    
    intro thisGame;
    /**
     * Act - do whatever the pressS wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("s")){
            Greenfoot.setWorld(new MyWorld());
            //cambia al mundo inicial al presionar "s"
        }
      }
      
      //constructor de la imagen que contiene instrucciones, escalada a un tamaño mas pequeño
    public pressS(){
        getImage().scale(440,200);
    }
}
