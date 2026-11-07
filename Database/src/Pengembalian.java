import java.util.Date;

public class Pengembalian {
    private int id_pengembalian;
    private int id_peminjaman;
    private Date tanggal_kembali;
    private int keterlambatan;
    private double denda;

    public Pengembalian(int id_pengembalian, int id_peminjaman, Date tanggal_kembali, int keterlambatan, double denda) {
        this.id_pengembalian = id_pengembalian;
        this.tanggal_kembali = tanggal_kembali;
        this.keterlambatan = keterlambatan;
        this.id_peminjaman = id_peminjaman;
        this.denda = denda;
    }

    public void buatPengembalian() {
        System.out.println("Pengembalian berhasil dibuat.");
    }

    public void hitungDenda() {
        int denda = keterlambatan * 1000;
        System.out.println("Total denda: Rp" + denda);
    }

    public void simpanKembali() {
        System.out.println("Data pengembalian berhasil disimpan.");
    }

    public int getId_pengembalian() {
        return id_pengembalian;
    }

    public void setId_pengembalian(int id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }

    public Date getTanggal_kembali() {
        return tanggal_kembali;
    }

    public void setTanggal_kembali(Date tanggal_kembali) {
        this.tanggal_kembali = tanggal_kembali;
    }

    public int getKeterlambatan() {
        return keterlambatan;
    }

    public void setKeterlambatan(int keterlambatan) {
        this.keterlambatan = keterlambatan;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    @Override
    public String toString() {
        return String.format("| %d | %d | %s | %d | %.2f |", id_pengembalian, id_peminjaman, tanggal_kembali, keterlambatan, denda);
    }
}

