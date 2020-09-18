
package FormeIzvoda;

import static FormeIzvoda.Mesecni_Izvod.izabraniMesec;
import java.util.*;
import javax.swing.table.*;
import KlaseOsoba.*;
import java.awt.print.PrinterException;
import java.text.*;
import java.time.*;
import javax.swing.*;

public class Raspon_Izvod extends Forma_Izvoda implements Obracuni{

    DefaultTableModel model;
    public static Date pocetniDatum;
    public static Date krajnjiDatum;
    Date datum = new Date();

    public Raspon_Izvod() {  
        initComponents();
        model = (DefaultTableModel) tabela.getModel();
        ucitaj_podatke();
        ucitaj_dolaske();
        
        DecimalFormat formatIspisa = new DecimalFormat("#.00");
            for(int i = 0; i < radnici.size(); i++)
            {
                model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                    radnici.get(i).getIme(), 
                                                                    radnici.get(i).getPrezime(), 
                                                                    radnici.get(i).getPosao().getNaziv(),
                                                                    obracunajRadneSate(radnici.get(i)) + "/" + obracunajKvotu(radnici.get(i)),
                                                                    formatIspisa.format(obracunajPlatu(radnici.get(i))),
                                                                    formatIspisa.format(obracunajBonus(radnici.get(i))),
                                                                    formatIspisa.format(obracunajPlatu(radnici.get(i)) + obracunajBonus(radnici.get(i)))
                                                                    });
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
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
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
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

    @Override
    public long obracunajRadneSate(Radnik radnik) {
        Calendar cal = Calendar.getInstance();
        int godina = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getYear();
        int dan = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth();
        int mesec = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getMonthValue() - 1;  
        cal.set(godina, mesec, dan);
        int brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);
        
        long broj_radnih_sati = 0;
        while(true)
        {
            if(cal.getTime().compareTo(krajnjiDatum) > 0)
                break;
           
            else
            {
                if(dan > brojDanaUMesecu)
                {
                    if(mesec >= 12)
                        cal.set(++godina, 1, 1);
                    else
                        cal.set(godina, ++mesec, 1);
                    brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);
                }
                for(int i = 0; i < sviDolasci.size(); i++)
                {
                    if(sviDolasci.get(i).getVreme_odjave()!=null)
                    {
                        if((sviDolasci.get(i).getRadnik().getId() == radnik.getId()) && (sviDolasci.get(i).getDatum_dolaska().getDayOfYear() == cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfYear()) && (sviDolasci.get(i).getDatum_dolaska().getYear() == cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getYear()))
                        {
                            long brojMinuta = Duration.between(sviDolasci.get(i).getVreme_prijave(), sviDolasci.get(i).getVreme_odjave()).toMinutes();
                            broj_radnih_sati += brojMinuta/60;
                            break;
                        }
                    }
                }
                cal.set(godina, mesec, ++dan);
            }
            
        }

        return broj_radnih_sati;
    }
    @Override
    public double obracunajPlatu(Radnik radnik) {
        int broj_radnih_dana = 0;
        double plata = 0;

        plata = nadjiPlatu(radnik)*obracunajRadneSate(radnik);
        return plata;
    }
    
        public double nadjiPlatu(Radnik radnik) {
        Calendar cal = Calendar.getInstance();
        int godina = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getYear();
        int dan = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth();
        int mesec = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getMonthValue() - 1;  
        int kvota = 0;
        cal.set(godina, mesec, dan);
        int brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);

        int broj_radnih_dana = 0;
        double prosecnaPlata = 0;
        while(true)
        {
            if(cal.getTime().compareTo(krajnjiDatum) > 0)
                break;
           
            else
            {
                if(dan > brojDanaUMesecu)
                {
                    if(mesec >= 12)
                        cal.set(++godina, 1, 1);
                    else
                        cal.set(godina, ++mesec, 1);
                    brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);
                }
                for(int i = 0; i < sviDolasci.size(); i++)
                {
                    if(sviDolasci.get(i).getVreme_odjave()!=null)
                    {
                        if((sviDolasci.get(i).getRadnik().getId() == radnik.getId()) && (sviDolasci.get(i).getDatum_dolaska().getDayOfYear() == cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfYear()) && (sviDolasci.get(i).getDatum_dolaska().getYear() == cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getYear()))
                        {
                            broj_radnih_dana++;
                            prosecnaPlata += sviDolasci.get(i).getRadnik().getPosao().getPlata();
                        }
                    }
                }
                cal.set(godina, mesec, ++dan);
            }
        }
        prosecnaPlata = (prosecnaPlata/broj_radnih_dana);
        return prosecnaPlata;
    }
    
    @Override
    public double obracunajBonus(Radnik radnik) {
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

    @Override
    public long obracunajKvotu(Radnik radnik) {
        Calendar cal = Calendar.getInstance();
        int godina = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getYear();
        int dan = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getDayOfMonth();
        int mesec = pocetniDatum.toInstant().atZone(ZoneId.systemDefault()).getMonthValue() - 1;  
        int kvota = 0;
        cal.set(godina, mesec, dan);
        int brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);
        
        while(true)
        {
            if(cal.getTime().compareTo(krajnjiDatum) > 0)
                break;
            else
            {
                if(dan > brojDanaUMesecu)
                {
                    if(mesec >= 12)
                        cal.set(++godina, 1, 1);
                    else
                        cal.set(godina, ++mesec, 1);
                    brojDanaUMesecu = cal.getActualMaximum(Calendar.DATE);
                }
                for(int i = 0; i < sviDolasci.size(); i++)
                {
                    if(sviDolasci.get(i).getVreme_odjave()!=null)
                    {
                        if((sviDolasci.get(i).getRadnik().getId() == radnik.getId()))
                        {
                            if(!(cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfWeek().compareTo(DayOfWeek.SUNDAY) == 0)
                                && !(cal.getTime().toInstant().atZone(ZoneId.systemDefault()).getDayOfWeek().compareTo(DayOfWeek.SATURDAY) == 0))
                            {
                                kvota += sviDolasci.get(i).getRadnik().getPosao().obracunajDnevnuKvotu();
                                break;
//                                
                            }
                        }
                    }
                }
                cal.set(godina, mesec, ++dan);
               
            }
        }
        return kvota;
    }
}