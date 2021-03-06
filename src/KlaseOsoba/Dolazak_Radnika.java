
package KlaseOsoba;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;

public class Dolazak_Radnika implements Serializable{
    private Radnik radnik;
    private LocalDate datum_dolaska;
    private LocalTime vreme_prijave;
    private LocalTime vreme_odjave;
    
    public Dolazak_Radnika(Radnik radnik, LocalDate datum_dolaska, LocalTime vreme_prijave) {
        this.radnik = radnik;
        this.datum_dolaska = datum_dolaska;
        this.vreme_prijave = vreme_prijave;
    }

    public Dolazak_Radnika(Radnik radnik, LocalDate datum_dolaska, LocalTime vreme_prijave, LocalTime vreme_odjave) {
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

    public LocalDate getDatum_dolaska() {
        return datum_dolaska;
    }

    public void setDatum_dolaska(LocalDate datum_dolaska) {
        this.datum_dolaska = datum_dolaska;
    }

    public LocalTime getVreme_prijave() {
        return vreme_prijave;
    }

    public void setVreme_prijave(LocalTime vreme_prijave) {
        this.vreme_prijave = vreme_prijave;
    }

    public LocalTime getVreme_odjave() {
        return vreme_odjave;
    }

    public void setVreme_odjave(LocalTime vreme_odjave) {
        this.vreme_odjave = vreme_odjave;
    }
    
    public long obracunajRadneSate(int zadatiMesec)
    {
        int mesec = this.datum_dolaska.getMonthValue();
        long broj_radnih_sati = 0;
        if(zadatiMesec == mesec)
        {
            if(this.vreme_prijave == null || this.vreme_odjave == null)
                broj_radnih_sati = 0;
            else
            {
            long brojMinuta = Duration.between(this.vreme_prijave, this.vreme_odjave).toMinutes();
            broj_radnih_sati = brojMinuta/60;
            }
        }
        return broj_radnih_sati;
    }
}
