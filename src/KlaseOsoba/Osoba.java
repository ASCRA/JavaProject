
package KlaseOsoba;

import java.io.Serializable;

public class Osoba implements Serializable{
    private String ime;
    private String prezime;
    private int id;

    public Osoba(String ime, String prezime, int id) {
        this.ime = ime;
        this.prezime = prezime;
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getId() {
        return id;
    }

    
    
}
