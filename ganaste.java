import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ganaste here.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class ganaste extends World
{
    GreenfootSound ganar = new GreenfootSound("ganar.mp3");
    /**
     * Constructor for objects of class ganaste.
     * al ganar, suena la respectiva musica y aparte el mensaje de presionar a para trasladarse al siguiente mundo
     */
    public ganaste()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 240, 1); 
        ganar.play();
        addObject(new pressa(), 480,160);
    }
}
