
package projektni.zadatak.Klase;
import java.io.*;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;

public class Posao implements Serializable{
    
    private double plata;
    private String naziv;
    private LocalTime vremeDolaska;
    private LocalTime vremeOdlaska;

    public Posao(double plata, String naziv, LocalTime vremeDolaska, LocalTime VremeOdlaska) {
        this.plata = plata;
        this.naziv = naziv;
        this.vremeDolaska = vremeDolaska;
        this.vremeOdlaska = VremeOdlaska;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public LocalTime getVremeDolaska() {
        return vremeDolaska;
    }

    public void setVremeDolaska(LocalTime vremeDolaska) {
        this.vremeDolaska = vremeDolaska;
    }

    public LocalTime getVremeOdlaska() {
        return vremeOdlaska;
    }

    public void setVremeOdlaska(LocalTime vremeOdlaska) {
        this.vremeOdlaska = vremeOdlaska;
    }
    
    public long obracunajDnevnuKvotu(){
        return Duration.between(this.vremeDolaska, this.vremeOdlaska).toHours();
    }
    
    public long obracunajMesecnuKvotu(int mesec)
    {
        Calendar cal = Calendar.getInstance();
        int godina = LocalDate.now().getYear();
        int datum = 1;
        
        cal.set(godina, mesec, datum);
        long brojRadnih = 0;
        while(datum < cal.getActualMaximum(Calendar.DAY_OF_MONTH))
        {
            if(!((cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0)
                    ||(cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfWeek().compareTo(DayOfWeek.SATURDAY) == 0)))
            brojRadnih++;
                cal.set(godina, mesec, ++datum);
        }
        long brojSati = Duration.between(this.vremeDolaska, this.vremeOdlaska).toHours();
        
        return brojRadnih*brojSati;
    }
}
