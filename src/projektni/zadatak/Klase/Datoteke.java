
package projektni.zadatak.Klase;

import KlaseOsoba.Dolazak_Radnika;
import KlaseOsoba.Radnik;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class Datoteke {
    
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
            e.printStackTrace();
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
            e.printStackTrace();
        }
        return radnici;
    }
    
    
    public static void upisiRadnike(ArrayList<Radnik> radnici)
    {
        try
        {
            ObjectOutputStream izlazniFajl = new ObjectOutputStream(new FileOutputStream("Radnici.dat"));
            
            for(int i = 0; i < radnici.size(); i++)
            {
                izlazniFajl.writeObject(radnici.get(i));
            }
            
            izlazniFajl.close();
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
            
            
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static void upisi_u_veliku(ArrayList<Dolazak_Radnika> prisutniRadnici)
    {
        try
        {
            FileOutputStream fajl = new FileOutputStream("VelikaBaza.dat");
            ObjectOutputStream izlazniFajl = new ObjectOutputStream(fajl);
            
            for(int i = 0; i < prisutniRadnici.size(); i++)
            {
                izlazniFajl.writeObject(prisutniRadnici.get(i));
            }
            izlazniFajl.close();
            
           
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public static ArrayList<Dolazak_Radnika> citaj_iz_velike()
    {
        ArrayList<Dolazak_Radnika> prisutniRadnici = new ArrayList<>();
        try
        {
            FileInputStream fajl = new FileInputStream("VelikaBaza.dat");
            ObjectInputStream ulazniFajl = new ObjectInputStream(fajl);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     prisutniRadnici.add((Dolazak_Radnika) ulazniFajl.readObject());
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
