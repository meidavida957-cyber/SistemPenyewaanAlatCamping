import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenCamping sistem = new ManajemenCamping();

        int pilihan;

        do {
            System.out.println("\n====================================");
            System.out.println(" SISTEM PENYEWAAN ALAT CAMPING");
            System.out.println("====================================");
            System.out.println("1. Tambah Alat");
            System.out.println("2. Lihat Daftar Alat");
            System.out.println("3. Tambah Pelanggan");
            System.out.println("4. Lihat Daftar Pelanggan");
            System.out.println("5. Hitung Biaya Sewa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== TAMBAH ALAT ===");
                    System.out.print("Kode alat: ");
                    String kode = input.nextLine();

                    System.out.print("Nama alat: ");
                    String nama = input.nextLine();

                    System.out.print("Harga sewa per hari: ");
                    double harga = input.nextDouble();

                    System.out.println("1. Tenda");
                    System.out.println("2. Peralatan Masak");
                    System.out.print("Pilih jenis: ");
                    int jenis = input.nextInt();
                    input.nextLine();

                    if (jenis == 1) {
                        System.out.print("Kapasitas orang: ");
                        int kapasitas = input.nextInt();
                        input.nextLine();

                        sistem.tambahAlat(
                            new Tenda(kode, nama, harga, kapasitas)
                        );
                    } else {
                        System.out.print("Bahan bakar: ");
                        String bahanBakar = input.nextLine();

                        sistem.tambahAlat(
                            new PeralatanMasak(kode, nama, harga, bahanBakar)
                        );
                    }

                    System.out.println("Alat berhasil ditambahkan.");
                    break;

                case 2:
                    sistem.tampilkanAlat();
                    break;

                case 3:
                    System.out.println("\n=== TAMBAH PELANGGAN ===");
                    System.out.print("ID pelanggan: ");
                    String id = input.nextLine();

                    System.out.print("Nama: ");
                    String namaPelanggan = input.nextLine();

                    System.out.print("No. HP: ");
                    String noHp = input.nextLine();

                    sistem.tambahPelanggan(
                        new Pelanggan(id, namaPelanggan, noHp)
                    );

                    System.out.println("Pelanggan berhasil ditambahkan.");
                    break;

                case 4:
                    sistem.tampilkanPelanggan();
                    break;

                case 5:
                    System.out.println("\n=== HITUNG BIAYA SEWA ===");
                    System.out.print("ID pelanggan: ");
                    String idPelanggan = input.nextLine();

                    System.out.print("Kode alat: ");
                    String kodeAlat = input.nextLine();

                    System.out.print("Lama sewa (hari): ");
                    int lamaSewa = input.nextInt();
                    input.nextLine();

                    sistem.hitungSewa(idPelanggan, kodeAlat, lamaSewa);
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
}