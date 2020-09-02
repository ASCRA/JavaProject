/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektni.zadatak.Forme;

import KlaseOsoba.Dolazak_Radnika;
import KlaseOsoba.Radnik;
import FormeIzvoda.Danasnji_Izvod;
import FormeIzvoda.Mesecni_Izvod;
import FormeIzvoda.Raspon_Izvod;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import projektni.zadatak.Klase.Datoteke;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.*;
import projektni.zadatak.Klase.*;
/**
 *
 * @author risti
 */
public class Radnici_Meni extends javax.swing.JFrame {

    DefaultTableModel model;
    ArrayList<Radnik> radnici;
    ArrayList<Dolazak_Radnika> sviDolasci;
    ArrayList<Radnik> sortirani_radnici;
    int brojPrisutnih = 0;

    public Radnici_Meni() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tabela.getModel();
        radnici = Datoteke.ucitajRadnike();
        sviDolasci = Datoteke.citaj_iz_velike();
        sortirani_radnici = nadjiPrisutne(sviDolasci, radnici);
        for(int i = 0; i < sortirani_radnici.size(); i++)
        model.insertRow(model.getRowCount(), new Object [] {sortirani_radnici.get(i).getId(), 
                                                                sortirani_radnici.get(i).getIme(), 
                                                                sortirani_radnici.get(i).getPrezime(), 
                                                                sortirani_radnici.get(i).getPosao().getNaziv()});
        
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabela.rowAtPoint(evt.getPoint());
                id_radnika_text.setText(String.valueOf(radnici.get(row).getId()));
            }
        });
        tabela.setDefaultRenderer(Object.class, new TableCellRenderer(){
        private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    c.setBackground(row < brojPrisutnih ? Color.GREEN : Color.WHITE);
                return c;
            }
        });
    }
    
    public ArrayList<Radnik> nadjiPrisutne(ArrayList<Dolazak_Radnika> sviDolasci, ArrayList<Radnik> radnici){
        ArrayList<Radnik> prisutni = new ArrayList<>();
        ArrayList<Radnik> sortirani = new ArrayList<>();
        
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(sviDolasci.get(i).getDatum_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().compareTo(LocalDate.now()) == 0)
            {
                prisutni.add(sviDolasci.get(i).getRadnik());
            }
        }
        
        for(int i = 0; i < radnici.size(); i++)
        {
            for(int j = 0; j < prisutni.size(); j++)
            {
                if(prisutni.get(j).getId() == radnici.get(i).getId())
                {
                    sortirani.add(radnici.get(i));
                    break;
                }
            }
        }
        brojPrisutnih = sortirani.size();
        for(int i = 0; i < radnici.size(); i++)
        {
            int brojac = 0;
            for(int j = 0; j < sortirani.size(); j++)
            {
                if(radnici.get(i).getId() != sortirani.get(j).getId())
                {
                    brojac++;
                }
            }
            if(brojac==sortirani.size())
            {
                sortirani.add(radnici.get(i));
            }
        }
        return sortirani;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        id_radnika_text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        izbor_meseca = new javax.swing.JComboBox<>();
        pocetni_datum = new org.jdesktop.swingx.JXDatePicker();
        krajnji_datum = new org.jdesktop.swingx.JXDatePicker();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 300));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime", "Prezime", "Posao"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jButton1.setText("Više informacija");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Mesečni izvod");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Izaberite datum/raspon");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        id_radnika_text.setBackground(new java.awt.Color(224, 224, 249));
        id_radnika_text.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        id_radnika_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_radnika_textActionPerformed(evt);
            }
        });

        jLabel1.setText("ID radnika:");

        izbor_meseca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pocetni_datum, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_radnika_text, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(izbor_meseca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(krajnji_datum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(id_radnika_text, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(izbor_meseca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pocetni_datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(krajnji_datum, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_radnika_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_radnika_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_radnika_textActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Date datumi[] = new Date[2];
        datumi[0] = pocetni_datum.getDate();
        datumi[1] = krajnji_datum.getDate();
        Raspon_Izvod.main(datumi);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String mesec[] = new String[1];
        mesec[0] = String.valueOf(izbor_meseca.getSelectedIndex()+1);
        
        Mesecni_Izvod.main(mesec);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id_radnika[] = new String[1];
        id_radnika[0] = id_radnika_text.getText().trim();
        Danasnji_Izvod.main(id_radnika);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Radnici_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radnici_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radnici_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radnici_Meni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radnici_Meni().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_radnika_text;
    private javax.swing.JComboBox<String> izbor_meseca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private org.jdesktop.swingx.JXDatePicker krajnji_datum;
    private org.jdesktop.swingx.JXDatePicker pocetni_datum;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
