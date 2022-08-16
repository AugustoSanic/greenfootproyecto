import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nivelfinal here.
 * 
  * @Augusto Sanic 20717  
 * @version 1.1 
 * 
 * 
 */
public class nivelfinal extends World
{
    
    //invocando clases importadas de simple timer y el counnter, musica, ademas mandando a llamar a la clase para el uso de la variable public static score (el puntaje de dicho nivel)
GreenfootSound musicanivel = new GreenfootSound("cancionnivelfinal.mp3");
SimpleTimer tim = new SimpleTimer();
Counter timeCount = new Counter("Segundos restantes: ");
public static int score = 0;
enemigofinal enemigofinal;
    /**
     * Constructor for objects of class nivelfinal.
     * 
     */
    public nivelfinal()
    {    
        /// posicion de metodos y objetos en mundo
        super(650, 800, 1); 
        
        prepare();
        addObject(timeCount, 100, 20);
        timeCount.setValue(65);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    //posiciona los del juego
    private void prepare()
    {
        enemigofinal enemigofinal = new enemigofinal();
        addObject(enemigofinal,308,90);

        persona persona = new persona();
        addObject(persona,571,738);

        Counter counter = new Counter();
        addObject(counter,542,18);
        counter.setLocation(506,12);
        counter.setLocation(492,51);
        removeObject(counter);

        basura1 basura1 = new basura1();
        addObject(basura1,528,68);

        basura1 basura12 = new basura1();
        addObject(basura12,539,119);
        basura1 basura13 = new basura1();
        addObject(basura13,594,200);
        basura1 basura14 = new basura1();
        addObject(basura14,521,284);
        basura1 basura15 = new basura1();
        addObject(basura15,64,144);
        basura1 basura16 = new basura1();
        addObject(basura16,81,239);
        basura1 basura17 = new basura1();
        addObject(basura17,407,286);
        basura1 basura18 = new basura1();
        addObject(basura18,187,370);
        basura1 basura19 = new basura1();
        addObject(basura19,149,221);
        basura1 basura110 = new basura1();
        addObject(basura110,130,96);
        basura1 basura111 = new basura1();
        addObject(basura111,479,30);
        basura1 basura112 = new basura1();
        addObject(basura112,590,79);
        basura1 basura113 = new basura1();
        addObject(basura113,288,136);
        basura1 basura114 = new basura1();
        addObject(basura114,348,61);



        
    }
    
     //metodo act, igual al de los otros mundos, variables de score varian en la cantidad de basura que exista
    public void act(){
    musicanivel.play();
    if(tim.millisElapsed() > 1000  ){

            timeCount.add(-1);
            tim.mark();
            if(timeCount.getValue() == 0 && score != 31){
                musicanivel.stop();
                Greenfoot.setWorld(new perdiste());
                Greenfoot.stop();
            }
            if(timeCount.getValue() != 0 && score == 31){
                musicanivel.stop();
                score = 0;
                Greenfoot.setWorld(new finaljuego());
                
            }
            //aqui se considera el tiempo, si llegan a dichos segundos el timeCount, este desplegara nuevos objetos
            if((timeCount.getValue() == 49)){//49
        basura1 basura115 = new basura1();
        addObject(basura115,396,626);
        basura1 basura190 = new basura1();
        addObject(basura190,57,652);
        basura1 basura116 = new basura1();
        addObject(basura116,196,603);
        basura1 basura117 = new basura1();
        addObject(basura117,381,668);
        basura1 basura118 = new basura1();
        addObject(basura118,518,600);
        basura1 basura119 = new basura1();
        addObject(basura119,291,706);
        basura1 basura120 = new basura1();
        addObject(basura120,614,540);
        basura1 basura121 = new basura1();
        addObject(basura121,357,547);
        basura1 basura122 = new basura1();
        addObject(basura122,538,672);
        basura122.setLocation(452,762);
        basura1 basura123 = new basura1();
        addObject(basura123,119,752);
        
        } 
        //al cambiar la variable public static comprobar muerte en el actor de enemigo final, es decir cuando pase de cero a 1, esta automaticamente mandara a escenario "perder"
         if (enemigofinal.comprobarmuerte == 1){
            musicanivel.stop();
            enemigofinal.comprobarmuerte = 0;
            Greenfoot.setWorld(new perdiste());
            Greenfoot.stop();
            
            
            }
         //aqui se considera el tiempo, si llegan a dichos segundos el timeCount, este desplegara nuevos objetos
        if((timeCount.getValue() == 43)){ //43
        
        slow slow = new slow();
        addObject(slow,36,631);
        slow slow2 = new slow();
        addObject(slow2,88,647);
        slow slow3 = new slow();
        addObject(slow3,134,676);
        slow slow4 = new slow();
        addObject(slow4,184,726);
        slow slow5 = new slow();
        addObject(slow5,194,753);
        slow5.setLocation(201,769);
        slow slow6 = new slow();
        addObject(slow6,161,703);
        slow slow7 = new slow();
        addObject(slow7,375,744);
        slow7.setLocation(386,771);
        slow slow8 = new slow();
        addObject(slow8,442,714);
        slow slow9 = new slow();
        addObject(slow9,490,672);
        slow slow10 = new slow();
        addObject(slow10,414,739);
        slow slow11 = new slow();
        addObject(slow11,465,694);
        slow slow12 = new slow();
        addObject(slow12,516,663);
        slow slow13 = new slow();
        addObject(slow13,552,648);
        slow slow14 = new slow();
        addObject(slow14,591,634);
        slow slow15 = new slow();
        addObject(slow15,633,624);
        slow.setLocation(17,630);
        slow slow16 = new slow();
        addObject(slow16,17,630);
        slow slow17 = new slow();
        addObject(slow17,52,634);
        
        }
         //aqui se considera el tiempo, si llegan a dichos segundos el timeCount, este desplegara nuevos objetos
        if((timeCount.getValue() == 35)){//35
        
        basura1 basura115 = new basura1();
        addObject(basura115,163,483);
        slow slow = new slow();
        addObject(slow,80,440);
        slow slow2 = new slow();
        addObject(slow2,259,406);
        slow slow3 = new slow();
        addObject(slow3,141,590);
        slow slow4 = new slow();
        addObject(slow4,307,515);
        slow slow5 = new slow();
        addObject(slow5,480,406);
        slow slow6 = new slow();
        addObject(slow6,562,556);
        slow slow7 = new slow();
        addObject(slow7,499,486);
        slow7.setLocation(626,377);
        basura1 basura116 = new basura1();
        addObject(basura116,562,454);
        
        
        }
         //aqui se considera el tiempo, si llegan a dichos segundos el timeCount, este desplegara nuevos objetos
        if((timeCount.getValue() == 25)){//25
        
        slow slow = new slow();
        addObject(slow,515,193);
        slow slow2 = new slow();
        addObject(slow2,484,113);
        basura1 basura115 = new basura1();
        addObject(basura115,594,138);
        basura1 basura116 = new basura1();
        addObject(basura116,61,76);
        slow slow3 = new slow();
        addObject(slow3,119,68);
        basura1 basura117 = new basura1();
        addObject(basura117,416,236);
        basura1 basura118 = new basura1();
        addObject(basura118,615,37);
        slow slow4 = new slow();
        addObject(slow4,502,25);
        
        
        }
         //aqui se considera el tiempo, si llegan a dichos segundos el timeCount, este desplegara nuevos objetos
         if((timeCount.getValue() == 10)){//10
            
            speed speed = new speed();
        addObject(speed,389,395);
        basura1 basura115 = new basura1();
        addObject(basura115,315,776);
            
            }
        }
        
        showText("Puntuacion: " + score, 510, 20);
    }
}
