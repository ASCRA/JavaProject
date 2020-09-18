
package FormeIzmena;

import javax.swing.DefaultComboBoxModel;
import GlavneForme.Glavna_Forma;

public abstract class Forma_Radnik extends Glavna_Forma {

    public DefaultComboBoxModel popuni_listu_poslova(){
        ucitaj_podatke();
        String pomocnaLista[] = new String[poslovi.size()];
        for(int i = 0; i < poslovi.size(); i++)
        pomocnaLista[i] = poslovi.get(i).getNaziv();
        DefaultComboBoxModel model = new DefaultComboBoxModel<>(pomocnaLista);
        return model;
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
