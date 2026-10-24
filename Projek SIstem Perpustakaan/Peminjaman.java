import java.util.Date;

public class Peminjaman {
    private int id_peminjaman;
    private Date tanggal_pinjam;
    private Date tanggal_harus_kembali;
    private String status;
    private int id_mahasiswa;
    private int id_buku;

    public Peminjaman(int id_peminjaman, Date tanggal_pinjam,
                      Date tanggal_harus_kembali, String status,
                      int id_mahasiswa, int id_buku) {
        this.id_peminjaman = id_peminjaman;
        this.tanggal_pinjam = tanggal_pinjam;
        this.tanggal_harus_kembali = tanggal_harus_kembali;
        this.status = status;
        this.id_mahasiswa = id_mahasiswa;
        this.id_buku = id_buku;
    }

    public void buatPeminjaman() {
        System.out.println("Peminjaman berhasil dibuat.");
    }

    public void validasiPinjam() {
        System.out.println("Peminjaman berhasil divalidasi.");
    }

    public void simpanPinjam() {
        System.out.println("Data peminjaman berhasil disimpan.");
    }
}

