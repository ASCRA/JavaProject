package GlavneForme;

import KlaseOsoba.Administrator;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    
    public static void main(String[] args) {
        Administrator admin = null;
        try
        {
            FileInputStream fajl = new FileInputStream("Admin.dat");
            ObjectInputStream ulazniFajl = new ObjectInputStream(fajl);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     admin = (Administrator) ulazniFajl.readObject();
                }
                catch (EOFException e)
                {
                    endOfFile = true;
                }
                catch (Exception f)
                {
                    System.out.println(f.getMessage());
                }
            }
            
            ulazniFajl.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
      if(admin != null)
          new Login().setVisible(true);
      else
          new PodesavanjeAdmina().setVisible(true);
    }
    
}
