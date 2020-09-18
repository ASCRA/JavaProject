
package FormeIzmena;

import OstaleKlase.Posao;
import java.time.LocalTime;
import OstaleKlase.Datoteke;
import javax.swing.JOptionPane;

public class Dodaj_posao extends Forma_Posao {
            
    public Dodaj_posao() {
        initComponents();
        this.setLocationRelativeTo(null);
        ucitaj_podatke();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        naziv_posla_dodavanje = new javax.swing.JTextField();
        dodaj_dugme_posao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        plata_posla_dodavanje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vreme_dolaska_sat = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        vreme_dolaska_minut = new javax.swing.JSpinner();
        vreme_odlaska_sat = new javax.swing.JSpinner();
        vreme_odlaska_minut = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Naziv:");

        naziv_posla_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        naziv_posla_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        naziv_posla_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                naziv_posla_dodavanjeKeyTyped(evt);
            }
        });

        dodaj_dugme_posao.setText("Dodaj");
        dodaj_dugme_posao.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        dodaj_dugme_posao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodaj_dugme_posaoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Plata po satu:");

        plata_posla_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        plata_posla_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        plata_posla_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plata_posla_dodavanjeActionPerformed(evt);
            }
        });
        plata_posla_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plata_posla_dodavanjeKeyTyped(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Vreme dolaska:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vreme odlaska:");

        vreme_dolaska_sat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        jLabel5.setText(":");

        vreme_dolaska_minut.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        vreme_odlaska_sat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        vreme_odlaska_minut.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        jLabel6.setText(":");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dodaj_dugme_posao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(naziv_posla_dodavanje)
                    .addComponent(plata_posla_dodavanje)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vreme_dolaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vreme_odlaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vreme_odlaska_minut)
                            .addComponent(vreme_dolaska_minut, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naziv_posla_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plata_posla_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vreme_dolaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(vreme_dolaska_minut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(vreme_odlaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vreme_odlaska_minut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dodaj_dugme_posao, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plata_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plata_posla_dodavanjeActionPerformed

    }//GEN-LAST:event_plata_posla_dodavanjeActionPerformed

    private void dodaj_dugme_posaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dodaj_dugme_posaoActionPerformed
        poslovi = Datoteke.ucitajPoslove();
        if(naziv_posla_dodavanje.getText().isEmpty() || plata_posla_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {     
            String nazivPosla = naziv_posla_dodavanje.getText().trim();
            
            double plataPosla = Double.parseDouble(plata_posla_dodavanje.getText().trim());
            vreme_dolaska = PodesiVreme(vreme_dolaska_sat, vreme_dolaska_minut);
            vreme_odlaska = PodesiVreme(vreme_odlaska_sat, vreme_odlaska_minut);
            
            boolean mozemoDodati = true;
            
            for(int i = 0; i < poslovi.size(); i++)
            {
                if(poslovi.get(i).getNaziv().equals(nazivPosla))
                {
                    JOptionPane.showMessageDialog(null, "Posao sa ovim nazivom već postoji!");
                    mozemoDodati = false;
                    break;
                }
            }
            
            if(mozemoDodati == true)
            {
                Posao posao = new Posao(plataPosla, nazivPosla, LocalTime.parse(vreme_dolaska), LocalTime.parse(vreme_odlaska));
                poslovi.add(posao);
                Datoteke.upisiPosao(poslovi);
                JOptionPane.showMessageDialog(null, "Uspešno sačuvano!");
            }
        }
    }//GEN-LAST:event_dodaj_dugme_posaoActionPerformed

    private void naziv_posla_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naziv_posla_dodavanjeKeyTyped
        char t = evt.getKeyChar();
         if(!(Character.isAlphabetic(t)||Character.isSpaceChar(t)))
             evt.consume(); 
    }//GEN-LAST:event_naziv_posla_dodavanjeKeyTyped

    private void plata_posla_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plata_posla_dodavanjeKeyTyped
        char t = evt.getKeyChar();
          if(!(Character.isDigit(t)))
              evt.consume();
    }//GEN-LAST:event_plata_posla_dodavanjeKeyTyped

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
            java.util.logging.Logger.getLogger(Dodaj_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dodaj_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dodaj_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dodaj_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dodaj_posao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dodaj_dugme_posao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField naziv_posla_dodavanje;
    private javax.swing.JTextField plata_posla_dodavanje;
    private javax.swing.JSpinner vreme_dolaska_minut;
    private javax.swing.JSpinner vreme_dolaska_sat;
    private javax.swing.JSpinner vreme_odlaska_minut;
    private javax.swing.JSpinner vreme_odlaska_sat;
    // End of variables declaration//GEN-END:variables

    
}
