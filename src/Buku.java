public class Buku {
    private String judul;
    private String pengarang;
    private int jumlah;

    private int tahun;
    public void setNilai(String judul,String pengarang,int jumlah,int tahun)
    {
        this.judul = judul;
        this.pengarang = pengarang;
        this.jumlah = jumlah;
        this.tahun = tahun;
    }
    void cetakKeLayar()
    {
        System.out.println("Judul : " + judul );
        System.out.println("Pengarang : " + pengarang );
        System.out.println("Jumlah : " + jumlah );
        System.out.println("tahun : " + tahun );
    }
}
