/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kassa;


/**
 *
 * @author Nena
 */
public class Bon extends javax.swing.JFrame {

    /**
     * Creates new form Bon
     */
    public Bon() {
        initComponents();
    }
    
    public static void getBon() {
        /*
         * Hamburger = 0;
         * soda = 1;
         * fries = 2;
         * onion rings = 3;
         * milkshake = 4;
         * icecream = 5;
         */

        double sum = 0;
        
        
        
        for (int i = 0; i < gui.itemList.size(); i++) {
            Product temp = (Product) gui.itemList.get(i);
            
            if( temp.count != 0 ) {
                sum += temp.price;
                goodsList.add(temp.count + " " + temp.name + "   : " + gui.roundMoney(temp.count * temp.price));
                
            }
        }
        
        double btw = (sum / 100 * 6);
        double discount = (sum / 100 * gui.discount);
        
        goodsList.add("------------------------------------------------");
        
        if(gui.discountActive){
            goodsList.add("Inclusief BTW 6% : " + gui.roundMoney(btw));
            goodsList.add("15% korting : " + gui.roundMoney(discount));
            goodsList.add("Totaal : " + gui.roundMoney(sum - (discount + btw)));
            
        } else {
            goodsList.add("Inclusief BTW 6% : " + gui.roundMoney(btw));
            goodsList.add("Totaal : " + gui.roundMoney(sum + btw));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reset = new javax.swing.JButton();
        goodsList = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reset.setBackground(new java.awt.Color(181, 230, 29));
        reset.setText("Volgende klant");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        goodsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goodsListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(reset)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goodsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goodsList, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        reset.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        gui.itemList.clear();
        gui.initItems();
        dispose();
        this.setVisible(false);       
    }//GEN-LAST:event_resetActionPerformed

    private void goodsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goodsListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goodsListActionPerformed
     
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
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bon().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.List goodsList;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
