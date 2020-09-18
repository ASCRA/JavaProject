
package KlaseOsoba;
import java.io.*;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.ZoneId;
import java.util.Calendar;
import OstaleKlase.Posao;

public class Radnik extends Osoba implements Serializable{
    private Posao posao;
    private boolean status;

    public Radnik(String ime, String prezime, int id, Posao posao) {
        super(ime, prezime, id);
        this.posao = posao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Posao getPosao() {
        return posao;
    }

    public void setPosao(Posao posao) {
        this.posao = posao;
    }
}
