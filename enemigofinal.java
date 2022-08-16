import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigofinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemigofinal extends Actor
{
    /**
     * Act - do whatever the enemigofinal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("enemigofinal.gif");
    public static int comprobarmuerte = 0;
    public void act()
    {
        // Add your action code here.
         setImage(gifImage.getCurrentImage());
         moverse();
         elimina();
    
       
    }
    
    public enemigofinal()
{
    int scalePercent = 50;
    for (GreenfootImage image : gifImage.getImages())
    {
        int wide = image.getWidth()*scalePercent/250;
        int high = image.getHeight()*scalePercent/250;
        image.scale(wide, high);
    }
}


public void moverse(){

    move(5);
    
    if(Greenfoot.getRandomNumber(100) < 10)
    {
    turn(Greenfoot.getRandomNumber(180)-90);
    
    }
  


}


public void elimina(){

    Actor protagonista = getOneObjectAtOffset(0,0,persona.class);
    
    if (protagonista != null){
    
    World world = getWorld();
    world.removeObject(protagonista);
    comprobarmuerte = 1;
    }


}
}
