import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class finaljuego here.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class finaljuego extends World
{

    /**
     * Constructor for objects of class finaljuego.
     * Despliega musica, ademas de mostrar a llamar el mensaje final del juego
     * 
     */
    GreenfootSound ganarr = new GreenfootSound("ganar.mp3");
    public finaljuego()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
        ganarr.play();
        prepare();
        Greenfoot.stop();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        mensajefinal mensajefinal = new mensajefinal();
        addObject(mensajefinal,450,203);
    }
}
