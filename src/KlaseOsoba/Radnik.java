
package KlaseOsoba;
import java.io.*;
import projektni.zadatak.Klase.Posao;

public class Radnik extends Osoba implements Serializable{
    private Posao posao;

    public Radnik(String ime, String prezime, int id, Posao posao) {
        super(ime, prezime, id);
        this.posao = posao;
    }

    public Posao getPosao() {
        return posao;
    }

    public void setPosao(Posao posao) {
        this.posao = posao;
    }
}
