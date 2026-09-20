public class AlatCamping {
    protected String kode;
    protected String nama;
    protected double hargaSewa;

    public AlatCamping(String kode, String nama, double hargaSewa) {
        this.kode = kode;
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getJenis() {
        return "Alat Camping";
    }

    public void tampilkanInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Harga/Hari : Rp" + hargaSewa);
        System.out.println("Jenis      : " + getJenis());
    }
}
