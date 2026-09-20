# SISTEM PENYEWAAN ALAT CAMPING

## 1. Identitas Mahasiswa

**Nama:** Meilanie  
**NIM:** 2509116109  
**Mata Kuliah:** Pemrograman Berorientasi Objek

---

## 2. Deskripsi Studi Kasus

Sistem Penyewaan Alat Camping merupakan program berbasis konsol yang dibuat untuk membantu proses penyewaan alat camping.

Program ini digunakan untuk mengelola data alat camping, data pelanggan, serta menghitung biaya penyewaan berdasarkan lama waktu penyewaan.

Program dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO).

---

## 3. Hierarki Class

Hierarki class yang digunakan dalam program ini adalah:


                 AlatCamping
                 /         \
                /           \
             Tenda      PeralatanMasak

              Pelanggan

          ManajemenCamping
                 |
                Main

AlatCamping merupakan superclass.

Tenda dan PeralatanMasak merupakan subclass dari AlatCamping.

Pelanggan digunakan untuk menyimpan data pelanggan.

ManajemenCamping digunakan untuk mengelola data alat dan pelanggan.

Main merupakan class utama untuk menjalankan program.


---

## 4. Hierarki Class Inheritance

Inheritance diterapkan pada class Tenda dan PeralatanMasak yang merupakan turunan dari class AlatCamping.

Contoh penerapan inheritance:

public class Tenda extends AlatCamping

dan:

public class PeralatanMasak extends AlatCamping

Dengan inheritance, class Tenda dan PeralatanMasak dapat menggunakan atribut dan method yang berasal dari class AlatCamping.

Selain inheritance, program juga menerapkan polymorphism melalui method getJenis() dan tampilkanInfo() yang dioverride pada subclass.


---

## 5. Class yang Digunakan

- AlatCamping

  Merupakan superclass yang digunakan sebagai dasar untuk data alat camping.

  Class ini menyimpan data seperti kode alat, nama alat, dan harga sewa per hari.

- Tenda

  Merupakan subclass dari AlatCamping yang digunakan untuk mengelola data tenda.

  Class ini memiliki data tambahan berupa kapasitas tenda dalam jumlah orang.

- PeralatanMasak

  Merupakan subclass dari AlatCamping yang digunakan untuk mengelola data peralatan memasak.

  Class ini memiliki data tambahan berupa jenis bahan bakar.

- Pelanggan

  Digunakan untuk menyimpan data pelanggan yang melakukan penyewaan.

  Data yang disimpan meliputi ID pelanggan, nama, dan nomor HP.

- ManajemenCamping

  Digunakan untuk mengelola data alat camping dan data pelanggan.

  Class ini juga digunakan untuk mencari data serta menghitung total biaya penyewaan.

- Main

  Merupakan class utama yang digunakan untuk menjalankan program melalui console.

  Class ini berisi menu yang dapat dipilih oleh pengguna.


---

## 6. Fitur Program

Program memiliki beberapa fitur utama, yaitu:

1. Tambah Alat
Digunakan untuk menambahkan data alat camping.


2. Lihat Daftar Alat
Digunakan untuk melihat seluruh alat camping yang tersedia.


3. Tambah Pelanggan
Digunakan untuk menambahkan data pelanggan.


4. Lihat Daftar Pelanggan
Digunakan untuk melihat data pelanggan.


5. Hitung Biaya Sewa
Digunakan untuk menghitung total biaya berdasarkan harga sewa dan lama penyewaan.


6. Keluar
Digunakan untuk mengakhiri program.




---

## 7. Cara Menjalankan Program

1. Buka project SistemPenyewaanAlatCamping di NetBeans.


2. Jalankan program melalui Main.java.


3. Pilih menu yang tersedia.


4. Masukkan data alat camping.


5. Jika memilih jenis alat Tenda, masukkan kapasitas tenda.


6. Jika memilih Peralatan Masak, masukkan jenis bahan bakar.


7. Masukkan data pelanggan.


8. Pilih menu Hitung Biaya Sewa.


9. Masukkan ID pelanggan, kode alat, dan lama penyewaan.


10. Program akan menampilkan total biaya penyewaan.




---

## 8. Contoh Penggunaan

- Contoh Data Alat

  Kode alat: T001
  
  Nama alat: Tenda Dome
  
  Harga sewa: Rp50.000 per hari
  
  Jenis: Tenda
  
  Kapasitas: 4 orang


- Contoh Data Pelanggan

  ID pelanggan: P001
  
  Nama: Meilanie
  
  No. HP: 08123456789


- Contoh Perhitungan

  Jika tenda disewa selama 3 hari:
  
  Rp50.000 × 3 hari = Rp150.000
  
  Jadi total biaya penyewaan adalah:
  
  Rp150.000


---

## 9. Screenshot Program

Tampilan Menu Utama

<img width="389" height="178" alt="Screenshot 2026-09-20 211845" src="https://github.com/user-attachments/assets/0c48398f-7ad8-4c7b-bb3f-3c0d3c0860b0" />

Tampilan Tambah Alat

<img width="380" height="143" alt="Screenshot 2026-09-20 211901" src="https://github.com/user-attachments/assets/9041171c-cf20-4c5f-a0bb-2e4a06f19e95" />

Tampilan Hasil Penyewaan

<img width="365" height="188" alt="Screenshot 2026-09-20 211926" src="https://github.com/user-attachments/assets/1486a8d2-0742-4b7e-8bc9-b9ab661f47df" />

## 10. Konsep PBO yang Diterapkan

Program ini menerapkan beberapa konsep Pemrograman Berorientasi Objek, yaitu:

- Inheritance

  Inheritance digunakan pada class Tenda dan PeralatanMasak yang mewarisi class AlatCamping.

- Polymorphism

  Polymorphism diterapkan melalui method getJenis() dan tampilkanInfo() yang dioverride pada class Tenda dan         PeralatanMasak.

- Encapsulation

  Encapsulation diterapkan dengan menggunakan atribut private dan method untuk mengakses data tertentu.

- ArrayList

  ArrayList digunakan untuk menyimpan daftar alat camping dan daftar pelanggan.


---

## 11. Teknologi yang Digunakan

Bahasa Pemrograman: Java

Konsep: Pemrograman Berorientasi Objek (PBO)

IDE: NetBeans

Repository: GitHub

Struktur Data: ArrayList



---

## 12. Repository

Source code program Sistem Penyewaan Alat Camping tersedia pada repository GitHub ini.

Program dibuat sebagai tugas mata kuliah Pemrograman Berorientasi Objek dengan menerapkan konsep dasar PBO seperti inheritance, polymorphism, encapsulation, dan penggunaan ArrayList.

---

## 13. Kesimpulan

Sistem Penyewaan Alat Camping merupakan program sederhana berbasis Java yang dibuat untuk membantu mengelola data alat camping, pelanggan, dan proses penyewaan.

Program ini menerapkan konsep Pemrograman Berorientasi Objek seperti inheritance, polymorphism, encapsulation, dan penggunaan ArrayList.

Dengan adanya program ini, proses pencatatan data alat, data pelanggan, serta perhitungan biaya penyewaan dapat dilakukan dengan lebih mudah dan terstruktur.
