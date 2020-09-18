/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;

import OstaleKlase.*;
import KlaseOsoba.Radnik;
import javax.swing.JOptionPane;

public final class Dodaj_radnika extends Forma_Radnik {

    public Dodaj_radnika() {
        initComponents();
        this.setLocationRelativeTo(null);
        ucitaj_podatke();
        izbor_Posla.setModel(popuni_listu_poslova());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ime_radnika_dodavanje = new javax.swing.JTextField();
        prezime_radnika_dodavanje = new javax.swing.JTextField();
        izbor_Posla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        jLabel4.setText("Posao:");

        ime_radnika_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        ime_radnika_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ime_radnika_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ime_radnika_dodavanjeActionPerformed(evt);
            }
        });
        ime_radnika_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ime_radnika_dodavanjeKeyTyped(evt);
            }
        });

        prezime_radnika_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        prezime_radnika_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        prezime_radnika_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prezime_radnika_dodavanjeActionPerformed(evt);
            }
        });
        prezime_radnika_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prezime_radnika_dodavanjeKeyTyped(evt);
            }
        });

        izbor_Posla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        izbor_Posla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbor_PoslaActionPerformed(evt);
            }
        });

        jButton1.setText("Dodaj");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prezime_radnika_dodavanje, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ime_radnika_dodavanje, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(izbor_Posla, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prezime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(izbor_Posla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prezime_radnika_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prezime_radnika_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prezime_radnika_dodavanjeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        radnici = Datoteke.ucitajRadnike();
        if(ime_radnika_dodavanje.getText().isEmpty() || prezime_radnika_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {     
            int idRadnika = radnici.size() + 1;
            int brojOvakvihRadnika = 0;
            
            for(int i = 0; i < radnici.size(); i++)
            {
                if(radnici.get(i).getId() == idRadnika)
                    brojOvakvihRadnika++;
            }
            
            if(brojOvakvihRadnika == 0)
            {
            int posao = izbor_Posla.getSelectedIndex();
            String imeRadnika = ime_radnika_dodavanje.getText().trim();
            String prezimeRadnika = prezime_radnika_dodavanje.getText().trim();
            Posao izabraniPosao = poslovi.get(posao);
            
            Radnik radnik = new Radnik(imeRadnika, prezimeRadnika, idRadnika, izabraniPosao);
            radnik.setStatus(true);
            
            radnici.add(radnik);
            Datoteke.upisiRadnike(radnici);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Radnik sa ovakvim ID brojem vec postoji!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ime_radnika_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ime_radnika_dodavanjeActionPerformed

    private void izbor_PoslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbor_PoslaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_izbor_PoslaActionPerformed

    private void ime_radnika_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeKeyTyped
        char t = evt.getKeyChar();
         if(!(Character.isAlphabetic(t)))
             evt.consume(); 
    }//GEN-LAST:event_ime_radnika_dodavanjeKeyTyped

    private void prezime_radnika_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prezime_radnika_dodavanjeKeyTyped
       char t = evt.getKeyChar();
         if(!(Character.isAlphabetic(t)))
             evt.consume(); 
    }//GEN-LAST:event_prezime_radnika_dodavanjeKeyTyped

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
            java.util.logging.Logger.getLogger(Dodaj_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodaj_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodaj_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodaj_radnika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodaj_radnika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ime_radnika_dodavanje;
    private javax.swing.JComboBox<String> izbor_Posla;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField prezime_radnika_dodavanje;
    // End of variables declaration//GEN-END:variables


}
