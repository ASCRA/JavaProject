
package projektni.zadatak.Klase;
import java.io.*;

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

    
}
