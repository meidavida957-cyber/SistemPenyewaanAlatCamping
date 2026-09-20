public class Tenda extends AlatCamping {
    private int kapasitas;

    public Tenda(String kode, String nama, double hargaSewa, int kapasitas) {
        super(kode, nama, hargaSewa);
        this.kapasitas = kapasitas;
    }

    @Override
    public String getJenis() {
        return "Tenda";
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas  : " + kapasitas + " orang");
    }
}
