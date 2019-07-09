import GLOOP.*;
public class osu{
    GLTastatur Tastatur;
    GLKamera Kamera;
    GLLicht Licht;
    int Key1, Key2;
    int Durchläufe;
    int Gesamtklicks;
    boolean timesup;
  
        
public osu(){
    //Objekte werden Implimentiert.
    Key1 = 0;
    Key2 = 0;
    Tastatur = new GLTastatur();
    Kamera = new GLKamera(640,360);
    //Licht = new GLLicht();
    timesup = false;
    Durchläufe = 0;
    
    //Timer:
    System.out.println("Das Programm beginnt in 3 Sekunden.");
    Sys.warte(1000);
    System.out.println("Drücke so schnell du kannst die Y und X Tasten.");
    Sys.warte(1000);
    System.out.println("Let's...");
    Sys.warte(800);
    System.out.println("GOOOO!!");
    Sys.warte(200);
       
    
    //Abfrage Code
 while(timesup = false){
    //Abfrage der Taste "Y"
    if(Tastatur.istGedrueckt('y')){;
     Key1 ++;
     Gesamtklicks ++;
     System.out.print("Klick! ");
     System.out.println(Gesamtklicks);
         }
    //Abfrage der Taste "X"
       if(Tastatur.istGedrueckt('x')){;
           Key2 ++;
           Gesamtklicks ++;
           System.out.print("Klick! ");
           System.out.println(Gesamtklicks);
       }
           if (Durchläufe > 100){
          timesup = true;  
          System.out.print("Du hast es Geschafft. Du hast in 8 Sekunden ");
          System.out.print(Gesamtklicks); 
          System.out.println(" Klicks geschafft.");
          System.out.print("Das waren ");
          System.out.print(Key1);
          System.out.print(" Klicks mit der Y Taste, und ");
          System.out.print(Key2);
          System.out.println(" Mit der X Taste.");
          System.out.print("Dein Ergebniss war: ");
         
          
          
          }
  Sys.warte(80);
  Durchläufe ++;
}
}
}