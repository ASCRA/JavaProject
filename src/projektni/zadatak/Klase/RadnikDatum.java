
package projektni.zadatak.Klase;

import java.io.Serializable;
import java.util.Date;

public class RadnikDatum implements Serializable{
    private Radnik radnik;
    private String datum_dolaska;
    private String vreme_prijave;
    private String vreme_odjave;
    
    public RadnikDatum(Radnik radnik, String datum_dolaska, String vreme_prijave) {
        this.radnik = radnik;
        this.datum_dolaska = datum_dolaska;
        this.vreme_prijave = vreme_prijave;
    }

    public RadnikDatum(Radnik radnik, String datum_dolaska, String vreme_prijave, String vreme_odjave) {
        this.radnik = radnik;
        this.datum_dolaska = datum_dolaska;
        this.vreme_prijave = vreme_prijave;
        this.vreme_odjave = vreme_odjave;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public String getDatum_dolaska() {
        return datum_dolaska;
    }

    public void setDatum_dolaska(String datum_dolaska) {
        this.datum_dolaska = datum_dolaska;
    }

    public String getVreme_prijave() {
        return vreme_prijave;
    }

    public void setVreme_prijave(String vreme_prijave) {
        this.vreme_prijave = vreme_prijave;
    }

    public String getVreme_odjave() {
        return vreme_odjave;
    }

    public void setVreme_odjave(String vreme_odjave) {
        this.vreme_odjave = vreme_odjave;
    }  
    
}
