
package KlaseOsoba;

public class Administrator extends Osoba{
    
    private String korisnickoIme;
    private String sifra;
    
    public Administrator(String korisnickoIme, String sifra, String ime, String prezime, int id) {
        super(ime, prezime, id);
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }
    
    public boolean proveriSifru(String kor_ime, String sifra)
    {
        return sifra.equals(this.sifra) && kor_ime.equals(this.korisnickoIme);
    }
}
