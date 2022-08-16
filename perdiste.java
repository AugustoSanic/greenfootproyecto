import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class perdiste here.
 * 
  * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class perdiste extends World
{

    /**
     * Constructor for objects of class perdiste.
     * En el constructor se muestra como ejecuta el sonar al perder, ademas manda a traer el mensaje de pressreset
     */
    GreenfootSound perder = new GreenfootSound("perder.wav");
    public perdiste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 240, 1); 
        perder.play();
        addObject(new pressreset(), 460,163);
        Greenfoot.stop();
    }
}
