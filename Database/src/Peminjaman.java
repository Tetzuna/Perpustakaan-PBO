import java.util.Date;

public class Peminjaman {
    private int id_peminjaman;
    private int id_mahasiswa;
    private int id_buku;
    private Date tanggal_pinjam;
    private Date tanggal_harus_kembali;
    private String status;

    public Peminjaman(int id_peminjaman, int id_mahasiswa, int id_buku, Date tanggal_pinjam, Date tanggal_harus_kembali,
            String status) {
        this.id_peminjaman = id_peminjaman;
        this.id_mahasiswa = id_mahasiswa;
        this.id_buku = id_buku;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_harus_kembali = tanggal_harus_kembali;
        this.status = status;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }

    public Date getTanggal_pinjam() {
        return tanggal_pinjam;
    }

    public void setTanggal_pinjam(Date tanggal_pinjam) {
        this.tanggal_pinjam = tanggal_pinjam;
    }

    public Date getTanggal_harus_kembali() {
        return tanggal_harus_kembali;
    }

    public void setTanggal_harus_kembali(Date tanggal_harus_kembali) {
        this.tanggal_harus_kembali = tanggal_harus_kembali;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId_mahasiswa() {
        return id_mahasiswa;
    }

    public void setId_mahasiswa(int id_mahasiswa) {
        this.id_mahasiswa = id_mahasiswa;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    @Override
    public String toString() {
        return String.format("| %d | %d | %d | %s | %s | %s |", id_peminjaman, id_mahasiswa, id_buku, tanggal_pinjam,
                tanggal_harus_kembali, status);
    }
}