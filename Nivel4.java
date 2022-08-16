import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * 
 *  * @Augusto Sanic 20717  
 * @version 1.1 
 */
public class Nivel4 extends World
{
GreenfootSound musicanivel = new GreenfootSound("cancionnivelessegundos.mp3");
    /**
     * Constructor for objects of class Nivel4.
     * //invocando clases importadas de simple timer y el counnter, musica, ademas mandando a llamar a la clase para el uso de la variable public static score (el puntaje de dicho nivel)
     */
    
    // // posicion de metodos y objetos en mundo
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter("Segundos restantes: ");
    nivelfinal nivelfinal;
    pressa ganar;
    public static int score = 0;
    public Nivel4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 350, 1); 
        prepare();
    addObject(timeCount, 100, 20);
        timeCount.setValue(18);
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * 
    
     */
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
        addObject(parteinpentrable2,1050,90);

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
        
        basura18.setLocation(1178,199);
        basura18.setLocation(1170,215);
        basura17.setLocation(1165,238);
        persona.setLocation(974,322);
        basura1 basura19 = new basura1();
        addObject(basura19,1090,212);
        basura1 basura110 = new basura1();
        addObject(basura110,993,212);
        basura110.setLocation(1017,223);
        basura110.setLocation(1025,218);
        basura1 basura111 = new basura1();
        addObject(basura111,715,262);
        basura111.setLocation(757,261);
        basura111.setLocation(775,261);
        basura1 basura112 = new basura1();
        addObject(basura112,144,199);
        basura1 basura113 = new basura1();
        addObject(basura113,132,235);
        basura113.setLocation(158,250);
        persona.setLocation(971,328);
        basura1 basura114 = new basura1();
        addObject(basura114,64,221);
        basura114.setLocation(23,212);
        slow slow = new slow();
        addObject(slow,855,297);
        slow.setLocation(845,341);
        slow slow2 = new slow();
        addObject(slow2,849,289);
        slow2.setLocation(845,305);
        slow slow3 = new slow();
        addObject(slow3,837,242);
        slow3.setLocation(846,274);
        slow slow4 = new slow();
        addObject(slow4,837,221);
        slow4.setLocation(846,245);
        slow slow5 = new slow();
        addObject(slow5,861,180);
        slow5.setLocation(846,216);
        basura110.setLocation(1010,225);
        speed speed = new speed();
        addObject(speed,693,221);
        speed.setLocation(691,214);
        speed speed2 = new speed();
        addObject(speed2,692,242);
        speed speed3 = new speed();
        addObject(speed3,694,273);
        speed speed4 = new speed();
        addObject(speed4,696,303);
        speed speed5 = new speed();
        addObject(speed5,697,338);

        basura113.setLocation(183,295);
        basura13.setLocation(45,292);
        basura1.setLocation(93,332);
        slow.setLocation(847,332);
        slow slow6 = new slow();
        addObject(slow6,46,233);
        slow6.setLocation(19,256);
        slow slow7 = new slow();
        addObject(slow7,46,211);
        slow7.setLocation(53,253);
        slow slow8 = new slow();
        addObject(slow8,118,244);
        slow8.setLocation(95,257);
        slow slow9 = new slow();
        addObject(slow9,143,255);
        slow9.setLocation(134,258);
        slow slow10 = new slow();
        addObject(slow10,259,197);
        slow10.setLocation(194,191);
        slow slow11 = new slow();
        addObject(slow11,257,172);
        slow slow12 = new slow();
        addObject(slow12,275,264);
        slow12.setLocation(189,256);
        slow slow13 = new slow();
        addObject(slow13,218,253);
        slow slow14 = new slow();
        addObject(slow14,101,258);
        slow8.setLocation(21,264);
        slow12.setLocation(157,267);
        slow12.setLocation(187,248);
        basura113.setLocation(144,254);
        basura113.setLocation(113,218);
        slow8.setLocation(7,271);
        slow8.setLocation(6,252);
        slow6.setLocation(43,247);
        slow7.setLocation(77,259);
        slow14.setLocation(112,247);
        slow9.setLocation(131,252);
        slow13.setLocation(161,248);
        slow7.setLocation(71,250);
        slow11.setLocation(261,279);
    }
    //metodo act, igual al de los otros mundos, variables de score varian en la cantidad de basura que exista
    public void act(){
        musicanivel.play();
        if(tim.millisElapsed() > 1000  ){

            timeCount.add(-1);
            tim.mark();
            if(timeCount.getValue() == 0 && score != 14){
                musicanivel.stop();
                Greenfoot.setWorld(new perdiste());
                Greenfoot.stop();
            }
            if(timeCount.getValue() != 0 && score == 14){
                musicanivel.stop();
                score = 0;
                nivelfinal.score = 0;
                ganar.contador = 3;
                Greenfoot.setWorld(new ganaste());
                
            }

               
        }
        showText("Puntuacion: " + score, 510, 20);
    }
}
