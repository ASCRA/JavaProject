/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;
import KlaseOsoba.Radnik;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import projektni.zadatak.Klase.*;

public class Izmeni_radnika extends Glavna_Forma_Izmena {

    ArrayList<Radnik> radnici;
    ArrayList<Posao> poslovi;
    DefaultTableModel model;
    
    public Izmeni_radnika() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tabela.getModel();
        radnici = Datoteke.ucitajRadnike();
        poslovi = Datoteke.ucitajPoslove();
        izbor_posla.setModel(super.popuni_listu_poslova());
        for(int i = 0; i < radnici.size(); i++)
        {
        model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                radnici.get(i).getIme(), 
                                                                radnici.get(i).getPrezime(), 
                                                                radnici.get(i).getPosao().getNaziv(),
                                                                (radnici.get(i).isStatus()?"Aktivan":"Neaktivan")});
        }
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ime_radnika_dodavanje = new javax.swing.JTextField();
        prezime_radnika_dodavanje = new javax.swing.JTextField();
        izbor_posla = new javax.swing.JComboBox<>();
        izmeni_radnika_dugme = new javax.swing.JButton();
        deaktiviraj_radnika = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        izbor_posla1 = new javax.swing.JComboBox<>();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Ime:");

        jLabel3.setText("Prezime:");

        jLabel4.setText("Posao:");

        ime_radnika_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        ime_radnika_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ime_radnika_dodavanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ime_radnika_dodavanjeActionPerformed(evt);
            }
        });

        prezime_radnika_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        prezime_radnika_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        izbor_posla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        izmeni_radnika_dugme.setText("Izmeni");
        izmeni_radnika_dugme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        izmeni_radnika_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeni_radnika_dugmeActionPerformed(evt);
            }
        });

        deaktiviraj_radnika.setText("Deaktiviraj");
        deaktiviraj_radnika.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        deaktiviraj_radnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deaktiviraj_radnikaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime", "Prezime", "Posao", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel5.setText("Status:");

        izbor_posla1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktivan", "Neaktivan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ime_radnika_dodavanje, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prezime_radnika_dodavanje, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(izbor_posla, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(izmeni_radnika_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deaktiviraj_radnika, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(izbor_posla1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prezime_radnika_dodavanje, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(izbor_posla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(izbor_posla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(izmeni_radnika_dugme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deaktiviraj_radnika, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void izmeni_radnika_dugmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izmeni_radnika_dugmeActionPerformed
        radnici = Datoteke.ucitajRadnike();
       if(ime_radnika_dodavanje.getText().isEmpty() || prezime_radnika_dodavanje.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Popunite sva polja!");
        }
        else
        {     
            int brojOvakvihRadnika = 0;
            
            String imeRadnika = ime_radnika_dodavanje.getText().trim();
            String prezimeRadnika = prezime_radnika_dodavanje.getText().trim();
            int posao = izbor_posla.getSelectedIndex();
            Posao izabraniPosao = poslovi.get(posao);
            
            Datoteke.upisiRadnike(radnici);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
        }               
        
    }//GEN-LAST:event_izmeni_radnika_dugmeActionPerformed

    private void ime_radnika_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ime_radnika_dodavanjeActionPerformed

    private void deaktiviraj_radnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deaktiviraj_radnikaActionPerformed
            radnici = Datoteke.ucitajRadnike();
            Datoteke.upisiRadnike(radnici);
    }//GEN-LAST:event_deaktiviraj_radnikaActionPerformed

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
    private javax.swing.JButton deaktiviraj_radnika;
    private javax.swing.JTextField ime_radnika_dodavanje;
    private javax.swing.JComboBox<String> izbor_posla;
    private javax.swing.JComboBox<String> izbor_posla1;
    private javax.swing.JButton izmeni_radnika_dugme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField prezime_radnika_dodavanje;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
