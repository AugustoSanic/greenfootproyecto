import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pressa here.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class pressa extends Actor
{
    /**
     * Act - do whatever the pressa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * En este caso, al tener el act, este cuando se presione la "a", segun el contador el cual por ser public static, conforme vayan avanzando los niveles estos, desde sus
     * propias clases (en los niveles) iran cambiando dicho contador, este en funcion de dichos valores cambiantes cambiara a el nivel que le corresponda.
     */
    
    public static int contador = 0;
    public void act()
    {
        if (Greenfoot.isKeyDown("a") && contador == 0){
            Greenfoot.setWorld(new Nivel2());
            
        }
        
        if (Greenfoot.isKeyDown("a") && contador == 1){
            Greenfoot.setWorld(new Nivel3());
            
        }
        if (Greenfoot.isKeyDown("a") && contador == 2){
            Greenfoot.setWorld(new Nivel4());
            
        }
        if (Greenfoot.isKeyDown("a") && contador == 3){
            Greenfoot.setWorld(new nivelfinal());
            
        }
    }
    
    //reescalar imagen
    public pressa(){
        getImage().scale(700,45);
    }
}
