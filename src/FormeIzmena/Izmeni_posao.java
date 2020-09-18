/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;
import OstaleKlase.Datoteke;
import OstaleKlase.Posao;
import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.table.*;

public class Izmeni_posao extends Forma_Posao {

    DefaultTableModel model;
    String nazivPosla;
    int indeksPosla;
    DefaultTableCellRenderer pozicioniranje = new DefaultTableCellRenderer();
    
    public Izmeni_posao() {
        initComponents();
        ucitaj_podatke();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tabela.getModel();
        
        for(int i = 0; i < poslovi.size(); i++)
        {
        long br_radnih_sati_minuti = Math.abs(Duration.between(poslovi.get(i).getVremeOdlaska(), poslovi.get(i).getVremeDolaska()).toMinutes());
        long br_radnih_sati = br_radnih_sati_minuti/60;
        long minuti = br_radnih_sati_minuti-br_radnih_sati*60;
        
        model.insertRow(model.getRowCount(), new Object [] {poslovi.get(i).getNaziv(), 
                                                                poslovi.get(i).getPlata(), 
                                                                poslovi.get(i).getVremeDolaska(), 
                                                                poslovi.get(i).getVremeOdlaska(), 
                                                                String.valueOf(br_radnih_sati) + "h " + String.valueOf(minuti) + "m"}); 
        }
        
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabela.rowAtPoint(evt.getPoint());
                String vreme_dolaska[] = new String[2];
                String vreme_odlaska[] = new String[2];
                vreme_dolaska = poslovi.get(row).getVremeDolaska().format(DateTimeFormatter.ofPattern("HH:mm")).split(":");
                vreme_odlaska = poslovi.get(row).getVremeOdlaska().format(DateTimeFormatter.ofPattern("HH:mm")).split(":");
                naziv_posla_dodavanje.setText(String.valueOf(poslovi.get(row).getNaziv()));
                plata_posla_dodavanje.setText(String.valueOf(poslovi.get(row).getPlata()));
                vreme_dolaska_sat.setValue(Integer.valueOf(vreme_dolaska[0]));
                vreme_dolaska_minut.setValue(Integer.valueOf(vreme_dolaska[1]));
                vreme_odlaska_sat.setValue(Integer.valueOf(vreme_odlaska[0]));
                vreme_odlaska_minut.setValue(Integer.valueOf(vreme_odlaska[1]));
                nazivPosla = String.valueOf(poslovi.get(row).getNaziv());
            }
        });
        
        pozicioniranje.setHorizontalAlignment(JLabel.CENTER);
        int broj_kolona = tabela.getColumnModel().getColumnCount();
        for(int i = 0; i < broj_kolona; i++)
        tabela.getColumnModel().getColumn(i).setCellRenderer(pozicioniranje);
        
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
        izmeni_posao_dugme = new javax.swing.JButton();
        obrisi_posao = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

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
        plata_posla_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plata_posla_dodavanjeKeyTyped(evt);
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

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Naziv", "Satnica", "Vreme dolaska", "Vreme odlaska", "Broj radnih sati"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(plata_posla_dodavanje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plata_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plata_posla_dodavanjeActionPerformed

    }//GEN-LAST:event_plata_posla_dodavanjeActionPerformed

    private void naziv_posla_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_naziv_posla_dodavanjeKeyTyped
        char t = evt.getKeyChar();
        if(!(Character.isAlphabetic(t)) && !(Character.isSpaceChar(t)))
        evt.consume();
    }//GEN-LAST:event_naziv_posla_dodavanjeKeyTyped

    private void izmeni_posao_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeni_posao_dugmeActionPerformed
        
        poslovi = Datoteke.ucitajPoslove();
        radnici = Datoteke.ucitajRadnike();
        
        if(naziv_posla_dodavanje.getText().isEmpty() || plata_posla_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {
            int brojOvakvihPoslova = 0;
            
            for(int i = 0; i < poslovi.size(); i++)
            {
                if(poslovi.get(i).getNaziv().equals(nazivPosla))
                    brojOvakvihPoslova++;
            }
            
            if(brojOvakvihPoslova <= 1)
            {
            double plataPosla = Double.parseDouble(plata_posla_dodavanje.getText().trim());
            vreme_dolaska = PodesiVreme(vreme_dolaska_sat, vreme_dolaska_minut);
            vreme_odlaska = PodesiVreme(vreme_odlaska_sat, vreme_odlaska_minut);
            indeksPosla = nadjiPosao(nazivPosla);
            
            nazivPosla = naziv_posla_dodavanje.getText().trim();
            poslovi.get(indeksPosla).setNaziv(nazivPosla);
            poslovi.get(indeksPosla).setPlata(plataPosla);
            poslovi.get(indeksPosla).setVremeDolaska(LocalTime.parse(vreme_dolaska));
            poslovi.get(indeksPosla).setVremeOdlaska(LocalTime.parse(vreme_odlaska));
            
            Datoteke.upisiPosao(poslovi);
            
            for(int i = 0; i < radnici.size(); i++)
            {
                if(radnici.get(i).getPosao().getNaziv().equals(naziv_posla_dodavanje.getText().trim()))
                {
                    radnici.get(i).setPosao(poslovi.get(indeksPosla));
                }
            }
            Datoteke.upisiRadnike(radnici);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Posao sa istim imenom ili ID brojem vec postoji!");
            }
        }
        
        model.setRowCount(0);
        for(int i = 0; i < poslovi.size(); i++)
        {
        long br_radnih_sati_minuti = Math.abs(Duration.between(poslovi.get(i).getVremeOdlaska(), poslovi.get(i).getVremeDolaska()).toMinutes());
        long br_radnih_sati = br_radnih_sati_minuti/60;
        long minuti = br_radnih_sati_minuti-br_radnih_sati*60;
        
        model.insertRow(model.getRowCount(), new Object [] {poslovi.get(i).getNaziv(), 
                                                                poslovi.get(i).getPlata(), 
                                                                poslovi.get(i).getVremeDolaska(), 
                                                                poslovi.get(i).getVremeOdlaska(), 
                                                                String.valueOf(br_radnih_sati) + "h " + String.valueOf(minuti) + "m"}); 
        }
    }//GEN-LAST:event_izmeni_posao_dugmeActionPerformed
   
    
    private void obrisi_posaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obrisi_posaoActionPerformed
        indeksPosla = nadjiPosao(nazivPosla);
        Posao nemaPosao = new Posao("Nema posao");
        radnici = Datoteke.ucitajRadnike();
        for(int i = 0; i < radnici.size(); i++)
        {
            if(radnici.get(i).getPosao().getNaziv().equals(nazivPosla))
                radnici.get(i).setPosao(nemaPosao);
        }
        poslovi.remove(indeksPosla);
        Datoteke.upisiPosao(poslovi);
        Datoteke.upisiRadnike(radnici);
        JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
    }//GEN-LAST:event_obrisi_posaoActionPerformed

    private void naziv_posla_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naziv_posla_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naziv_posla_dodavanjeActionPerformed

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
    private javax.swing.JButton izmeni_posao_dugme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField naziv_posla_dodavanje;
    private javax.swing.JButton obrisi_posao;
    private javax.swing.JTextField plata_posla_dodavanje;
    private javax.swing.JTable tabela;
    private javax.swing.JSpinner vreme_dolaska_minut;
    private javax.swing.JSpinner vreme_dolaska_sat;
    private javax.swing.JSpinner vreme_odlaska_minut;
    private javax.swing.JSpinner vreme_odlaska_sat;
    // End of variables declaration//GEN-END:variables
}
