// TeachingAssistant.java
// TeachingAssistant mewarisi Student (multilevel inheritance)

public class TeachingAssistant extends Student {
    private int jamAsistensi;
    private String mataKuliah;

    public TeachingAssistant() {
        super();
        this.jamAsistensi = 0;
        this.mataKuliah = "";
    }

    public TeachingAssistant(String id, String nama, int usia,
                             String nim, String jurusan, double gpa,
                             int jamAsistensi, String mataKuliah) {
        super(id, nama, usia, nim, jurusan, gpa);
        this.jamAsistensi = jamAsistensi;
        this.mataKuliah = mataKuliah;
    }

    // Getter
    public int getJamAsistensi() { return jamAsistensi; }
    public String getMataKuliah() { return mataKuliah; }

    // Setter
    public void setJamAsistensi(int jam) { this.jamAsistensi = jam; }
    public void setMataKuliah(String mk) { this.mataKuliah = mk; }
}