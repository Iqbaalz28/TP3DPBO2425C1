// Person.java
// Kelas dasar Person -> diwariskan ke Student, Lecturer, Staff

public class Person {
    private String id;
    private String nama;
    private int usia;

    public Person() {
        this.id = "";
        this.nama = "";
        this.usia = 0;
    }

    public Person(String id, String nama, int usia) {
        this.id = id;
        this.nama = nama;
        this.usia = usia;
    }

    // Getter
    public String getId() { return id; }
    public String getNama() { return nama; }
    public int getUsia() { return usia; }

    // Setter
    public void setId(String id) { this.id = id; }
    public void setNama(String nama) { this.nama = nama; }
    public void setUsia(int usia) { this.usia = usia; }
}