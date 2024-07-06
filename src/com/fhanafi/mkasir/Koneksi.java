package com.fhanafi.mkasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Koneksi {
    private static Connection conn;
    private static final Logger logger = Logger.getLogger(Koneksi.class.getName());

    public static Connection getConnection() {
        try {
            String db = "toko";
            String url = "jdbc:mysql://localhost:3306/"+ db;  // Corrected JDBC URL
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to create the database connection.", e);
        }
        return conn;
    }

    public static String getNamaCustomer(String kcustomer) {
        Connection conn = getConnection();
        String sqlget = "SELECT nama_customer FROM customer WHERE kode_customer = ?";
        String namaCustomer = "";
        try {
            PreparedStatement stmt = conn.prepareStatement(sqlget);
            stmt.setString(1, kcustomer);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                namaCustomer = rs.getString("nama_customer");
            }
            rs.close();
            stmt.close(); // Tutup statement setelah digunakan
            conn.close(); // Tutup koneksi setelah selesai
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to fetch customer data from database.", e);
        }
        return namaCustomer;
    }

    public static String[] getNamaBarang(String kbarang) {
        Connection conn = getConnection();
        String sqlget = "SELECT nama_barang, harga_satuan FROM barang WHERE kode_barang = ?";
        String namaBarang = "";
        String hargaBarang = ""; //Harga barang pada koneksi tidak terbaca statement nya dikarenakan return yang gk kebaca
        ArrayList<String[]> sementara = new ArrayList<>();

        try {
            PreparedStatement stmt = conn.prepareStatement(sqlget);
            stmt.setString(1, kbarang);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                namaBarang = rs.getString("nama_barang");
                hargaBarang = rs.getString("harga_satuan");
            }
            rs.close();
            stmt.close(); // Tutup statement setelah digunakan
            conn.close(); // Tutup koneksi setelah selesai

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to fetch customer data from database.", e);
        }

        return new String[]{namaBarang, hargaBarang}; // apa bisa mengembalikan 2 return ???
    }
    public static boolean checkDataNotaTransaksi(String nnota){
        Connection conn = getConnection();
        String sqlcdnt = "SELECT * FROM transaksi WHERE no_nota = ?";
        try{
            PreparedStatement stmtcdnt = conn.prepareStatement(sqlcdnt);
            stmtcdnt.setString(1, nnota);
            ResultSet resultSet = stmtcdnt.executeQuery();
            return resultSet.next();
        }catch(SQLException e){
            logger.log(Level.SEVERE, "Failed to execute query.", e);
        }
        return false;
    }

    public static boolean checkDataLogin(String id, String pass){
        Connection conn = getConnection();
        if (conn != null) {
            String sql = "SELECT * FROM user WHERE user_id = ? AND password = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, pass);
                ResultSet resultSet = preparedStatement.executeQuery();
                return resultSet.next();
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "Failed to execute query.", e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    logger.log(Level.SEVERE, "Failed to close the database connection.", e);
                }
            }
        }
        return false;
    }

    public static void deleteMasterData(String kcustomer, String kbarang, boolean MasterDelete){
        Connection conn = getConnection();
        String querykc = "DELETE FROM customer WHERE kode_customer = ?";
        String querykb = "DELETE FROM barang WHERE kode_barang = ?";
        try (PreparedStatement stmtkc = conn.prepareStatement(querykc);
             PreparedStatement stmtkb = conn.prepareStatement(querykb)){

            if(MasterDelete){
                stmtkc.setString(1, kcustomer);
                int rowsAffected = stmtkc.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data deleted successfully.");
                } else {
                    System.out.println("Data Tidak ditemukan.");
                }
            }else{
                stmtkb.setString(1, kbarang);
                int rowsAffected = stmtkb.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Data deleted successfully.");
                } else {
                    System.out.println("Data Tidak ditemukan.");
                }
            }

        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to delete data.", e);
        }
    }

    public static boolean checkMasterData(String kbarang, String kcustomer, boolean checkMasterData){
        Connection conn = getConnection();
        String sqlcdb = "SELECT * FROM barang WHERE kode_barang = ?";
        String sqlcdc = "SELECT * FROM customer WHERE kode_customer = ?";
        try(PreparedStatement stmtcdb = conn.prepareStatement(sqlcdb);
            PreparedStatement stmtcdc = conn.prepareStatement(sqlcdc)){

            if(checkMasterData){
                stmtcdb.setString(1, kbarang);
                ResultSet resultSet = stmtcdb.executeQuery();
                return resultSet.next();
            }else{
                stmtcdc.setString(1, kcustomer);
                ResultSet resultSet = stmtcdc.executeQuery();
                return resultSet.next();
            }
        }catch (SQLException e){
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
        return false;
    }

    public static boolean insertDataLogin(String user_id,String pass) {
        Connection conn = getConnection();
        if (conn != null) {
            String sqlInsert = "INSERT INTO user (user_id, password) VALUES (?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(sqlInsert)){
                stmt.setString(1, user_id);
                stmt.setString(2, pass);
                int rowsInserted = stmt.executeUpdate();
                return rowsInserted > 0;
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "Failed to insert data into database.", e);
            } finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    logger.log(Level.SEVERE, "Failed to close the database connection.", e);
                }
            }
        }
        return false;
    }

    public static void insertDataTransaksi(String kbarang, String kcustomer,String ncustomer,String nbarang,String harga,String jumlah,String subtotal,String nnota,String total,String pembayaran,String kembalian){
        Connection conn = getConnection();
        String sqlSaveBarang = "INSERT INTO transaksi (no_nota, kode_customer, nama_customer, total, pembayaran, kembalian) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sqlSaveBarang)) {
            /* statement kebanyakan hanya mengambil dari cutomer, no nota dan rincian pembayaran seperti
             total, pembayaran, kembalian */
            stmt.setString(1, nnota);
            stmt.setString(2, kcustomer);
            stmt.setString(3, ncustomer);
            stmt.setString(4, total);
            stmt.setString(5, pembayaran);
            stmt.setString(6, kembalian);
            stmt.executeUpdate();
            System.out.println("Data telah berhasil dimasukan.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
    }

    public static void insertDataBarang(String kbarang,String nbarang, String satuan, String hsatuan, String stockbarang){
        Connection conn = getConnection();
        String sqlSaveBarang = "INSERT INTO barang(kode_barang, nama_barang, satuan, harga_satuan, stock_barang) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sqlSaveBarang)) {
            stmt.setString(1, kbarang);
            stmt.setString(2, nbarang);
            stmt.setString(3, satuan);
            stmt.setString(4, hsatuan);
            stmt.setString(5, stockbarang);
            stmt.executeUpdate();
            System.out.println("Data telah berhasil dimasukan.");
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
    }

    public static void insertDataCustomer(String kcustomer, String ncustomer, String acustomer, String noTelp, String email){
        Connection conn = getConnection();
        String sqlSaveCus = "INSERT INTO customer (kode_customer, nama_customer, alamat_customer, no_tlp, email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmtdc = conn.prepareStatement(sqlSaveCus)){
            stmtdc.setString(1, kcustomer);
            stmtdc.setString(2, ncustomer);
            stmtdc.setString(3, acustomer);
            stmtdc.setString(4, noTelp);
            stmtdc.setString(5, email);
            stmtdc.executeUpdate();
            System.out.println("Data telah berhasil dimasukan.");
        }catch (SQLException e){
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
    }

    public static void insertJualBarang(String kbarang, String nbarang, String harga, String jumlah, String subtotal){
        Connection conn = getConnection();
        String sqldjb = "INSERT INTO detailjualbarang (kode_barang, nama_barang, harga, jumlah, subtotal) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmtdjb = conn.prepareStatement(sqldjb)){
            stmtdjb.setString(1, kbarang);
            stmtdjb.setString(2, nbarang);
            stmtdjb.setString(3, harga);
            stmtdjb.setString(4, jumlah);
            stmtdjb.setString(5, subtotal);
            stmtdjb.executeUpdate();
            System.out.println("Data telah berhasil dimasukan.");
        }catch (SQLException e){
            logger.log(Level.SEVERE, "Failed to insert data.", e);
        }
    }
}