import java.util.Date;

public class Pengembalian {
    private int id_pengembalian;
    private Date tanggal_kembali;
    private int keterlambatan;
    private int id_peminjaman;

    public Pengembalian(int id_pengembalian, Date tanggal_kembali,
                        int keterlambatan, int id_peminjaman) {
        this.id_pengembalian = id_pengembalian;
        this.tanggal_kembali = tanggal_kembali;
        this.keterlambatan = keterlambatan;
        this.id_peminjaman = id_peminjaman;
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
}

