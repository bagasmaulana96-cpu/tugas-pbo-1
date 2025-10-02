# Tugas 1 Pemrograman Berorientasi Objek

**Matkul**: Pemrograman Berorientasi Objek
**Kelas**: A
**Dosen**: Sam Farisa Chaerul Haviana, ST., M.Kom
**Nama**: Muhammad Bagas Maulana
**Nim**: 32602400025

## Analisa Error Pada Code

| No  | Class        | Kesalahan                                                                                                                    | Perbaikan                                                                             |
| :-- | :----------- | :--------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------ |
| 1   | MakhlukHidup | Variabel nama menggunakan tipe data string (huruf kecil), padahal di Java seharusnya String (huruf kapital).                 | `private String nama;`                                                                |
| 2   | MakhlukHidup | Metode MakhlukHidup(String nama) dideklarasikan dengan void. Constructor seharusnya tidak memiliki return type.              | `public MakhlukHidup(String nama) {`                                                  |
| 3   | MakhlukHidup | Nama constructor makhlukHidup (huruf kecil) tidak cocok dengan nama class MakhlukHidup (huruf kapital).                      | `public MakhlukHidup(String nama, String jenis, int umur, double berat) {`            |
| 4   | MakhlukHidup | Urutan penugasan pada constructor (String nama, String jenis) terbalik.                                                      | `this.nama = nama; this.jenis = jenis;`                                               |
| 5   | MakhlukHidup | Pada copy constructor, this.nama tidak menyalin nilai dari objek sumber other.                                               | `this.nama = other.nama;`                                                             |
| 6   | MakhlukHidup | Pada copy constructor, this.umur tidak menyalin nilai dari objek sumber other.                                               | `this.umur = other.umur;`                                                             |
| 7   | MakhlukHidup | Metode setUmur menerima parameter String, padahal atribut umur bertipe int. Ini akan menyebabkan kesalahan tipe data.        | `public void setUmur(int umur) {`                                                     |
| 8   | MakhlukHidup | Logika pada metode setNama terbalik. Seharusnya this.nama diisi dengan nilai parameter nama.                                 | `this.nama = nama;`                                                                   |
| 9   | MakhlukHidup | Metode getInfo() memiliki return type int, padahal yang dikembalikan adalah String.                                          | `public String getInfo() {`                                                           |
| 10  | TestAccess   | Mengakses atribut nama secara langsung (m.nama), padahal atribut tersebut adalah private. Ini melanggar prinsip enkapsulasi. | `m.setNama("Kucing");`                                                                |
| 11  | TestAccess   | Memanggil m2.MakhlukHidup("Kuda"); setelah objek dibuat. Constructor hanya dipanggil saat objek dibuat dengan new.           | Seharusnya diganti dengan `m2.setNama("Kuda");` jika tujuannya adalah mengganti nama. |
| 12  | TestAccess   | Memberikan nilai negatif (-10) ke metode setUmur. Ini adalah kesalahan logika yang seharusnya divalidasi oleh setter.        | Tambahkan validasi pada setUmur di file MakhlukHidup.java: `if (umur >= 0) { ... }`   |
