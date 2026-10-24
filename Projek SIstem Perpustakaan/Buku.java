public class Buku {
    private  int idBuku;
    private String judulBuku;
    private String pengarang;
    private String isbn;
    private int stok;
    private int idJenis;
    
    public Buku(int idBuku, String judulBuku, String pengarang, String isbn, int stok, int idJenis) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.isbn = isbn;
        this.stok = stok;
        this.idJenis = idJenis;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getidJenis() {
        return idJenis;
    }

    public void setidJenis(int idJenis) {
        this.idJenis = idJenis;
    }

}
