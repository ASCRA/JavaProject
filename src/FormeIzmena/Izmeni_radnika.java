/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormeIzmena;
import OstaleKlase.*;
import javax.swing.*;
import javax.swing.table.*;

public class Izmeni_radnika extends Forma_Radnik{

    DefaultTableModel model;
    int id_radnika;
    DefaultTableCellRenderer pozicioniranje = new DefaultTableCellRenderer();
    
    public Izmeni_radnika() {
        initComponents();
        ucitaj_podatke();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) tabela.getModel();
        izbor_posla.setModel(popuni_listu_poslova());
        for(int i = 0; i < radnici.size(); i++)
        {
        model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                radnici.get(i).getIme(), 
                                                                radnici.get(i).getPrezime(), 
                                                                radnici.get(i).getPosao().getNaziv(),
                                                                (radnici.get(i).isStatus()?"Aktivan":"Neaktivan")});
        }
        
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabela.rowAtPoint(evt.getPoint());
                ime_radnika_dodavanje.setText(String.valueOf(radnici.get(row).getIme()));
                prezime_radnika_dodavanje.setText(String.valueOf(radnici.get(row).getPrezime()));
                izbor_posla.setSelectedIndex(nadjiPosao(String.valueOf(radnici.get(row).getPosao().getNaziv())));
                izbor_statusa.setSelectedIndex(radnici.get(row).isStatus() ? 0 : 1);
                id_radnika = radnici.get(row).getId();
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
            {
                indexPosla = i;
                break;
            }
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        izbor_statusa = new javax.swing.JComboBox<>();

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
        ime_radnika_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ime_radnika_dodavanjeKeyTyped(evt);
            }
        });

        prezime_radnika_dodavanje.setBackground(new java.awt.Color(224, 224, 249));
        prezime_radnika_dodavanje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        prezime_radnika_dodavanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prezime_radnika_dodavanjeKeyTyped(evt);
            }
        });

        izbor_posla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        izmeni_radnika_dugme.setText("Izmeni");
        izmeni_radnika_dugme.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        izmeni_radnika_dugme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izmeni_radnika_dugmeActionPerformed(evt);
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel5.setText("Status:");

        izbor_statusa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktivan", "Neaktivan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(izmeni_radnika_dugme, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(ime_radnika_dodavanje)
                    .addComponent(prezime_radnika_dodavanje)
                    .addComponent(izbor_posla, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(izbor_statusa, 0, 192, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
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
                            .addComponent(izbor_statusa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(izmeni_radnika_dugme, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            String imeRadnika = ime_radnika_dodavanje.getText().trim();
            String prezimeRadnika = prezime_radnika_dodavanje.getText().trim();
            int posao = izbor_posla.getSelectedIndex();
            Posao izabraniPosao = poslovi.get(posao);
            boolean status = (izbor_statusa.getSelectedIndex() == 0);
            for(int i = 0; i < radnici.size(); i++)
            {
                if(radnici.get(i).getId() == id_radnika)
                {
                    radnici.get(i).setIme(imeRadnika);
                    radnici.get(i).setPrezime(prezimeRadnika);   
                    radnici.get(i).setPosao(izabraniPosao);
                    radnici.get(i).setStatus(status);
                }
            }
            
            Datoteke.upisiRadnike(radnici);
            JOptionPane.showMessageDialog(null, "Uspesno sacuvano!");
        }
         
        model.setRowCount(0);
        for(int i = 0; i < radnici.size(); i++)
        {
        model.insertRow(model.getRowCount(), new Object [] {radnici.get(i).getId(), 
                                                                radnici.get(i).getIme(), 
                                                                radnici.get(i).getPrezime(), 
                                                                radnici.get(i).getPosao().getNaziv(),
                                                                (radnici.get(i).isStatus()?"Aktivan":"Neaktivan")});
        }
    }//GEN-LAST:event_izmeni_radnika_dugmeActionPerformed

    private void ime_radnika_dodavanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ime_radnika_dodavanjeActionPerformed

    private void ime_radnika_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ime_radnika_dodavanjeKeyTyped
        char t = evt.getKeyChar();
         if(!(Character.isAlphabetic(t)||Character.isSpaceChar(t)))
             evt.consume();
    }//GEN-LAST:event_ime_radnika_dodavanjeKeyTyped

    private void prezime_radnika_dodavanjeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prezime_radnika_dodavanjeKeyTyped
        char t = evt.getKeyChar();
         if(!(Character.isAlphabetic(t)||Character.isSpaceChar(t)))
             evt.consume();
    }//GEN-LAST:event_prezime_radnika_dodavanjeKeyTyped

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
    private javax.swing.JTextField ime_radnika_dodavanje;
    private javax.swing.JComboBox<String> izbor_posla;
    private javax.swing.JComboBox<String> izbor_statusa;
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
