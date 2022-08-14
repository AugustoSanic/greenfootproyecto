import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Myworld class, es donde se despliega el mundo, posicionado los objetos, contadores y timer.
 * 
 * @Augusto Sanic 20717  
 * @version 1.0 
 */
public class MyWorld extends World
{
    //invocando clases importadas de simple timer y el counnter
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter("Segundos restantes: ");
    
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // posicion de metodos y objetos en mundo
        super(600, 240, 1); 
        desplegarobjetos();
        addObject(timeCount, 100, 20);
        timeCount.setValue(3);
        prepare();
    }

    //Parte del contador de puntos que va hacia atras.
    
    public void act(){

        if(tim.millisElapsed() > 1000  ){

            timeCount.add(-1);
            if(timeCount.getValue() == 0){
                Greenfoot.stop();
            }

            tim.mark();

            
        }
        showText("Puntuacion: " + score, 510, 20);
    }

    //despliegue de los objetos en el mundoo
    
    
    private void desplegarobjetos(){
        score = 0;
        persona P = new persona();
        addObject(P, 577,209);
        basurero Basurerounico = new basurero();
        addObject(Basurerounico, 144, 107);
        basura1 basura0 = new basura1();
        basura1 basura01 = new basura1();
        basura1 basura02= new basura1();
        basura1 basura03= new basura1();
        basura1 basura04 = new basura1();
        basura1 basura05= new basura1();
        addObject(basura0,297,185);
        addObject(basura01,313,134);
        addObject(basura02,319,159);
        addObject(basura03,368,163);
        addObject(basura04,261,155);
        speed Speed = new speed();
        addObject(Speed, 492,70);

    }

      
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,542,18);
        counter.setLocation(506,12);
        counter.setLocation(492,51);
        removeObject(counter);
    }
}
     
 
