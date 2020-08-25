/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektni.zadatak.Forme;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import java.util.*;
import projektni.zadatak.Klase.*;

public class Izmeni_radnika extends javax.swing.JFrame {

    ArrayList<Radnik> radnici;
    ArrayList<Posao> poslovi;
    
    public Izmeni_radnika() {
        initComponents();
        radnici = new ArrayList<Radnik>();
        poslovi = new ArrayList<Posao>();
        popuniListu();
        
    }
        
    public void popuniListu()
    {
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
                    String pomocnaLista[] = new String[poslovi.size()];
                    for(int i = 0; i < poslovi.size(); i++)
                    pomocnaLista[i] = poslovi.get(i).getNaziv();
                    izbor_posla.setModel(new javax.swing.DefaultComboBoxModel<>(pomocnaLista));
                  
                    
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
        
        try
        {
            FileInputStream fajl_2 = new FileInputStream("Radnici.dat");
            ObjectInputStream ulazniFajl_2 = new ObjectInputStream(fajl_2);
            
            boolean endOfFile = false;
            
            while (!endOfFile)
            {
                try
                {    
                     radnici.add((Radnik) ulazniFajl_2.readObject());
                }
                catch (EOFException e)
                {
                    String pomocnaLista[] = new String[radnici.size()];
                    for(int i = 0; i < radnici.size(); i++)
                    pomocnaLista[i] = radnici.get(i).getIme();
                    izbor_radnika.setModel(new javax.swing.DefaultComboBoxModel<>(pomocnaLista));
                    
                    endOfFile = true;
                }
                catch (Exception f)
                {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            ulazniFajl_2.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        izbor_radnika.setSelectedIndex(0);
    }
    
    public Integer nadjiPosao(String nazivPosla){
        int indexPosla = 0;
        for(int i = 0; i < poslovi.size(); i++)
        {
            if(poslovi.get(i).getNaziv().equals(nazivPosla))
                indexPosla = i;
        }
        return indexPosla;
    }
    
    public void upisiRadnika()
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
            this.dispose();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        izbor_radnika = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ime_radnika_dodavanje = new javax.swing.JTextField();
        prezime_radnika_dodavanje = new javax.swing.JTextField();
        izbor_posla = new javax.swing.JComboBox<>();
        ID_radnika_dodavanje = new javax.swing.JTextField();
        izmeni_radnika_dugme = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Izaberite radnika:");

        izbor_radnika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        izbor_radnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbor_radnikaActionPerformed(evt);
            }
        });

        jLabel2.setText("Ime:");

        jLabel3.setText("Prezime:");

        jLabel4.setText("Posao:");

        jLabel5.setText("ID:");

        ime_radnika_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ime_radnika_dodavanjeActionPerformed(evt);
            }
        });

        izbor_posla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        izmeni_radnika_dugme.setText("Izmeni");
        izmeni_radnika_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeni_radnika_dugmeActionPerformed(evt);
            }
        });

        jButton2.setText("Obriši");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(izbor_radnika, 0, 191, Short.MAX_VALUE)
                        .addComponent(ime_radnika_dodavanje)
                        .addComponent(prezime_radnika_dodavanje)
                        .addComponent(izbor_posla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ID_radnika_dodavanje))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(izmeni_radnika_dugme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(izbor_radnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(prezime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(izbor_posla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ID_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(izmeni_radnika_dugme)
                    .addComponent(jButton2))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izbor_radnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbor_radnikaActionPerformed
            int izabraniRadnik = izbor_radnika.getSelectedIndex();
            ime_radnika_dodavanje.setText(radnici.get(izabraniRadnik).getIme());
            prezime_radnika_dodavanje.setText(radnici.get(izabraniRadnik).getPrezime());
            ID_radnika_dodavanje.setText(radnici.get(izabraniRadnik).getId()+"");
            izbor_posla.setSelectedIndex(nadjiPosao(radnici.get(izabraniRadnik).getPosao().getNaziv()));
    }//GEN-LAST:event_izbor_radnikaActionPerformed

    private void izmeni_radnika_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeni_radnika_dugmeActionPerformed
        
       if(ime_radnika_dodavanje.getText().isEmpty() || prezime_radnika_dodavanje.getText().isEmpty() || ID_radnika_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {     
            String imeRadnika = ime_radnika_dodavanje.getText().trim();
            String prezimeRadnika = prezime_radnika_dodavanje.getText().trim();
            int idRadnika = Integer.parseInt(ID_radnika_dodavanje.getText().trim());
            int posao = izbor_posla.getSelectedIndex();
            Posao izabraniPosao = poslovi.get(posao);
            
            radnici.get(izbor_radnika.getSelectedIndex()).setIme(imeRadnika);
            radnici.get(izbor_radnika.getSelectedIndex()).setPrezime(prezimeRadnika);
            radnici.get(izbor_radnika.getSelectedIndex()).setId(idRadnika);
            radnici.get(izbor_radnika.getSelectedIndex()).setPosao(izabraniPosao);
            
            upisiRadnika();
        }               
        
    }//GEN-LAST:event_izmeni_radnika_dugmeActionPerformed

    private void ime_radnika_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ime_radnika_dodavanjeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            radnici.remove(izbor_radnika.getSelectedIndex());
            upisiRadnika();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Izmeni_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izmeni_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izmeni_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izmeni_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Izmeni_radnika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_radnika_dodavanje;
    private javax.swing.JTextField ime_radnika_dodavanje;
    private javax.swing.JComboBox<String> izbor_posla;
    private javax.swing.JComboBox<String> izbor_radnika;
    private javax.swing.JButton izmeni_radnika_dugme;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField prezime_radnika_dodavanje;
    // End of variables declaration//GEN-END:variables
}
