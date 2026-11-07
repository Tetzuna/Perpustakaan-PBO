import java.sql.*;

import Model.Mahasiswa;
public class Main {
    static String url = "jdbc:postgresql://pgsql-dbas-jkt1-006.sumobase.my.id:6432/db6c78b45dc098e018?user=uIc5dgICS2yNG52Og.jkt1_006&password=d6f48a618753914c03af736a";
    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(url)) {
            tampilkanBuku(con);
            tampilkanjenisBuku(con);
            tampilkanMahasiswa(con);
            tampilkanPeminjaman(con);
            tampilkanPengembalian(con);
        } catch (SQLException ex) {
            System.err.println("Akses database gagal: " + ex.getSQLState() + " - " + ex.getMessage());
        }
    }

    // =======================[ Tabel Buku ]=======================
    public static void tampilkanBuku(Connection con) throws SQLException {
        System.out.println("=============== TABEL BUKU ===============");
        System.out.println("| id_buku | judulBuku | pengarang | isbn | stok | idjenis |");
        try (
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM perpustakaandb.buku;")) {
            // ps.setInt(1, 101);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Buku b = new Buku(
                    rs.getInt("id_buku"),
                    rs.getString("judulBuku"),
                    rs.getString("pengarang"),
                    rs.getString("isbn"),
                    rs.getInt("stok"),
                    rs.getInt("idjenis"));
                System.out.println(b);
            }
            System.out.println("");
        }
        } catch (SQLException ex) {
        System.err.println("Akses database gagal: " + ex.getSQLState());
        }
    }

    // =======================[ Tabel Buku ]=======================
    public static void tampilkanjenisBuku(Connection con) throws SQLException {
        System.out.println("=============== TABEL JENIS BUKU ===============");
        System.out.println("| idjenis | namaJenis | keterangan |");
        try (
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM perpustakaandb.jenisbuku;")) {
            // ps.setInt(1, 101);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                JenisBuku j = new JenisBuku(
                    rs.getInt("idjenis"),
                    rs.getString("namaJenis"),
                    rs.getString("keterangan"));
                System.out.println(j);
            }
            System.out.println("");
        }
        } catch (SQLException ex) {
        System.err.println("Akses database gagal: " + ex.getSQLState());
        }
    }
    // =======================[ Tabel Mahasiswa ]=======================
    public static void tampilkanMahasiswa(Connection con) throws SQLException {
        System.out.println("=============== TABEL MAHASISWA ===============");
        System.out.println("| id_mahasiswa | nim | nama_mahasiswa | jurusan | kuota_pinjam |");
        try (
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM perpustakaandb.mahasiswa;")) {
            // ps.setInt(1, 101);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                    rs.getInt("id_mahasiswa"),
                    rs.getString("nim"),
                    rs.getString("nama_mahasiswa"),
                    rs.getString("jurusan"),
                    rs.getInt("kuota_pinjam"));
                System.out.println(m);
            }
            System.out.println("");
        }
        } catch (SQLException ex) {
        System.err.println("Akses database gagal: " + ex.getSQLState());
        }
    }
    
    // =======================[ Tabel Peminjaman ]=======================
    public static void tampilkanPeminjaman(Connection con) throws SQLException {
        System.out.println("=============== TABEL PEMINJAMAN ===============");
        System.out.println("| id_peminjaman | id_mahasiswa | id_buku | tanggal_peminjaman | tanggal_pengembalian | status |");
        try (
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM perpustakaandb.peminjaman;")) {
            // ps.setInt(1, 101);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Peminjaman p = new Peminjaman(
                    rs.getInt("id_peminjaman"),
                    rs.getInt("id_mahasiswa"),
                    rs.getInt("id_buku"),
                    rs.getDate("tanggal_peminjaman"),
                    rs.getDate("tanggal_pengembalian"),
                    rs.getString("status"));
                System.out.println(p);
            }
            System.out.println("");
        }
        } catch (SQLException ex) {
        System.err.println("Akses database gagal: " + ex.getSQLState());
        }
    }

    // =======================[ Tabel Pengembalian ]=======================
    public static void tampilkanPengembalian(Connection con) throws SQLException {
        System.out.println("=============== TABEL PENGEMBALIAN ===============");
        System.out.println("| id_pengembalian | id_peminjaman | tanggal_pengembalian | keterlambatan | denda |");
        try (
            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM perpustakaandb.pengembalian;")) {
            // ps.setInt(1, 101);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Pengembalian p = new Pengembalian(
                    rs.getInt("id_pengembalian"),
                    rs.getInt("id_peminjaman"),
                    rs.getDate("tanggal_pengembalian"),
                    rs.getInt("keterlambatan"),
                    rs.getDouble("denda"));
                System.out.println(p);
            }
            System.out.println("");
        }
        } catch (SQLException ex) {
        System.err.println("Akses database gagal: " + ex.getSQLState());
        }
    }
}