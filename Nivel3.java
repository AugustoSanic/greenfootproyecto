import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * 
  * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class Nivel3 extends World
{
GreenfootSound musicanivel = new GreenfootSound("cancionnivelessegundos.mp3");
    /**
     * Constructor for objects of class Nivel3.
     * //invocando clases importadas de simple timer y el counnter, musica, ademas mandando a llamar a la clase para el uso de la variable public static score (el puntaje de dicho nivel)
     */
    Nivel4 nivel4;
    pressa ganar;
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter("Segundos restantes: ");
    public static int score = 0;
    public Nivel3()
    {    
        // // posicion de metodos y objetos en mundo
        super(1200, 350, 1); 
        prepare();
    addObject(timeCount, 100, 20);
        timeCount.setValue(15);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    //posicionar objetos
    private void prepare()
    {
        persona persona = new persona();
        addObject(persona,1036,310);
        persona.setLocation(1002,291);
        persona.setLocation(1008,306);
        basurero basurero = new basurero();
        addObject(basurero,1055,325);
        persona.setLocation(838,307);
        basurero.setLocation(1091,337);
        basurero.setLocation(1079,324);
        persona.setLocation(866,323);
        basurero.setLocation(1083,332);
        parteinpentrable parteinpentrable = new parteinpentrable();
        addObject(parteinpentrable,351,87);
        parteinpentrable parteinpentrable2 = new parteinpentrable();
        addObject(parteinpentrable2,1050,88);

        parteinpenetrable2 parteinpenetrable2 = new parteinpenetrable2();
        addObject(parteinpenetrable2,478,315);

        parteinpenetrable2 parteinpenetrable22 = new parteinpenetrable2();
        addObject(parteinpenetrable22,1176,314);
        basura1 basura1 = new basura1();
        addObject(basura1,59,314);
        basura1 basura12 = new basura1();
        addObject(basura12,178,312);
        basura1 basura13 = new basura1();
        addObject(basura13,112,277);
        basura1 basura14 = new basura1();
        addObject(basura14,325,315);
        basura14.setLocation(367,311);
        basura14.setLocation(350,315);
        basura14.setLocation(350,315);
        basura14.setLocation(356,313);
        basura1 basura15 = new basura1();
        addObject(basura15,1058,287);
        basura1 basura16 = new basura1();
        addObject(basura16,1028,314);
        basura1 basura17 = new basura1();
        addObject(basura17,1007,281);
        basura1 basura18 = new basura1();
        addObject(basura18,640,195);
        basura13.setLocation(84,231);
        basura13.setLocation(97,286);
        basura12.setLocation(162,319);
        //contador
        slow slow = new slow();
        addObject(slow,92,214);
        slow slow2 = new slow();
        addObject(slow2,158,242);
    }
    //metodo act se ejecuta al correr programa
    public void act(){//Parte del contador de puntos que va hacia atras.
        //cada vez que pase un segundo, (1000mili = 1seg), se restara al contador -1
        musicanivel.play();
        if(tim.millisElapsed() > 1000  ){

            timeCount.add(-1);
            tim.mark();
            if(timeCount.getValue() == 0 && score != 8){
                musicanivel.stop();
                Greenfoot.setWorld(new perdiste());
                Greenfoot.stop();
            }
            if(timeCount.getValue() != 0 && score == 8){
                musicanivel.stop();
                score = 0;
                nivel4.score = 0;
                ganar.contador = 2;
                Greenfoot.setWorld(new ganaste());
                
            }

               
        }
        showText("Puntuacion: " + score, 510, 20);
    }
}
