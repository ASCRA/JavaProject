/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzvoda;

import java.util.*;
import javax.swing.table.*;
import projektni.zadatak.Klase.Datoteke;
import KlaseOsoba.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import projektni.zadatak.Glavna_Forma;

public final class Mesecni_Izvod extends Forma_Izvoda {

    DefaultTableModel model;
    public static String izabraniMesec;
    int mesec;
    Date datum = new Date();
    
    public Mesecni_Izvod() {  
        initComponents();
        model = (DefaultTableModel) tabela.getModel();
        ucitaj_podatke();
        ucitaj_dolaske();
        mesec = Integer.parseInt(izabraniMesec);
        for(int i = 0; i < radnici.size(); i++)
        {
            model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                radnici.get(i).getIme(), 
                                                                radnici.get(i).getPrezime(), 
                                                                radnici.get(i).getPosao().getNaziv(),
                                                                String.valueOf(obracunajRadneSate(radnici.get(i)) + "/" + obracunajKvotu(radnici.get(i))),
                                                                obracunajPlatu(radnici.get(i)),
                                                                obracunajBonus(radnici.get(i)),
                                                                obracunajPlatu(radnici.get(i)) + obracunajBonus(radnici.get(i))});
        }
        
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment( SwingConstants.LEFT );
        for(int i = 0; i < tabela.getColumnCount(); i++)
        {
            tabela.getColumnModel().getColumn(i).setCellRenderer(render);
        } 
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ime", "Prezime", "Posao", "Broj radnih sati", "Trenutna plata", "Dodatak/Smanjenje", "Obracunata plata"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jButton1.setText("Štampaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(859, 859, 859)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] naziviMeseci = {"januar", "februar", "mart", "april", "maj", "jun", "jul", "avgust", "septembar", "oktobar", "novembar", "decembar"};
        MessageFormat header = new MessageFormat("Mesecni izvod za mesec " + naziviMeseci[Integer.parseInt(izabraniMesec)-1]);
        MessageFormat footer = new MessageFormat("Strana {0,number,integer}");
        
        try
        {
            tabela.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }
        catch(PrinterException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    public long obracunajKvotu(Radnik radnik){
    long kvota = 0;
        
        for(int i = 0; i < sviDolasci.size(); i++)
            
        {
            if(sviDolasci.get(i).getRadnik().getId() == radnik.getId() && sviDolasci.get(i).getDatum_dolaska().getMonthValue() == mesec)
            {
                kvota = sviDolasci.get(i).getRadnik().getPosao().obracunajMesecnuKvotu(mesec);
                break;
            }
        }
        return kvota;
    }
        
    public long obracunajRadneSate(Radnik radnik){
        long ukupanBrSati = 0;
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(sviDolasci.get(i).getRadnik().getId() == radnik.getId())
            {
                ukupanBrSati += sviDolasci.get(i).obracunajRadneSate(Integer.parseInt(izabraniMesec));
            }
        }
        return ukupanBrSati;
    }
    
    public double obracunajPlatu(Radnik radnik){
        return obracunajRadneSate(radnik) * nadjiPlatu(radnik);
    }
    
    public double nadjiPlatu(Radnik radnik){
        double plata = 0;
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(sviDolasci.get(i).getRadnik().getId() == radnik.getId() && sviDolasci.get(i).getDatum_dolaska().getMonthValue() == mesec)
            {
                plata = sviDolasci.get(i).getRadnik().getPosao().getPlata();
                break;
            }
        }
        return plata;
    }
    
    public double obracunajBonus(Radnik radnik){
        long br_sati = obracunajRadneSate(radnik);
        long kvota = obracunajKvotu(radnik);
        int razlika = (int)(br_sati - kvota);
        double plataRadnika = nadjiPlatu(radnik);
        double plata = obracunajPlatu(radnik);
        double bonus = 0;
        if(razlika > 0)
        {
            bonus = razlika * (plataRadnika*0.2);
        }
        else if(razlika < 0)
        {
            razlika = Math.abs(razlika);
            double pomocna = bonus;
            while(razlika > 0)
            {
                pomocna -= plataRadnika*0.05;
                if(Math.abs(pomocna) <= plata*0.25)
                bonus = pomocna;
                razlika-=1;
            }
        }
        return bonus;
    }
}