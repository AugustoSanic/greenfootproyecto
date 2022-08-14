import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Myworld class, es donde se despliega el mundo, posicionado los objetos, contadores y timer.
 * @Augusto Sanic 20717  
 * @version 1.0 
 */
public class persona extends Actor
{
    /**
     * Act - do whatever the persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    MyWorld thisGame;
    //llamar al mundo para luego utilizar la varible de score
int contador = 0;
    public void act(){
        // ADD your action code here.
        
        //utilizacion de los metodos en funcion de si es 1 o 0 el contador
        if (contador == 0){
            
            moverpersonaje();
            desaparecerobjeto();
            tocarotroobjeto();
            
            
        }
        else if(contador ==1){
        
        moverpersonajerapido();
        desaparecerobjeto();
         tocarotroobjeto();
        }
          
}
        
       

    //movimiento de personaje normal antes de interactuar con la el objeto de la clase speed
    public void moverpersonaje(){
     
    if(Greenfoot.isKeyDown("right"))
       {
          setLocation(getX()+2,getY());
       }
    if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-2,getY());
       }
    if(Greenfoot.isKeyDown("up"))
    {
           setLocation(getX(),getY()-2);
    }
    if(Greenfoot.isKeyDown("down"))
    {
           setLocation(getX(),getY()+2);
    }
       
       
      
    }
    //metodo que al tocar cualqueier obj de la clase basura 1 esta desaparecera y cambiara la variable de score para sumar puntos
     public void desaparecerobjeto(){
        
        if (isTouching(basura1.class)){
        removeTouching(basura1.class);
        
        thisGame.score++;
        
        
        }
        
        } 
        
        //metodo que al tocar cualqueier obj de la clase speed este cambiara el contador a 1, el cual inicialmente estaba en cero, mueve entonces el personaje mas rapido
    public void tocarotroobjeto(){
        if (isTouching(speed.class)){
        removeTouching(speed.class);
        contador = 1;
    
    }
        
    }

    //movimientos de la persona pero mas rapido en funcion del cambio de contador a 1
public void moverpersonajerapido(){
        
    if(Greenfoot.isKeyDown("right"))
       {
          setLocation(getX()+6,getY());
       }
       if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-6,getY());
       }
       if(Greenfoot.isKeyDown("up"))
       {
           setLocation(getX(),getY()-6);
       }
       if(Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(),getY()+6);
       }
      
    }}
