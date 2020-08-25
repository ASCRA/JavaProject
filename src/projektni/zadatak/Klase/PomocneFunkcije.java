
package projektni.zadatak.Klase;

import java.util.ArrayList;

public class PomocneFunkcije {
    public static String[] popuniListuPoslova(ArrayList<Posao> poslovi)
    {
        String pomocnaLista[] = new String[poslovi.size()];
        for(int i = 0; i < poslovi.size(); i++)
        pomocnaLista[i] = poslovi.get(i).getNaziv();
        
        return pomocnaLista;
    }
}
