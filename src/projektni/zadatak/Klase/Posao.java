
package projektni.zadatak.Klase;
import java.io.*;

public class Posao implements Serializable{
    private double plata;
    private String naziv;

    public Posao(double plata, String naziv) {
        this.plata = plata;
        this.naziv = naziv;
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
    
    public boolean jednako(Posao posao)
    { 
        return (this.plata == posao.plata && this.naziv.equals(posao.naziv));
    }
    
}
