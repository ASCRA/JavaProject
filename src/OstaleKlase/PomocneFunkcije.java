
package OstaleKlase;

import java.awt.Image;
import javax.swing.ImageIcon;

public class PomocneFunkcije {
    
     public static ImageIcon Podesi_Sliku(String direktorijum, int sirina , int visina){
        ImageIcon ikonica = new ImageIcon(direktorijum); 
        Image image = ikonica.getImage(); 
        Image newimg = image.getScaledInstance(sirina, visina, java.awt.Image.SCALE_SMOOTH);
        ikonica = new ImageIcon(newimg);
        return ikonica;
    }
}
