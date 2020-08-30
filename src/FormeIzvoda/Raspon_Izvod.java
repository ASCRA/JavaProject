
package FormeIzvoda;

import java.util.*;
import javax.swing.table.*;
import projektni.zadatak.Klase.Datoteke;
import KlaseOsoba.*;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Raspon_Izvod extends javax.swing.JFrame {

    DefaultTableModel model;
    ArrayList<Dolazak_Radnika> sviDolasci;
    ArrayList<Radnik> radnici;
    public static Date pocetniDatum;
    public static Date krajnjiDatum;
    Date datum = new Date();
    
    public Raspon_Izvod() {  
        initComponents();
        model = (DefaultTableModel) tabela.getModel();
        sviDolasci = Datoteke.citaj_iz_velike();
        radnici = Datoteke.ucitajRadnike();
        
        if((krajnjiDatum == null && pocetniDatum != null) || (krajnjiDatum != null && pocetniDatum == null))
        {
            for(int i = 0; i < radnici.size(); i++)
            {
                model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                    radnici.get(i).getIme(), 
                                                                    radnici.get(i).getPrezime(), 
                                                                    radnici.get(i).getPosao().getNaziv(),
                                                                    (krajnjiDatum == null) ? obracunajDan(pocetniDatum, radnici.get(i)) : obracunajDan(krajnjiDatum, radnici.get(i))
                                                                    });
            }
        }
        else if (krajnjiDatum != null && pocetniDatum != null)
        {
            for(int i = 0; i < radnici.size(); i++)
            {
                model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                    radnici.get(i).getIme(), 
                                                                    radnici.get(i).getPrezime(), 
                                                                    radnici.get(i).getPosao().getNaziv(),
                                                                    obracunajRaspon(pocetniDatum, krajnjiDatum, radnici.get(i))
                                                                    });
            }
        }
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment( SwingConstants.LEFT );
        for(int i = 0; i < tabela.getColumnCount(); i++)
        {
            tabela.getColumnModel().getColumn(i).setCellRenderer(render);
        }
        this.setLocationRelativeTo(null);
    }
    
    public long obracunajDan(Date datum, Radnik radnik)
    {
        long brojSati = 0;
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(sviDolasci.get(i).getRadnik().getId() == radnik.getId())
            {
                if(sviDolasci.get(i).getDatum_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfYear() == datum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfYear() && 
                   sviDolasci.get(i).getDatum_dolaska().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() == datum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear())
                {
                    
                    brojSati = sviDolasci.get(i).obracunajDan();
                    break;
                }
            }
        }
        return brojSati;
    }
    
    public long obracunajRaspon(Date pocetniDatum, Date krajnjiDatum, Radnik radnik)
    {    
        
        int godina = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getYear();
        int dan = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth();
        int mesec = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getMonthValue();   
        
        YearMonth godinaMesec = YearMonth.of(godina, mesec);
        int brojDanaUMesecu = godinaMesec.lengthOfMonth();
        
        long broj_radnih_sati = 0;
        while(true)
        {
            if((dan > krajnjiDatum.toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth()) && (mesec == krajnjiDatum.toInstant().atZone(ZoneId.systemDefault()).getMonthValue()))
                break;
           
            else
            {
                if(dan > brojDanaUMesecu)
                {
                    dan = 1;
                    mesec++;
                    godinaMesec = YearMonth.of(godina, mesec);
                    brojDanaUMesecu = godinaMesec.lengthOfMonth();
                }
                for(int i = 0; i < sviDolasci.size(); i++)
                {
                    if((sviDolasci.get(i).getRadnik().getId() == radnik.getId()) && (sviDolasci.get(i).getDatum_dolaska().toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth() == dan))
                    {
                        
                        long brojMinuta = Duration.between(sviDolasci.get(i).getVreme_prijave(), sviDolasci.get(i).getVreme_odjave()).toMinutes();
                        
                        broj_radnih_sati += brojMinuta/60;
                        
                    }
                }
                ++dan;
            }
            
        }

        return broj_radnih_sati;
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

    public static void main(Date args[]) {
        pocetniDatum = args[0];
        krajnjiDatum = args[1];
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
            java.util.logging.Logger.getLogger(Raspon_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Raspon_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Raspon_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Raspon_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Raspon_Izvod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}