import java.util.ArrayList;

public class ManajemenCamping {
    private ArrayList<AlatCamping> daftarAlat;
    private ArrayList<Pelanggan> daftarPelanggan;

    public ManajemenCamping() {
        daftarAlat = new ArrayList<>();
        daftarPelanggan = new ArrayList<>();
    }

    public void tambahAlat(AlatCamping alat) {
        daftarAlat.add(alat);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void tampilkanAlat() {
        if (daftarAlat.isEmpty()) {
            System.out.println("Belum ada alat yang tersedia.");
            return;
        }

        System.out.println("\n=== DAFTAR ALAT CAMPING ===");
        for (AlatCamping alat : daftarAlat) {
            alat.tampilkanInfo();
            System.out.println("----------------------------");
        }
    }

    public void tampilkanPelanggan() {
        if (daftarPelanggan.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
            return;
        }

        System.out.println("\n=== DAFTAR PELANGGAN ===");
        for (Pelanggan pelanggan : daftarPelanggan) {
            pelanggan.tampilkanInfo();
            System.out.println("------------------------");
        }
    }

    public AlatCamping cariAlat(String kode) {
        for (AlatCamping alat : daftarAlat) {
            if (alat.getKode().equalsIgnoreCase(kode)) {
                return alat;
            }
        }
        return null;
    }

    public Pelanggan cariPelanggan(String id) {
        for (Pelanggan pelanggan : daftarPelanggan) {
            if (pelanggan.getIdPelanggan().equalsIgnoreCase(id)) {
                return pelanggan;
            }
        }
        return null;
    }

    public void hitungSewa(String idPelanggan, String kodeAlat, int lamaSewa) {
        Pelanggan pelanggan = cariPelanggan(idPelanggan);
        AlatCamping alat = cariAlat(kodeAlat);

        if (pelanggan == null) {
            System.out.println("Pelanggan tidak ditemukan.");
            return;
        }

        if (alat == null) {
            System.out.println("Alat tidak ditemukan.");
            return;
        }

        double total = alat.getHargaSewa() * lamaSewa;

        System.out.println("\n=== DETAIL PENYEWAAN ===");
        System.out.println("Pelanggan : " + pelanggan.getNama());
        System.out.println("Alat      : " + alat.getNama());
        System.out.println("Lama sewa : " + lamaSewa + " hari");
        System.out.println("Total     : Rp" + total);
    }
}
