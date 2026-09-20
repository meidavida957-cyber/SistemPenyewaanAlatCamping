public class PeralatanMasak extends AlatCamping {
    private String bahanBakar;

    public PeralatanMasak(String kode, String nama, double hargaSewa, String bahanBakar) {
        super(kode, nama, hargaSewa);
        this.bahanBakar = bahanBakar;
    }

    @Override
    public String getJenis() {
        return "Peralatan Masak";
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bahan Bakar: " + bahanBakar);
    }
}
