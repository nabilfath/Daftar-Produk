Aplikasi Daftar Produk Toko

Aplikasi Daftar Produk Toko adalah aplikasi desktop berbasis JavaFX
untuk membantu pengguna mengelola dan melihat data produk toko melalui
antarmuka sederhana.

Fitur Aplikasi

-   Menambahkan data produk.
-   Mengisi nama, kategori, dan harga produk.
-   Membuat kode produk secara otomatis.
-   Menampilkan daftar produk dalam bentuk tabel.
-   Mencari produk berdasarkan nama.
-   Melihat detail produk yang dipilih.
-   Berpindah antara halaman form produk, daftar produk, dan detail
    produk.

Teknologi yang Digunakan

-   Java 17 --- bahasa pemrograman.
-   JavaFX 21 --- pembuatan antarmuka aplikasi.
-   FXML --- penyusunan tampilan.
-   CSS --- pengaturan tampilan antarmuka.
-   Apache Maven --- pengelolaan project dan dependensi.
-   Apache NetBeans IDE --- lingkungan pengembangan.

Persyaratan

Sebelum menjalankan aplikasi, pastikan perangkat sudah memiliki:
-   JDK 17 atau versi yang lebih baru.
-   Apache NetBeans IDE atau Maven.
-   Koneksi internet saat pertama kali Maven mengunduh dependensi
    project.

 Cara Menjalankan Aplikasi melalui NetBeans

1.  Unduh atau clone repository dari GitHub.
2.  Ekstrak file project jika diunduh dalam format ZIP.
3.  Buka Apache NetBeans IDE.
4.  Pilih File → Open Project.
5.  Pilih folder utama project yang berisi file `pom.xml`.
6.  Tunggu sampai NetBeans selesai memuat dependensi Maven.
7.  Klik kanan nama project, kemudian pilih Run.

Cara Menjalankan melalui Terminal

Buka terminal pada folder utama project yang berisi `pom.xml`, lalu
jalankan perintah:

``` bash
mvn clean javafx:run
```
Catatan

Pada versi project ini, data produk disimpan sementara di dalam memori
aplikasi. Data tidak tersimpan secara permanen dan akan hilang ketika
aplikasi ditutup.
