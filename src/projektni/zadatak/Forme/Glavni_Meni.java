/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektni.zadatak.Forme;

import projektni.zadatak.Klase.Datoteke;
import java.text.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.*;
import javax.swing.JOptionPane;
import projektni.zadatak.Klase.*;

public class Glavni_Meni extends javax.swing.JFrame {

        ArrayList<Radnik> radnici;
        ArrayList<RadnikDatum> prisutniRadnici;
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date datum = new Date();
        Calendar cal = Calendar.getInstance();
        
    public Glavni_Meni() {
        initComponents();

    }

    public Radnik nadjiRadnika(int id){
        boolean postojiRadnik = false;
        int trazeniID = 0;
        Radnik radnik = null;
        for(int i = 0; i < radnici.size(); i++)
        {
            if(radnici.get(i).getId() == id)
            {
                postojiRadnik = true;
                trazeniID = i;
                break;
            }
            
        }
        if(postojiRadnik)
        {
            radnik = radnici.get(trazeniID);
        }
        return radnik;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kod = new javax.swing.JTextField();
        ulaznoDugme = new javax.swing.JButton();
        izlaznoDugme = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Dodaj = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Izmeni = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        izvod = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        jButton2.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kod.setToolTipText("");

        ulaznoDugme.setText("Prijava");
        ulaznoDugme.setToolTipText("");
        ulaznoDugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulaznoDugmeActionPerformed(evt);
            }
        });

        izlaznoDugme.setText("Odjava");

        jMenu1.setText("Dodaj");

        Dodaj.setText("Dodaj radnika");
        Dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DodajActionPerformed(evt);
            }
        });
        jMenu1.add(Dodaj);

        jMenuItem1.setText("Dodaj posao");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Izmeni");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        Izmeni.setText("Izmeni radnika");
        Izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzmeniActionPerformed(evt);
            }
        });
        jMenu2.add(Izmeni);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Radnici");

        izvod.setText("Izvod");
        izvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izvodActionPerformed(evt);
            }
        });
        jMenu3.add(izvod);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ulaznoDugme, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(izlaznoDugme, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kod))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(kod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ulaznoDugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(izlaznoDugme, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ulaznoDugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulaznoDugmeActionPerformed
        radnici = Datoteke.ucitajRadnike();
        prisutniRadnici = Datoteke.citaj_iz_dnevne();
        
        int id = Integer.parseInt(kod.getText().trim());
        Radnik uneseniRadnik = nadjiRadnika(id);
        
        if(uneseniRadnik==null)
        {
            JOptionPane.showMessageDialog(null, "Uneseni radnik ne postoji!");
        }
        
        else
        {
            boolean vecUnesen = false;
            for(int i = 0; i < prisutniRadnici.size(); i++)
            {
                if(uneseniRadnik.getId() == prisutniRadnici.get(i).getRadnik().getId())
                {
                    vecUnesen = true;
                    break;
                }
            }
            
            if(vecUnesen == false)
            {
            RadnikDatum prisutniRadnik = new RadnikDatum(uneseniRadnik, dateFormat.format(datum));
            prisutniRadnici.add(prisutniRadnik);
            Datoteke.upisi_u_dnevnu(prisutniRadnici);
            JOptionPane.showMessageDialog(null, "Uspesno ste prijavili radnika!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Radnik je trenutno prisutan, mozete ga samo odjaviti");
            }
        }
        
    }//GEN-LAST:event_ulaznoDugmeActionPerformed

    private void izvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izvodActionPerformed
       new Radnici_Meni().setVisible(true);
    }//GEN-LAST:event_izvodActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void DodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DodajActionPerformed
        new Dodaj_radnika().setVisible(true);
    }//GEN-LAST:event_DodajActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       new Dodaj_posao().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void IzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzmeniActionPerformed
        new Izmeni_radnika().setVisible(true);
    }//GEN-LAST:event_IzmeniActionPerformed

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
            java.util.logging.Logger.getLogger(Glavni_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Glavni_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Glavni_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Glavni_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Glavni_Meni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Dodaj;
    private javax.swing.JMenuItem Izmeni;
    private javax.swing.JButton izlaznoDugme;
    private javax.swing.JMenuItem izvod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField kod;
    private javax.swing.JButton ulaznoDugme;
    // End of variables declaration//GEN-END:variables
}
