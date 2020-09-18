
package KlaseOsoba;

import javax.swing.JOptionPane;
import projektni.zadatak.Forme.Glavni_Meni;
import projektni.zadatak.Forme.Login;

public class Administrator extends Osoba{
    
    private String korisnickoIme;
    private String sifra;
    
    public Administrator(String korisnickoIme, String sifra, String ime, String prezime, int id) {
        super(ime, prezime, id);
        this.korisnickoIme = korisnickoIme;
        this.sifra = sifra;
    }
    
    public void proveriSifru(String kor_ime, String sifra)
    {
        if(sifra.equals(this.sifra) && kor_ime.equals(this.korisnickoIme))
        {
            ulogujSe();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Niste dobro uneli podatke");
        }
    }
    
    protected void ulogujSe() {
        new Glavni_Meni().setVisible(true);
        JOptionPane.showMessageDialog(null, "Dobro došli!");
        Login.getFrames()[0].dispose();
    }
}
