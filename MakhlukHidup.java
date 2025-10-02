public class MakhlukHidup {

    private String nama;
    private String jenis;
    public double berat = -1.0;
    private int umur;

    // 1. Default Constructor
    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    // 2. Parameterized Constructor
    public MakhlukHidup(String nama) {
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    // 3. Parameterized Constructor (dengan urutan yang benar)
    public MakhlukHidup(String nama, String jenis, int umur, double berat) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.berat = berat;
    }

    // 4. Copy Constructor (dengan penugasan yang benar)
    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama;
        this.jenis = other.jenis;
        this.umur = other.umur;
        this.berat = other.berat;
    }

    // Setter dengan validasi
    public void setUmur(int umur) {
        if (umur >= 0) { // Validasi: umur tidak boleh negatif
            this.umur = umur;
        } else {
            System.out.println("Error: Umur tidak boleh negatif!");
        }
    }

    // Setter yang benar
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dengan tipe pengembalian yang benar
    public String getInfo() {
        return "Nama=" + this.nama + ", Jenis=" + this.jenis
                + ", Umur=" + this.umur + ", Berat=" + this.berat;
    }
}