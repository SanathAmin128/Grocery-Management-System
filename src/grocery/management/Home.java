/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.management;

import javax.swing.JOptionPane;

/**
 *
 * @author SANATH
 */
public class Home extends javax.swing.JFrame
{
    public String email;
    /**
     * Creates new form Home
     */
    public Home()
    {
        initComponents();
    }
    
    public Home(String userEmail)   //to get emailid from login page
    {
        initComponents();
        email=userEmail;
        if(!email.equals("admin@gmail.com"))
        {
            btnCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnNewSupplier.setVisible(false);
            btnViewEditDeleteSupplier.setVisible(false);
            btnVerifyUsers.setVisible(false);
            btnViewBill.setVisible(false);
        }
    }

    /**
     * This method is called from within the
     * constructor to initialize the form.
     * WARNING: Do NOT modify this code. The
     * content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        btnLogout = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnViewBill = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteSupplier = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnNewSupplier = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 165, -1));

        btnPlaceOrder.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnPlaceOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 211, -1));

        btnExit.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 153, 39));

        btnViewBill.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnViewBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        btnViewBill.setText("View Bill");
        btnViewBill.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewBillActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 189, -1));

        btnNewProduct.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        btnViewEditDeleteSupplier.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnViewEditDeleteSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteSupplier.setText("View,Edit & Delete Supplier");
        btnViewEditDeleteSupplier.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewEditDeleteSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 340, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        btnCategory.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View,Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, -1, -1));

        btnNewSupplier.setFont(new java.awt.Font("Consolas", 0, 16)); // NOI18N
        btnNewSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewSupplier.setText("New Supplier");
        btnNewSupplier.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnNewSupplierActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 630, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1360, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLogoutActionPerformed
    {//GEN-HEADEREND:event_btnLogoutActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Logout?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPlaceOrderActionPerformed
    {//GEN-HEADEREND:event_btnPlaceOrderActionPerformed
        setVisible(false);
        new PlaceOrder(email).setVisible(true);  //passing email to place order to know who has made the bill
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to Close Application?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
            System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnVerifyUsersActionPerformed
    {//GEN-HEADEREND:event_btnVerifyUsersActionPerformed
        // TODO add your handling code here:
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewBillActionPerformed
    {//GEN-HEADEREND:event_btnViewBillActionPerformed
        // TODO add your handling code here:
        new ViewBill().setVisible(true);
    }//GEN-LAST:event_btnViewBillActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNewProductActionPerformed
    {//GEN-HEADEREND:event_btnNewProductActionPerformed
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCategoryActionPerformed
    {//GEN-HEADEREND:event_btnCategoryActionPerformed
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void btnNewSupplierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnNewSupplierActionPerformed
    {//GEN-HEADEREND:event_btnNewSupplierActionPerformed
        new AddNewSupplier().setVisible(true);
    }//GEN-LAST:event_btnNewSupplierActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
    {//GEN-HEADEREND:event_btnViewEditDeleteProductActionPerformed
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnViewEditDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnViewEditDeleteSupplierActionPerformed
    {//GEN-HEADEREND:event_btnViewEditDeleteSupplierActionPerformed
        new ViewEditDeleteSupplier().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteSupplierActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnNewSupplier;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JButton btnViewEditDeleteSupplier;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
