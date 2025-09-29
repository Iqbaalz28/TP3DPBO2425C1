// Student mewarisi Person (Hierarchical Inheritance)
public class Student extends Person {
    private String nim;
    private String jurusan;
    private double gpa;

    public Student() {
        super();
        this.nim = "";
        this.jurusan = "";
        this.gpa = 0.0;
    }

    public Student(String id, String nama, int usia, String nim, String jurusan, double gpa) {
        super(id, nama, usia);
        this.nim = nim;
        this.jurusan = jurusan;
        this.gpa = gpa;
    }

    // Getter & Setter
    public String getNim() { return nim; }
    public void setNim(String nim) { this.nim = nim; }

    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}