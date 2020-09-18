/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzvoda;

import KlaseOsoba.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class Danasnji_Izvod extends Forma_Izvoda {

    public static String id_radnika;
    int id = Integer.parseInt(id_radnika)-1;
    
    public Danasnji_Izvod() {
        initComponents();
        this.setLocationRelativeTo(null);
        ucitaj_podatke();
        ucitaj_dolaske();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        
        ime_tekst.setText(radnici.get(id).getIme());
        prezime_tekst.setText(radnici.get(id).getPrezime());
        id_tekst.setText(String.valueOf(radnici.get(id).getId()));
        posao_tekst.setText(radnici.get(id).getPosao().getNaziv());
        if(pronadjiPrisustvo(radnici.get(id)).getVreme_prijave().compareTo(LocalTime.parse("00:00")) == 0)
        {
            vreme_dolaska_tekst.setText("");
            vreme_odlaska_tekst.setText("");
        }
        else
        {
        vreme_dolaska_tekst.setText(pronadjiPrisustvo(radnici.get(id)).getVreme_prijave() == null ? "" : format.format(pronadjiPrisustvo(radnici.get(id)).getVreme_prijave()));
        vreme_odlaska_tekst.setText(pronadjiPrisustvo(radnici.get(id)).getVreme_odjave()== null ? "" : format.format(pronadjiPrisustvo(radnici.get(id)).getVreme_odjave()));
        }
        pred_vreme_dolaska_tekst.setText(format.format(radnici.get(id).getPosao().getVremeDolaska()));
        
        long brojMinuta = Duration.between(radnici.get(id).getPosao().getVremeDolaska(), pronadjiPrisustvo(radnici.get(id)).getVreme_prijave()).toMinutes();
        long sati = brojMinuta/60;
        long minuti = brojMinuta-sati*60;
        if(brojMinuta > 0)
        {
        if(Math.abs(sati)<= 0)
        {
            kasnjenje_tekst.setText(String.valueOf(minuti) + "m");
        }
        else
        {
            kasnjenje_tekst.setText(String.valueOf(sati)+ "h" + String.valueOf(minuti) + "m");
        }
        }
        else
        {
            kasnjenje_tekst.setText("Radnik nije dosao");
        }
    }

    public Dolazak_Radnika pronadjiPrisustvo(Radnik radnik)
    {
        Calendar cal = Calendar.getInstance();
        cal.set(0, 0, 0);
        LocalDate datum = LocalDate.now();
        Dolazak_Radnika nijeDosao = new Dolazak_Radnika(radnik, datum, LocalTime.parse("00:00"), LocalTime.parse("00:00"));
        boolean nadjenDolazak = false;
        int trazeniID = 0;
        
        for(int i = 0; i < sviDolasci.size(); i++)
        {
            if(radnik.getId() == sviDolasci.get(i).getRadnik().getId())
            {
                if(sviDolasci.get(i).getDatum_dolaska().compareTo(LocalDate.now()) == 0)
                {
                    nadjenDolazak = true;
                    trazeniID = i;
                }
            }
        }
        if(nadjenDolazak)
        {
            return sviDolasci.get(trazeniID);
        }
        else
            return nijeDosao;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ime_tekst = new javax.swing.JTextField();
        prezime_tekst = new javax.swing.JTextField();
        id_tekst = new javax.swing.JTextField();
        posao_tekst = new javax.swing.JTextField();
        vreme_dolaska_tekst = new javax.swing.JTextField();
        vreme_odlaska_tekst = new javax.swing.JTextField();
        pred_vreme_dolaska_tekst = new javax.swing.JTextField();
        kasnjenje_tekst = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ime:");

        jLabel2.setText("Prezime:");

        jLabel3.setText("ID:");

        jLabel4.setText("Posao:");

        jLabel5.setText("Vreme dolaska:");

        jLabel6.setText("Predvidjeno vreme dolaska:");

        jLabel7.setText("Vreme odlaska:");

        jLabel8.setText("Kasnjenje:");

        ime_tekst.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ime_tekst.setFocusable(false);
        ime_tekst.setRequestFocusEnabled(false);

        prezime_tekst.setFocusable(false);

        id_tekst.setFocusable(false);

        posao_tekst.setFocusable(false);

        vreme_dolaska_tekst.setFocusable(false);

        vreme_odlaska_tekst.setFocusable(false);

        pred_vreme_dolaska_tekst.setFocusable(false);

        kasnjenje_tekst.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("DANASNJI IZVOD RADNIKA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ime_tekst)
                                .addComponent(id_tekst)
                                .addComponent(posao_tekst)
                                .addComponent(vreme_dolaska_tekst)
                                .addComponent(vreme_odlaska_tekst)
                                .addComponent(pred_vreme_dolaska_tekst)
                                .addComponent(kasnjenje_tekst, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                            .addComponent(prezime_tekst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ime_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prezime_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(posao_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vreme_dolaska_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vreme_odlaska_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pred_vreme_dolaska_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kasnjenje_tekst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        id_radnika = args[0];
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
            java.util.logging.Logger.getLogger(Danasnji_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Danasnji_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Danasnji_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Danasnji_Izvod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Danasnji_Izvod().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_tekst;
    private javax.swing.JTextField ime_tekst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField kasnjenje_tekst;
    private javax.swing.JTextField posao_tekst;
    private javax.swing.JTextField pred_vreme_dolaska_tekst;
    private javax.swing.JTextField prezime_tekst;
    private javax.swing.JTextField vreme_dolaska_tekst;
    private javax.swing.JTextField vreme_odlaska_tekst;
    // End of variables declaration//GEN-END:variables
}
