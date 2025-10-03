# Tugas 1 Pemrograman Berorientasi Objek

**Nama**: Muhammad Bagas Maulana
**Nim**: 32602400025

---

## Soal Tugas

> 1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada `MakhlukHidup.java` dan `TestAccess.java`.
> 2. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat tabel skor). Skor minimal **LULUS = 60**.
> 3. Tuliskan output dari `TestAccess` jika kode sudah diperbaiki.

---

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

---

### Kode MakhlukHidup

```java
public class MakhlukHidup {

    private String nama;
    private String jenis;
    public double berat = -1.0;
    private int umur;

    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public MakhlukHidup(String nama) {
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama;
        this.jenis = other.jenis;
        this.umur = other.umur;
        this.berat = other.berat;
    }

    // Setter dengan validasi
    public void setUmur(int umur) {
        if (umur >= 0) {
            this.umur = umur;
        } else {
            System.out.println("Error: Umur tidak boleh negatif!");
        }
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        return "Nama=" + this.nama + ", Jenis=" + this.jenis
                + ", Umur=" + this.umur + ", Berat=" + this.berat;
    }
}
```

### Kode TestAcces

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();

        m.setNama("Kucing");

        m.berat = 2.5;

        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);

        MakhlukHidup m3 = new MakhlukHidup(m2);

        System.out.println(m.getInfo());

        System.out.println(m2.getInfo());

        m2.setNama("Kuda");

        System.out.println(m2.getInfo());

        m3.setUmur(-10);

        System.out.println(m3.getInfo());

    }
}
```
