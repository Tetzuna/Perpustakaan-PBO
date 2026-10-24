public class JenisBuku {
    private int idJenis;
    private String namaJenis;
    private String keterangan;

    public JenisBuku(int idJenis, String namaJenis, String keterangan) {
        this.idJenis = idJenis;
        this.namaJenis = namaJenis;
        this.keterangan = keterangan;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(int idJenis) {
        this.idJenis = idJenis;
    }

    public String getNamaJenis() {
        return namaJenis;
    }

    public void setNamaJenis(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
        
}
