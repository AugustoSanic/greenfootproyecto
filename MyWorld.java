import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Myworld class, es donde se despliega el mundo, posicionado los objetos, contadores y timer.
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class MyWorld extends World
{
    //invocando clases importadas de simple timer y el counnter, musica, ademas mandando a llamar a la clase para el uso de la variable public static score (el puntaje de dicho nivel)
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter("Segundos restantes: ");
    GreenfootSound musicanivel = new GreenfootSound("musicajuego.mp3");
    Nivel2 nivel2;
    pressa ganar;
    public static int score = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // posicion de metodos y objetos en mundo
        
        super(900, 240, 1); 
        desplegarobjetos();
        addObject(timeCount, 100, 20);
        timeCount.setValue(8);
    }

    //Parte del contador de puntos que va hacia atras.
    
    public void act(){
        musicanivel.play();
        if(tim.millisElapsed() > 1000  ){
            //cada vez que pase un segundo, (1000mili = 1seg), se restara al contador -1
            timeCount.add(-1);
            tim.mark();//vuelve a resetar el simpletime, el simpletime (tim) es distinto del Counter (timeCount)
            
            //En caso se cumpla el if de dos condiones, perdera y trasladara al world de "perdiste"
            if(timeCount.getValue() == 0 && score != 9){
                musicanivel.stop();
                Greenfoot.setWorld(new perdiste());
                Greenfoot.stop();
            }
            
            //En caso se cumpla el if de dos condiones, perdera y trasladara al world de "ganaste"
            if(timeCount.getValue() != 0 && score == 9){//En caso se cumpla el if de dos condiones trasladara al world de "ganaste"
                musicanivel.stop();
                score = 0;
                nivel2.score =0;
                ganar.contador = 0;
                Greenfoot.setWorld(new ganaste());
                
                
            }

               
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
        basura1 basura06= new basura1();
        basura1 basura07= new basura1();
        basura1 basura08= new basura1();
        addObject(basura0,297,185);
        addObject(basura01,313,134);
        addObject(basura02,319,159);
        addObject(basura03,368,163);
        addObject(basura04,261,155);
        addObject(basura05,828,154);
        addObject(basura06,868,160);
        addObject(basura07,822,192);
        addObject(basura08,866,196);
        
        speed Speed = new speed();
        addObject(Speed, 480,108);

    }

    

}
     
 
