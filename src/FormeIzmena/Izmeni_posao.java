/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;
import javax.swing.JOptionPane;
import projektni.zadatak.Klase.*;

public class Izmeni_posao extends Glavna_Forma_Izmena {
    String vreme_dolaska = "00:00";
    String vreme_odlaska = "00:00";
    public Izmeni_posao() {
        initComponents();
        ucitaj_podatke();
        this.setLocationRelativeTo(null);
        izbor_posla.setModel(super.popuni_listu_poslova());
        izbor_posla.setSelectedIndex(0);
    }
    
    @Override
    public void ucitaj_podatke() {
        super.ucitaj_podatke();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vreme_odlaska_minut = new javax.swing.JSpinner();
        vreme_dolaska_minut = new javax.swing.JSpinner();
        vreme_dolaska_sat = new javax.swing.JSpinner();
        vreme_odlaska_sat = new javax.swing.JSpinner();
        plata_posla_dodavanje = new javax.swing.JTextField();
        naziv_posla_dodavanje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        izbor_posla = new javax.swing.JComboBox<>();
        izmeni_posao_dugme = new javax.swing.JButton();
        obrisi_posao = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        id_posla_dodavanje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        vreme_odlaska_minut.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        vreme_dolaska_minut.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));

        vreme_dolaska_sat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        vreme_odlaska_sat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 24, 1));

        plata_posla_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        plata_posla_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        plata_posla_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plata_posla_dodavanjeActionPerformed(evt);
            }
        });

        naziv_posla_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        naziv_posla_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        naziv_posla_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naziv_posla_dodavanjeActionPerformed(evt);
            }
        });
        naziv_posla_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                naziv_posla_dodavanjeKeyTyped(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Naziv:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Plata:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Vreme dolaska:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vreme odlaska:");

        jLabel6.setText("Posao:");

        izbor_posla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        izbor_posla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izbor_poslaActionPerformed(evt);
            }
        });

        izmeni_posao_dugme.setText("Izmeni");
        izmeni_posao_dugme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        izmeni_posao_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeni_posao_dugmeActionPerformed(evt);
            }
        });

        obrisi_posao.setText("Obriši");
        obrisi_posao.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        obrisi_posao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obrisi_posaoActionPerformed(evt);
            }
        });

        id_posla_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        id_posla_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        id_posla_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_posla_dodavanjeActionPerformed(evt);
            }
        });
        id_posla_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_posla_dodavanjeKeyTyped(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(izmeni_posao_dugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vreme_dolaska_sat)
                            .addComponent(vreme_odlaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vreme_odlaska_minut)
                            .addComponent(vreme_dolaska_minut)
                            .addComponent(obrisi_posao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(naziv_posla_dodavanje)
                    .addComponent(plata_posla_dodavanje)
                    .addComponent(izbor_posla, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_posla_dodavanje, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(izbor_posla, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_posla_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naziv_posla_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plata_posla_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vreme_dolaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vreme_dolaska_minut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vreme_odlaska_sat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vreme_odlaska_minut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(izmeni_posao_dugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(obrisi_posao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plata_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plata_posla_dodavanjeActionPerformed

    }//GEN-LAST:event_plata_posla_dodavanjeActionPerformed

    private void naziv_posla_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naziv_posla_dodavanjeKeyTyped
        char t = evt.getKeyChar();
        if(!(Character.isAlphabetic(t)))
        evt.consume();
    }//GEN-LAST:event_naziv_posla_dodavanjeKeyTyped

    private void izbor_poslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izbor_poslaActionPerformed
        poslovi = Datoteke.ucitajPoslove();
        int izabraniPosao = izbor_posla.getSelectedIndex();
            id_posla_dodavanje.setText(String.valueOf(poslovi.get(izabraniPosao).getId()));
            naziv_posla_dodavanje.setText(poslovi.get(izabraniPosao).getNaziv());
            plata_posla_dodavanje.setText(String.valueOf(poslovi.get(izabraniPosao).getPlata()));
            
            String[] vreme_dolaska = poslovi.get(izabraniPosao).getVremeDolaska().split(":");
            String[] vreme_odlaska = poslovi.get(izabraniPosao).getVremeOdlaska().split(":");
            
            vreme_dolaska_sat.setValue(Integer.parseInt(vreme_dolaska[0]));
            vreme_dolaska_minut.setValue(Integer.parseInt(vreme_dolaska[1]));
            
            vreme_odlaska_sat.setValue(Integer.parseInt(vreme_odlaska[0]));
            vreme_odlaska_minut.setValue(Integer.parseInt(vreme_odlaska[1]));
    }//GEN-LAST:event_izbor_poslaActionPerformed

    private void izmeni_posao_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeni_posao_dugmeActionPerformed
        
        poslovi = Datoteke.ucitajPoslove();
        radnici = Datoteke.ucitajRadnike();
        
        if(naziv_posla_dodavanje.getText().isEmpty() || plata_posla_dodavanje.getText().isEmpty() || id_posla_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {
            int idPosla = Integer.parseInt(id_posla_dodavanje.getText().trim());
            String nazivPosla = naziv_posla_dodavanje.getText().trim();
            
            int brojOvakvihPoslova = 0;
            
            for(int i = 0; i < poslovi.size(); i++)
            {
                if(poslovi.get(i).getNaziv().equals(nazivPosla) || (poslovi.get(i).getId() == idPosla))
                    brojOvakvihPoslova++;
            }
            
            if(brojOvakvihPoslova <= 1)
            {
            double plataPosla = Double.parseDouble(plata_posla_dodavanje.getText().trim());
            PodesiVremeDolaska();
            PodesiVremeOdlaska();
            
            
            poslovi.get(izbor_posla.getSelectedIndex()).setId(idPosla);
            poslovi.get(izbor_posla.getSelectedIndex()).setNaziv(nazivPosla);
            poslovi.get(izbor_posla.getSelectedIndex()).setPlata(plataPosla);
            poslovi.get(izbor_posla.getSelectedIndex()).setVremeDolaska(vreme_dolaska);
            poslovi.get(izbor_posla.getSelectedIndex()).setVremeOdlaska(vreme_odlaska);
            
            Datoteke.upisiPosao(poslovi);
            
            for(int i = 0; i < radnici.size(); i++)
            {
                if(radnici.get(i).getPosao().getId() == idPosla)
                {
                    radnici.get(i).setPosao(poslovi.get(izbor_posla.getSelectedIndex()));
                }
            }
            izbor_posla.setModel(super.popuni_listu_poslova());
            izbor_posla.setSelectedIndex(0);
            Datoteke.upisiRadnika(radnici);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Posao sa istim imenom ili ID brojem vec postoji!");
            }
        }

    }//GEN-LAST:event_izmeni_posao_dugmeActionPerformed
    public void PodesiVremeDolaska(){
            String vremeDolaskaMinut = "00";
            String vremeDolaskaSat = "00";
        if(Integer.parseInt(String.valueOf(vreme_dolaska_sat.getValue()))>0 && Integer.parseInt(String.valueOf(vreme_dolaska_sat.getValue()))<12)
            {
                vremeDolaskaSat = String.valueOf("0"+vreme_dolaska_sat.getValue());
            }
            else
            {
                vremeDolaskaSat = String.valueOf(vreme_dolaska_sat.getValue());
            }
            
            if(Integer.parseInt(String.valueOf(vreme_dolaska_minut.getValue()))>=0 && Integer.parseInt(String.valueOf(vreme_dolaska_minut.getValue()))<10)
            {
                vremeDolaskaMinut = String.valueOf(vreme_dolaska_minut.getValue()+"0");
            }
            else
            {
                vremeDolaskaMinut = String.valueOf(vreme_dolaska_minut.getValue());
            }
            vreme_dolaska = vremeDolaskaSat+":"+vremeDolaskaMinut;
    }
    
    public void PodesiVremeOdlaska(){
            String vremeOdlaskaMinut = "00";
            String vremeOdlaskaSat = "00";
        if(Integer.parseInt(String.valueOf(vreme_odlaska_sat.getValue()))>0 && Integer.parseInt(String.valueOf(vreme_odlaska_sat.getValue()))<12)
            {
                vremeOdlaskaSat = String.valueOf("0"+vreme_odlaska_sat.getValue());
            }
            else
            {
                vremeOdlaskaSat = String.valueOf(vreme_odlaska_sat.getValue());
            }
            
            if(Integer.parseInt(String.valueOf(vreme_odlaska_minut.getValue()))>=0 && Integer.parseInt(String.valueOf(vreme_odlaska_minut.getValue()))<10)
            {
                vremeOdlaskaMinut = String.valueOf(vreme_odlaska_minut.getValue()+"0");
            }
            else
            {
                vremeOdlaskaMinut = String.valueOf(vreme_odlaska_minut.getValue());
            }
            vreme_odlaska = vremeOdlaskaSat+":"+vremeOdlaskaMinut;
    }
    private void obrisi_posaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_posaoActionPerformed
        poslovi.remove(izbor_posla.getSelectedIndex());
        Datoteke.upisiPosao(poslovi);
    }//GEN-LAST:event_obrisi_posaoActionPerformed

    private void naziv_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naziv_posla_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naziv_posla_dodavanjeActionPerformed

    private void id_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_posla_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_posla_dodavanjeActionPerformed

    private void id_posla_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_posla_dodavanjeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_id_posla_dodavanjeKeyTyped

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
            java.util.logging.Logger.getLogger(Izmeni_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izmeni_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izmeni_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izmeni_posao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Izmeni_posao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_posla_dodavanje;
    private javax.swing.JComboBox<String> izbor_posla;
    private javax.swing.JButton izmeni_posao_dugme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField naziv_posla_dodavanje;
    private javax.swing.JButton obrisi_posao;
    private javax.swing.JTextField plata_posla_dodavanje;
    private javax.swing.JSpinner vreme_dolaska_minut;
    private javax.swing.JSpinner vreme_dolaska_sat;
    private javax.swing.JSpinner vreme_odlaska_minut;
    private javax.swing.JSpinner vreme_odlaska_sat;
    // End of variables declaration//GEN-END:variables
}
