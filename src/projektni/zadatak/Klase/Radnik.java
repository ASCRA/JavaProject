
package projektni.zadatak.Klase;
import java.io.*;

public class Radnik implements Serializable{
    private String ime;
    private String prezime;
    private int id;
    private Posao posao;

    public Radnik(String ime, String prezime, int id, Posao posao) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
        this.posao = posao;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Posao getPosao() {
        return posao;
    }

    public void setPosao(Posao posao) {
        this.posao = posao;
    }
    
    
}
