# Testing with JUnit - Maven Project

## Deskripsi
Proyek ini adalah aplikasi yang menggunakan JUnit untuk melakukan pengujian unit terhadap aplikasi. Anda dapat mengkloning repositori ini dan menjalankan aplikasi serta pengujian unit dengan menggunakan Maven.

## Persyaratan
- Java 8 atau lebih baru
- Maven 3.x atau lebih baru

## Langkah-langkah untuk Menjalankan Aplikasi

1. Clone Repositori

   ```bash
   git clone https://github.com/Ferdiahmad3404/testing-with-junit.git
   ```

2. Masuk ke Direktori Proyek

   ```bash
   cd testing-with-junit
   ```

3. Jalankan Aplikasi

   ```bash
   mvn clean install
   ```

## Menjalankan Unit Test

```bash
mvn clean test -P <nama-unit>
```

Contoh:

```bash
mvn clean test -P tambahOperator
```

## Kontribusi
Silakan fork dan kirimkan pull request jika ingin berkontribusi.

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).
