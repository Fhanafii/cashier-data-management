package com.fhanafi.mkasir;

public class aplikasiToko extends javax.swing.JFrame {

    public aplikasiToko() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        masterData = new javax.swing.JMenu();
        barang = new javax.swing.JMenu();
        customer = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        user = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenu();
        transaksiPenjualan = new javax.swing.JMenu();
        aplikasi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        masterData.setText("Master Data");

        barang.setText("Barang");
        barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangMouseClicked(evt);
            }
        });
        masterData.add(barang);

        customer.setText("Customer");
        customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerMouseClicked(evt);
            }
        });
        masterData.add(customer);
        masterData.add(jSeparator1);

        user.setText("Add user");
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });
        masterData.add(user);

        jMenuBar1.add(masterData);

        transaksi.setText("Transaksi");

        transaksiPenjualan.setText("Transaksi Penjualan");
        transaksiPenjualan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiPenjualanMouseClicked(evt);
            }
        });
        transaksi.add(transaksiPenjualan);

        jMenuBar1.add(transaksi);

        aplikasi.setText("Aplikasi");
        jMenuBar1.add(aplikasi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 498, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void barangMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        MasterDataBarang mdb = new MasterDataBarang();
        mdb.setVisible(true);
        mdb.pack();
        mdb.setLocationRelativeTo(null);
        mdb.setDefaultCloseOperation(MasterDataBarang.EXIT_ON_CLOSE);
    }

    private void customerMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        MasterDataCustomer mdc = new MasterDataCustomer();
        mdc.setVisible(true);
        mdc.pack();
        mdc.setLocationRelativeTo(null);
        mdc.setDefaultCloseOperation(MasterDataCustomer.EXIT_ON_CLOSE);
    }

    private void transaksiPenjualanMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        TransaksiPenjualan tp = new TransaksiPenjualan();
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(TransaksiPenjualan.EXIT_ON_CLOSE);
    }

    private void userMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        Register rg = new Register();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(aplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasiToko.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasiToko().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenu aplikasi;
    private javax.swing.JMenu barang;
    private javax.swing.JMenu customer;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu masterData;
    private javax.swing.JMenu transaksi;
    private javax.swing.JMenu transaksiPenjualan;
    private javax.swing.JMenu user;
    // End of variables declaration
}

