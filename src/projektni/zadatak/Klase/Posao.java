
package projektni.zadatak.Klase;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Posao implements Serializable{
    
    private int id;
    private double plata;
    private String naziv;
    private String vremeDolaska;
    private String VremeOdlaska;

    public Posao(int id, double plata, String naziv, String vremeDolaska, String VremeOdlaska) {
        this.id = id;
        this.plata = plata;
        this.naziv = naziv;
        this.vremeDolaska = vremeDolaska;
        this.VremeOdlaska = VremeOdlaska;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getVremeDolaska() {
        return vremeDolaska;
    }

    public void setVremeDolaska(String vremeDolaska) {
        this.vremeDolaska = vremeDolaska;
    }

    public String getVremeOdlaska() {
        return VremeOdlaska;
    }

    public void setVremeOdlaska(String VremeOdlaska) {
        this.VremeOdlaska = VremeOdlaska;
    }
    
    public long obracunajMesecnuKvotu(int mesec)
    {
        Calendar cal = Calendar.getInstance();
        int godina = 2020;
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
        long brojSati = Duration.between(LocalTime.parse(this.vremeDolaska), LocalTime.parse(this.VremeOdlaska)).toHours();
        
        return brojRadnih*brojSati;
    }
    public static ArrayList<Month> values()
    {
        ArrayList<Month> daniMeseca = new ArrayList<>();
           for (Month c : Month.values())
               daniMeseca.add(c);
           
        return daniMeseca;   
    }
}
