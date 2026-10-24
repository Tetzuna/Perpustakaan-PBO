public class Mahasiswa {
    private int id_mahasiswa;
    private String nama_mahasiswa;
    private String nim;
    private String jurusan;
    private int kuota_pinjam;

    public Mahasiswa(int id_mahasiswa, String nama_mahasiswa,
        String nim, String jurusan, int kuota_pinjam) {
        this.id_mahasiswa = id_mahasiswa;
        this.nama_mahasiswa = nama_mahasiswa;
        this.nim = nim;
        this.jurusan = jurusan;
        this.kuota_pinjam = kuota_pinjam;
    }

    public void tambahMahasiswa() {
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void ubahMahasiswa() {
        System.out.println("Data mahasiswa berhasil diubah.");
    }

    public void hapusMahasiswa() {
        System.out.println("Mahasiswa berhasil dihapus.");
    }

    public void cariMahasiswa() {
        System.out.println("Nama: " + nama_mahasiswa);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public int getIdMahasiswa() {
        return id_mahasiswa;
    }

    public String getNamaMahasiswa() {
        return nama_mahasiswa;
    }

    public int getKuotaPinjam() {
        return kuota_pinjam;
    }

    public void setKuotaPinjam(int kuota_pinjam) {
        this.kuota_pinjam = kuota_pinjam;
    }
}
