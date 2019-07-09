import GLOOP.*;
public class Maus{

    GLEntwicklerkamera Kamera;
    GLLicht Licht;
    GLKugel Körper, OhrLinks, OhrRechts, Nase;
    GLHimmel Himmel;
    GLBoden Boden;
    GLNebel Nebel;
    GLZylinder Objekt;
    GLTastatur Tastatur;
    int R;
    int G;
    int B;
    int i;
    int SysWarte;
    
    public Maus(){
        //Variablen
        SysWarte = 30;
        R = 0;
        G = 0;
        B = 0;
        
        //Himmel, Boden
        Himmel = new GLHimmel("bild.jpg");
        Boden = new GLBoden("Boden.jpg");
        
        //Wichtige Objekte
        Tastatur = new GLTastatur();

        //Nebel = new GLNebel();
        Kamera = new GLEntwicklerkamera(1280,720);
        Licht = new GLLicht();
        Körper = new GLKugel(0,100,0,75);
        OhrLinks = new GLKugel(-50,165,0,40);
        OhrRechts = new GLKugel(50,165,0,40);
        Nase = new GLKugel(0,85,65,20);
        Objekt = new GLZylinder(750,250,750,250,1000);
        
        //Texturen
        Körper.setzeTextur("headtextur.jpg");
        OhrLinks.setzeTextur("redtexture.jpg");
        OhrRechts.setzeTextur("redtexture.jpg");
        Nase.setzeTextur("Nase.jpg");
                
        //Transformationen
        Körper.drehe(95,85,0);
        
        //While Schleife
        while(true){
         while(Tastatur.istGedrueckt('f'))
        {
           Nase.drehe(1,1,1);
           Körper.drehe(1,1,1);
           System.out.println("R is Currently");
           System.out.print(R);                           
            Objekt.setzeFarbe(R,255,255);
            Sys.warte(SysWarte);
        }
    }
     }
    }
    

