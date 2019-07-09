import sum.kern.*;
/**
* @author Daniel Janson (edited by orb1t)
* @version 1.1 beta
*/
public class Spielfeld
{
    // Objekte
    Bildschirm derBildschirm;
    Ufo meinUfo;
    Tastatur dieTastatur;

    // Konstruktor
    public Spielfeld()
    {
        derBildschirm = new Bildschirm(640,480);
        dieTastatur = new Tastatur();
        meinUfo = new Ufo(derBildschirm);
    }

    // Dienste
    public void fuehreAus()
    {
        // Aktionsteil
        meinUfo.zeichneUfo();
        while(true)
        {
            meinUfo.radiereUfo();
            meinUfo.bewegeUm(0.1);
            meinUfo.zeichneUfo();
            if(dieTastatur.wurdeGedrueckt())
            {
                switch(dieTastatur.zeichen())
                {
                    case 'a':
                    meinUfo.dreheLinks();
                    break;
                    case 'd':
                    meinUfo.dreheRechts();
                    break;
                    case '1':
                    //Code ...
                    break;
                    case '2':
                    //Code ...
                    break;
                    default:
                    //Code ...
                    break;
                }
                dieTastatur.weiter();
            }
        }
    }
}