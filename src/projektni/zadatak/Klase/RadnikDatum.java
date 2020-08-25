
package projektni.zadatak.Klase;

import java.io.Serializable;
import java.util.Date;

public class RadnikDatum implements Serializable{
    private Radnik radnik;
    private String datum;

    public RadnikDatum(Radnik radnik, String datum) {
        this.radnik = radnik;
        this.datum = datum;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    
    
}
