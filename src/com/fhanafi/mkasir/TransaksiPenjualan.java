package com.fhanafi.mkasir;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TransaksiPenjualan extends javax.swing.JFrame {

    public TransaksiPenjualan() {
        initComponents();

    }

    public String kcustomer, ncustomer, kbarang, nbarang, harga, jumlah, subtotal, nnota, total, pembayaran, kembalian;
    public int jml, hr,stotal, ttl, pmb, stotal1;
    public String namaCustomer = "";
    public String namaBarang = "";
    public String hargaBarang = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel_NoNota = new javax.swing.JLabel();
        jLabel_Customer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_KodeCustomer = new javax.swing.JLabel();
        jLabel_NamaCustomer = new javax.swing.JLabel();
        jText_kcustomer = new javax.swing.JTextField();
        jText_ncustomer = new javax.swing.JTextField();
        daftar_customer = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_KodeBarang = new javax.swing.JLabel();
        jText_kdBarang = new javax.swing.JTextField();
        daftar_barang = new javax.swing.JButton();
        jLabel_Harga = new javax.swing.JLabel();
        jText_harga = new javax.swing.JTextField();
        jLabel_Subtotal = new javax.swing.JLabel();
        jText_subtotal = new javax.swing.JTextField();
        jLabel_NamaBarang = new javax.swing.JLabel();
        jText_namabarang = new javax.swing.JTextField();
        jLabel_Jumlah = new javax.swing.JLabel();
        jText_jumlah = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();
        Table = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        masukandata = new javax.swing.JButton();
        jLabel_DetailPenjualan = new javax.swing.JLabel();
        NoBaru = new javax.swing.JButton();
        jText_nota = new javax.swing.JTextField();
        jLabel_Total = new javax.swing.JLabel();
        jLabel_Pembayaran = new javax.swing.JLabel();
        jLabel_Kembalian = new javax.swing.JLabel();
        jText_kembalian = new javax.swing.JTextField();
        jText_total = new javax.swing.JTextField();
        jText_pembayaran = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_NoNota.setText("No.Nota");

        jLabel_Customer.setText("Customer");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_KodeCustomer.setText("Kode Customer");

        jLabel_NamaCustomer.setText("Nama Customer");

        daftar_customer.setText("Daftar");
        daftar_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftar_customerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_NamaCustomer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jText_ncustomer))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel_KodeCustomer)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jText_kcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(daftar_customer)))
                                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_KodeCustomer)
                                        .addComponent(jText_kcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daftar_customer))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_NamaCustomer)
                                        .addComponent(jText_ncustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_KodeBarang.setText("Kode Barang");

        daftar_barang.setText("Daftar");
        daftar_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftar_barangMouseClicked(evt);
            }
        });
        jLabel_Harga.setText("harga");

        jLabel_Subtotal.setText("Subtotal");

        jLabel_NamaBarang.setText("Nama Barang");

        jLabel_Jumlah.setText("Jumlah");

        Tambah.setText("Tambah");
        Tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TambahMouseClicked(evt);
            }
        });
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Kode", "Nama Barang", "Harga", "Jumlah", "Total"
                }
        ));
        Table.setViewportView(jTable1);

        masukandata.setText("Masukan Data");
        masukandata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukandataMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_KodeBarang)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jText_kdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(daftar_barang)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel_Harga)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jText_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel_Subtotal))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel_NamaBarang)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jText_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel_Jumlah)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jText_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Tambah)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jText_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(masukandata, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(28, Short.MAX_VALUE))
                        .addComponent(Table)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jText_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Subtotal)
                                                .addComponent(jText_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel_KodeBarang)
                                                .addComponent(jText_kdBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(daftar_barang)
                                                .addComponent(jLabel_Harga)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel_NamaBarang)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jText_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel_Jumlah)
                                                .addComponent(jText_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Tambah)
                                                .addComponent(masukandata)))
                                .addGap(18, 18, 18)
                                .addComponent(Table, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel_DetailPenjualan.setText("Detail penjualan");

        NoBaru.setText("No. Baru");
        NoBaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoBaruMouseClicked(evt);
            }
        });

        jLabel_Total.setText("Total");

        jLabel_Pembayaran.setText("Pembayaran");

        jLabel_Kembalian.setText("Kembalian");

        save.setText("Save");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });

        hitung.setText("Hitung");
        hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungMouseClicked(evt);
            }
        });
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel_NoNota)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jText_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(NoBaru))
                                                        .addComponent(jLabel_DetailPenjualan)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel_Customer)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel_Pembayaran)
                                                        .addComponent(jLabel_Total, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel_Kembalian, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jText_total)
                                                        .addComponent(jText_pembayaran)
                                                        .addComponent(jText_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(save)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(cancel))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(67, 67, 67)
                                                                .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_NoNota)
                                        .addComponent(NoBaru)
                                        .addComponent(jText_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addComponent(jLabel_Customer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_DetailPenjualan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_Total)
                                        .addComponent(jText_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_Pembayaran)
                                        .addComponent(jText_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(save)
                                        .addComponent(cancel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel_Kembalian)
                                        .addComponent(jText_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hitung))
                                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        aplikasiToko tp = new aplikasiToko();
        tp.setVisible(true);
        tp.pack();
        tp.setLocationRelativeTo(null);
        tp.setDefaultCloseOperation(TransaksiPenjualan.EXIT_ON_CLOSE);

        this.dispose();
    }

    private void daftar_customerMouseClicked(java.awt.event.MouseEvent evt) {
        // Mendapatkan kode_customer dari teks input atau sesuai kebutuhan aplikasi Anda
        String kcustomer = jText_kcustomer.getText();

        // Panggil metode untuk mendapatkan nama customer
        String namaCustomer = Koneksi.getNamaCustomer(kcustomer);

        // Set nama customer ke jText_ncustomer
        jText_ncustomer.setText(namaCustomer);
    }

    private void daftar_barangMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String kbarang = jText_kdBarang.getText();
        String[] sementara = Koneksi.getNamaBarang(kbarang);
        jText_namabarang.setText(sementara[0]);
        jText_harga.setText(sementara[1]);
    }

    private void TambahMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        hr = parseInt(jText_harga.getText());
        jml = parseInt(jText_jumlah.getText());
        stotal = hr * jml;
        jText_subtotal.setText(String.valueOf(stotal));
        //get data
        kbarang = jText_kdBarang.getText();
        nbarang = jText_namabarang.getText();
        harga = jText_harga.getText();
        jumlah = jText_jumlah.getText();
        subtotal = jText_subtotal.getText();
//        Koneksi.insertJualBarang(kbarang, nbarang, harga, jumlah, subtotal);
    }

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        nnota = jText_nota.getText();
        kcustomer = jText_kcustomer.getText();
        ncustomer = jText_ncustomer.getText();
        kbarang = jText_kdBarang.getText();
        nbarang = jText_namabarang.getText();
        harga = jText_harga.getText();
        jumlah = jText_jumlah.getText();
        subtotal = jText_subtotal.getText();
        total = jText_total.getText();
        pembayaran = jText_pembayaran.getText();
        kembalian = jText_kembalian.getText();

        Koneksi.insertDataTransaksi(kbarang, kcustomer, ncustomer, nbarang, harga, jumlah, subtotal, nnota, total, pembayaran, kembalian);
        jText_nota.setText("");
        jText_kcustomer.setText("");
        jText_ncustomer.setText("");
        jText_kdBarang.setText("");
        jText_namabarang.setText("");
        jText_harga.setText("");
        jText_jumlah.setText("");
        jText_subtotal.setText("");
        jText_total.setText("");
        jText_pembayaran.setText("");
        jText_kembalian.setText("");

    }

    private void NoBaruMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        nnota = jText_nota.getText();
        if(Koneksi.checkDataNotaTransaksi(nnota)){
            System.out.println("Kode barang sudah ada");
            JOptionPane.showMessageDialog(this, "No nota sudah ada");
        }else{
            JOptionPane.showMessageDialog(this, "No nota belum ada");
        }
        jText_kcustomer.setText("");
    }

    private void hitungMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        ttl = Integer.parseInt(jText_total.getText());
        pmb = Integer.parseInt(jText_pembayaran.getText());
        stotal1 = pmb - ttl;
        jText_kembalian.setText(Integer.toString(stotal1));
    }

    private void masukandataMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        //mengambil data dari jtext
        kbarang = jText_kdBarang.getText();
        nbarang = jText_namabarang.getText();
        harga = jText_harga.getText();
        jumlah = jText_jumlah.getText();
        subtotal = jText_subtotal.getText();
        // Menambahkan data ke tabel
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{kbarang, nbarang, harga, jumlah, subtotal});
        int rowCount = model.getRowCount();
        int total = 0;

        for (int i = 0; i < rowCount; i++) {
            // Ambil nilai subtotal dari kolom ke-4 (indeks 3)
            String subtotalStr = model.getValueAt(i, 4).toString();
            // Konversi nilai subtotal menjadi double
            int subtotal = Integer.parseInt(subtotalStr);
            // Tambahkan ke total
            total += subtotal;
        }
        // Set nilai total ke jText_total
        jText_total.setText(String.valueOf(total));
    }

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransaksiPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiPenjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton NoBaru;
    private javax.swing.JScrollPane Table;
    private javax.swing.JButton Tambah;
    private javax.swing.JButton cancel;
    private javax.swing.JButton daftar_barang;
    private javax.swing.JButton daftar_customer;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel_Customer;
    private javax.swing.JLabel jLabel_DetailPenjualan;
    private javax.swing.JLabel jLabel_Harga;
    private javax.swing.JLabel jLabel_Jumlah;
    private javax.swing.JLabel jLabel_Kembalian;
    private javax.swing.JLabel jLabel_KodeBarang;
    private javax.swing.JLabel jLabel_KodeCustomer;
    private javax.swing.JLabel jLabel_NamaBarang;
    private javax.swing.JLabel jLabel_NamaCustomer;
    private javax.swing.JLabel jLabel_NoNota;
    private javax.swing.JLabel jLabel_Pembayaran;
    private javax.swing.JLabel jLabel_Subtotal;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jText_harga;
    private javax.swing.JTextField jText_jumlah;
    private javax.swing.JTextField jText_kcustomer;
    private javax.swing.JTextField jText_kdBarang;
    private javax.swing.JTextField jText_kembalian;
    private javax.swing.JTextField jText_namabarang;
    private javax.swing.JTextField jText_ncustomer;
    private javax.swing.JTextField jText_nota;
    private javax.swing.JTextField jText_pembayaran;
    private javax.swing.JTextField jText_subtotal;
    private javax.swing.JTextField jText_total;
    private javax.swing.JButton masukandata;
    private javax.swing.JButton save;
    // End of variables declaration
}
