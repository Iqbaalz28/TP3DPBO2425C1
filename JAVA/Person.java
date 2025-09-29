// Kelas dasar Person -> akan diwariskan ke Student, Lecturer, Staff
public class Person {
    private String id;
    private String nama;
    private int usia;

    // Constructor default
    public Person() {
        this.id = "";
        this.nama = "";
        this.usia = 0;
    }

    // Constructor dengan parameter
    public Person(String id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    // Getter dan Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getUsia() { return usia; }
    public void setUsia(int usia) { this.usia = usia; }
}