import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class Nivel2 extends World
{

  
    //invocando clases importadas de simple timer y el counnter, musica, ademas mandando a llamar a la clase para el uso de la variable public static score (el puntaje de dicho nivel)
    GreenfootSound musicanivel = new GreenfootSound("musicajuego.mp3");
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter("Segundos restantes: ");
    public static int score = 0;
    Nivel3 nivel3;
    pressa ganar;
    public Nivel2()
    {    
        // // posicion de metodos y objetos en mundo
        super(1200, 240, 1);
        prepare();
        addObject(timeCount, 100, 20);
        timeCount.setValue(8);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        musicanivel.play();
        if(tim.millisElapsed() > 1000  ){//Parte del contador de puntos que va hacia atras.
        //cada vez que pase un segundo, (1000mili = 1seg), se restara al contador -1

            timeCount.add(-1);
            tim.mark();//vuelve a resetar el simpletime, el simpletime (tim) es distinto del Counter (timeCount)
            if(timeCount.getValue() == 0 && score != 6){
                musicanivel.stop();
                Greenfoot.setWorld(new perdiste());
                Greenfoot.stop();//En caso se cumpla el if de dos condiones, perdera y trasladara al world de "perdiste"
            }
            if(timeCount.getValue() != 0 && score == 6){//En caso se cumpla el if de dos condiones trasladara al world de "ganaste"
                musicanivel.stop();
                score = 0;
                nivel3.score = 0;
                ganar.contador = 1;
                Greenfoot.setWorld(new ganaste());
                
            }

               
        }
        showText("Puntuacion: " + score, 510, 20);
    }
    //metodo prepare
    private void prepare()
    {
        basura1 basura1 = new basura1();
        addObject(basura1,85,149);
        basura1 basura12 = new basura1();
        addObject(basura12,313,171);
        basura1 basura13 = new basura1();
        addObject(basura13,517,133);
        basura1 basura14 = new basura1();
        addObject(basura14,724,176);
        basura1 basura15 = new basura1();
        addObject(basura15,873,128);
        basura1 basura16 = new basura1();
        addObject(basura16,907,189);
        persona persona = new persona();
        addObject(persona,1160,195);
        speed speed = new speed();
        addObject(speed,637,169);
        speed.setLocation(653,159);
        speed.setLocation(638,175);
    }
    
    
    
        
    
}
