/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;
import projektni.zadatak.Glavna_Forma;

public abstract class Forma_Posao extends Glavna_Forma {
    public String vreme_dolaska;
    public String vreme_odlaska;
    
    public String PodesiVreme(javax.swing.JSpinner vreme_sat, javax.swing.JSpinner vreme_minut){
            String vremeOdlaskaMinut = "00";
            String vremeOdlaskaSat = "00";
        if(Integer.parseInt(String.valueOf(vreme_sat.getValue()))>0 && Integer.parseInt(String.valueOf(vreme_sat.getValue()))<10)
            {
                vremeOdlaskaSat = String.valueOf("0"+vreme_sat.getValue());
            }
            else
            {
                vremeOdlaskaSat = String.valueOf(vreme_sat.getValue());
            }
            
            if(Integer.parseInt(String.valueOf(vreme_minut.getValue()))>=0 && Integer.parseInt(String.valueOf(vreme_minut.getValue()))<10)
            {
                vremeOdlaskaMinut = String.valueOf("0"+vreme_minut.getValue());
            }
            else
            {
                vremeOdlaskaMinut = String.valueOf(vreme_minut.getValue());
            }
            return vremeOdlaskaSat+":"+vremeOdlaskaMinut;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
