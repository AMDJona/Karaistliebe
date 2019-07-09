import GLOOP.*;
public class FCBG{
    GLSchwenkkamera Kamera;
    GLLicht Licht, Flamme;
    GLHimmel Himmel;
    GLBoden Boden;
    GLQuader Hauptgebäude, Fenster;
    GLKugel Kugel;
    GLTastatur Tastatur;
    GLZylinder Kerze, Docht;
    int XDimension,YDimension,ZDimension;
    
    public FCBG(){
        //Erzeugen von Objekten
        Kamera = new GLSchwenkkamera();
        Licht = new GLLicht();
        Tastatur = new GLTastatur();
        //Setzen der Kameraposition
        XDimension = 0;
        YDimension = 300;
        ZDimension = 500;
        Kamera.setzePosition(XDimension,YDimension,ZDimension);
        //Eine schöne Kerze wird erzeugt.
        Kerze = new GLZylinder(0,50,0, 40,100);
        Kerze.drehe(90,0,0);
        Kerze.setzeFarbe(1,0,0);
        //Die Schöne Kerze benötigt ebenfalls einen Docht.
        Docht = new GLZylinder(0,105,0, 3,10);
        Docht.drehe(90,0,0);
        Docht.setzeFarbe(0,0,0);
        //Die Schöne Kerze benötigt ebenfalls eine Flamme, um echt auszusehen #Nofake
        Flamme = new GLLicht(0,125,0);
        Flamme.setzeSichtbarkeit(true);
        Flamme.setzeFarbe(1,1,0.5);
        Flamme.skaliere(1,2,1);
        while(true){
                if(Tastatur.istGedrueckt('1')){
                Kerze.drehe(1,1,1);
                }
                if(Tastatur.istGedrueckt('2')){
                    Kamera.schwenkeVertikal(-10);
                Docht.drehe(1,1,1);
                }
                if(Tastatur.istGedrueckt('3')){
                Flamme.drehe(1,1,1);
                if(Tastatur.istGedrueckt('a')){
                    Kamera.schwenkeHorizontal(1);
                }
                if(Tastatur.istGedrueckt('d')){
                    Kamera.schwenkeHorizontal(-1);
                }
                if(Tastatur.istGedrueckt('w')){
                    Kamera.schwenkeVertikal(1);
                }
                if(Tastatur.istGedrueckt('s')){
                    Kamera.schwenkeVertikal(-1);
                    System.out.println("Sie haben nach Unten gedrückt!");
                }
                Kamera.schwenkeVertikal(-1);
                Sys.warte(250);
        
       
        
        
    }
     
    }
}

}