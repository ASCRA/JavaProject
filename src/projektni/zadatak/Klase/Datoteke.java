
package projektni.zadatak.Klase;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Datoteke {
    
    public static ArrayList<Posao> ucitajPoslove(){
        ArrayList<Posao> poslovi = new ArrayList<>();
        try
        {
            FileInputStream fajl = new FileInputStream("Poslovi.dat");
            ObjectInputStream ulazniFajl = new ObjectInputStream(fajl);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     poslovi.add((Posao) ulazniFajl.readObject());
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
                catch (Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            ulazniFajl.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        return poslovi;
    }
    
    public static ArrayList<Radnik> ucitajRadnike(){
        ArrayList<Radnik> radnici = new ArrayList<>();
        try
        {
            FileInputStream fajl = new FileInputStream("Radnici.dat");
            ObjectInputStream ulazniFajl = new ObjectInputStream(fajl);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     radnici.add((Radnik) ulazniFajl.readObject());
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
                catch (Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            ulazniFajl.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return radnici;
    }
    
    
    public static void upisiRadnika(ArrayList<Radnik> radnici)
    {
        try
        {
            FileOutputStream fajl = new FileOutputStream("Radnici.dat");
            ObjectOutputStream izlazniFajl = new ObjectOutputStream(fajl);
            
            for(int i = 0; i < radnici.size(); i++)
            {
                izlazniFajl.writeObject(radnici.get(i));
            }
            
            izlazniFajl.close();
            
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void upisiPosao(ArrayList<Posao> poslovi)
    {
        try
        {
            FileOutputStream fajl = new FileOutputStream("Poslovi.dat");
            ObjectOutputStream izlazniFajl = new ObjectOutputStream(fajl);
            
            for(int i = 0; i < poslovi.size(); i++)
            {
                izlazniFajl.writeObject(poslovi.get(i));
            }
            
            izlazniFajl.close();
            
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void upisi_u_dnevnu(ArrayList<RadnikDatum> prisutniRadnici)
    {
        try
        {
            FileOutputStream fajl = new FileOutputStream("DnevnaBaza.dat");
            ObjectOutputStream izlazniFajl = new ObjectOutputStream(fajl);
            
            for(int i = 0; i < prisutniRadnici.size(); i++)
            {
                izlazniFajl.writeObject(prisutniRadnici.get(i));
            }
            izlazniFajl.close();
            
            JOptionPane.showMessageDialog(null, "Dobro dosli!");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static ArrayList<RadnikDatum> citaj_iz_dnevne()
    {
        ArrayList<RadnikDatum> prisutniRadnici = new ArrayList<>();
        try
        {
            FileInputStream fajl = new FileInputStream("DnevnaBaza.dat");
            ObjectInputStream ulazniFajl = new ObjectInputStream(fajl);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     prisutniRadnici.add((RadnikDatum) ulazniFajl.readObject());
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
                catch (Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            ulazniFajl.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return prisutniRadnici;
    }
}
