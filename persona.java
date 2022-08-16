import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Myworld class, es donde se despliega el mundo, posicionado los objetos, contadores y timer.
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class persona extends Actor
{
    /**
     * Act - do whatever the persona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound recoger = new GreenfootSound("agarrar.wav");
    GreenfootSound velocidad = new GreenfootSound("velocidad.wav");
    GreenfootSound lento = new GreenfootSound("lento.wav");
    MyWorld thisGame;
    Nivel2 nivel2;
    Nivel3 nivel3;
    Nivel4 nivel4;
    nivelfinal nivelfinal;
    //llamar al mundo para luego utilizar la varible de score
int contador = 0;
    public void act(){
        // ADD your action code here.
        
        //utilizacion de los metodos en funcion de si es 1, 0 o 2 el contador
        if (contador == 0){
            
            moverpersonaje();
            desaparecerobjeto();
            tocarotroobjeto();
            tocarobjetolento();
            
            
        }
        else if(contador ==1){
        
        moverpersonajerapido();
        desaparecerobjeto();
        tocarotroobjeto();
         tocarobjetolento();
        }
        else if(contador ==2){
        moverpersonajelento();
        desaparecerobjeto();
        tocarotroobjeto();
        tocarobjetolento();
        
        }
          
}
    //en los metodos vinculados al movimiento este al tocar con un objeto el cual no puede traspasarse este lo devolvera de posicion a la original en funcion de las x e y    
       

    //movimiento de personaje normal antes de interactuar con la el objeto de la clase speed
    public void moverpersonaje(){
     
    if(Greenfoot.isKeyDown("right"))
       {
          setLocation(getX()+2,getY());
          if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()-2,getY());
    
    }
       }
    if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-2,getY());
    
            if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()+2,getY());
    
    }
       }
    if(Greenfoot.isKeyDown("up"))
    {
           setLocation(getX(),getY()-2);
            if(isTouching(parteinpentrable.class)){
     setLocation(getX(),getY()+2);}
           
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()+2);
    
    }
           
    }
    if(Greenfoot.isKeyDown("down"))
    {
           setLocation(getX(),getY()+2);
           
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()-2);
    
    }
    }
    
    
       
      
    }
    //metodo que al tocar cualqueier obj de la clase basura 1 esta desaparecera y cambiara la variable de score para sumar puntos
     public void desaparecerobjeto(){
        
        if (isTouching(basura1.class)){
        recoger.play();
        removeTouching(basura1.class);
        
        thisGame.score++;
        nivel2.score++;
        nivel3.score++;
        nivel4.score++;
        nivelfinal.score++;
        }
        
        } 
        
        //metodo que al tocar cualqueier obj de la clase speed este cambiara el contador a 1, el cual inicialmente estaba en cero, mueve entonces el personaje mas rapido
    public void tocarotroobjeto(){
        if (isTouching(speed.class)){
        velocidad.play();
        removeTouching(speed.class);
        contador = 1;
    
    }
        
    }
    
    //metodo que al tocar objeto de la classe slow, este cambiara el contador a 2 para ejecutar los metodos que lo haran lento
    public void tocarobjetolento(){
    
        if (isTouching(slow.class)){
        lento.play();
        removeTouching(slow.class);
        contador = 2;
    
    }}

    //movimientos de la persona pero mas rapido en funcion del cambio de contador a 1
public void moverpersonajerapido(){
        
    if(Greenfoot.isKeyDown("right"))
       {
          setLocation(getX()+5,getY());
          if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()-5,getY());
    
    }
       }
       if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-5,getY());
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()+5,getY());
    
    }
       }
       if(Greenfoot.isKeyDown("up"))
       {
           setLocation(getX(),getY()-5);
           
           if(isTouching(parteinpentrable.class)){
     setLocation(getX(),getY()+5);}
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()+5);
    
    }
       }
       if(Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(),getY()+5);
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()-5);
    
    }
           
       }
      
    }

    //movimientos de la persona pero mas lento en funcion del cambio de contador a 2
    
    public void moverpersonajelento(){
        
    if(Greenfoot.isKeyDown("right"))
       {
          setLocation(getX()+1,getY());
          if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()-1,getY());
    
    }
       }
       if(Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-1,getY());
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX()+1,getY());
    
    }
       }
       if(Greenfoot.isKeyDown("up"))
       {
           setLocation(getX(),getY()-1);
           
           if(isTouching(parteinpentrable.class)){
     setLocation(getX(),getY()+1);}
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()+1);
    
    }
       }
       if(Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(),getY()+1);
           if(isTouching(parteinpenetrable2.class)){
     setLocation(getX(),getY()-1);
    
    }
           
       }
      
    }
    
    
    
    
}
