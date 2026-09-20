# SISTEM PENYEWAAN ALAT CAMPING

## 1. Identitas Mahasiswa

**Nama:** Meilanie  
**NIM:** 2509116109  
**Mata Kuliah:** Pemrograman Berorientasi Objek

---

## 2. Deskripsi Studi Kasus

Sistem Penyewaan Alat Camping merupakan program berbasis konsol yang dibuat untuk membantu proses penyewaan alat camping.

Program ini dapat digunakan untuk mengelola data alat camping, data pelanggan, serta menghitung biaya penyewaan berdasarkan lama waktu penyewaan.

Program dibuat menggunakan bahasa pemrograman Java dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO).

---

## 3. Hierarki Class

Hierarki class yang digunakan dalam program ini adalah:

```text
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


---
Hierarki Class Inheritance

4. Hierarki Class Inheritance

Inheritance diterapkan pada class Tenda dan PeralatanMasak yang merupakan turunan dari class AlatCamping.

Contoh penerapan inheritance:

public class Tenda extends AlatCamping

dan:

public class PeralatanMasak extends AlatCamping

Dengan inheritance, class Tenda dan PeralatanMasak dapat menggunakan atribut dan method yang berasal dari class AlatCamping.


---

5. Class yang Digunakan

AlatCamping

Merupakan superclass yang digunakan sebagai dasar untuk data alat camping.

Tenda

Merupakan subclass dari AlatCamping yang digunakan untuk mengelola data tenda.

PeralatanMasak

Merupakan subclass dari AlatCamping yang digunakan untuk mengelola data peralatan memasak.

Pelanggan

Digunakan untuk menyimpan data pelanggan yang melakukan penyewaan.

ManajemenCamping

Digunakan untuk mengelola data alat camping dan data pelanggan.

Main

Merupakan class utama yang digunakan untuk menjalankan program melalui console.


---

6. Cara Menjalankan Program

1. Jalankan program melalui Main.java.


2. Pilih menu yang tersedia.


3. Masukkan data alat camping.


4. Masukkan data pelanggan.


5. Pilih menu penyewaan.


6. Masukkan lama penyewaan.


7. Program akan menghitung total biaya penyewaan.




---

7. Contoh Penggunaan

Contoh data alat:

Kode alat: T001

Nama alat: Tenda Dome

Harga sewa: Rp50.000 per hari

Kapasitas: 4 orang


Contoh data pelanggan:

ID pelanggan: P001

Nama: Meilanie

No. HP: 08123456789


Jika tenda disewa selama 3 hari:

Total biaya = Rp50.000 × 3 = Rp150.000


---

8. Screenshot Program

## Screenshot Program

### Tampilan Menu Utama
![Menu Utama](screenshot-menu.png)

### Tampilan Tambah Alat
![Tambah Alat](screenshot-tambah-alat.png)

### Tampilan Hasil Penyewaan
![Hasil Penyewaan](screenshot-penyewaan.png)

---

9. Repository

Source code program Sistem Penyewaan Alat Camping tersedia pada repository GitHub ini.
