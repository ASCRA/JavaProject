/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzvoda;

import java.util.ArrayList;
import javax.swing.table.*;
import projektni.zadatak.Klase.Datoteke;
import KlaseOsoba.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.SwingConstants;

public class Mesecni_Izvod extends javax.swing.JFrame {

    DefaultTableModel model;
    ArrayList<Dolazak_Radnika> sviDolasci;
    ArrayList<Radnik> radnici;
    public static String izabraniMesec;
    Date datum = new Date();
    
    public Mesecni_Izvod() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tabela.getModel();
        sviDolasci = Datoteke.citaj_iz_velike();
        radnici = Datoteke.ucitajRadnike();
        
        
        for(int i = 0; i < radnici.size(); i++)
        {
            model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                radnici.get(i).getIme(), 
                                                                radnici.get(i).getPrezime(), 
                                                                radnici.get(i).getPosao().getNaziv(),
                                                                radnici.get(i).getPosao().obracunajMesecnuKvotu(Integer.parseInt(izabraniMesec))});
        }
        
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment( SwingConstants.LEFT );
        for(int i = 0; i < tabela.getColumnCount(); i++)
        {
            tabela.getColumnModel().getColumn(i).setCellRenderer(render);
        }
        
    }
    public long obracunajRadneSate(Radnik radnik){
        long ukupanBrSati = 0;
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(sviDolasci.get(i).getRadnik().getId() == radnik.getId())
            {
                ukupanBrSati += sviDolasci.get(i).obracunajMesec(Integer.parseInt(izabraniMesec));
            }
        }
        return ukupanBrSati;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime", "Prezime", "Posao", "Broj radnih sati", "Kvota", "Dodatak/Smanjenje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        izabraniMesec = args[0];
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
            java.util.logging.Logger.getLogger(Mesecni_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesecni_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesecni_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesecni_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mesecni_Izvod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}