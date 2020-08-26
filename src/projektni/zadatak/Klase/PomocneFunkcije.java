
package projektni.zadatak.Klase;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class PomocneFunkcije {
    public static String[] popuniListuPoslova(ArrayList<Posao> poslovi)
    {
        String pomocnaLista[] = new String[poslovi.size()];
        for(int i = 0; i < poslovi.size(); i++)
        pomocnaLista[i] = poslovi.get(i).getNaziv();
        
        return pomocnaLista;
    }
    
     public static ImageIcon Podesi_Sliku(String direktorijum, int sirina , int visina){
        ImageIcon ikonica = new ImageIcon(direktorijum); // load the image to a imageIcon
        Image image = ikonica.getImage(); // transform it
        Image newimg = image.getScaledInstance(sirina, visina, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ikonica = new ImageIcon(newimg);
        return ikonica;
    }
}
