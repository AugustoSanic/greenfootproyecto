import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**s
 * Write a description of class intro here.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class intro extends World
{
    GreenfootSound fondomusica = new GreenfootSound("cancionintronumde.mp3");
    /**
     * Constructor for objects of class intro.
     * En el constructor agrega ambos titulo y pressS al mundo
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 240, 1); 
        
        addObject(new pressS(), 307,163);
        addObject(new titulo(), 305, 45);
         
        
    }
    //Mientras este corriendo el programa, la musica sonara, en caso se presione la s se quitara la musica
    public void act(){
        fondomusica.play();
        if (Greenfoot.isKeyDown("s")){
            fondomusica.stop();
            
        }
    }
    
}
