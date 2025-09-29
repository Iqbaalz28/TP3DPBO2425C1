// TeachingAssistant mewarisi Student (Multilevel Inheritance)
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

    // Getter & Setter
    public int getJamAsistensi() { return jamAsistensi; }
    public void setJamAsistensi(int jamAsistensi) { this.jamAsistensi = jamAsistensi; }
    public String getMataKuliah() { return mataKuliah; }
    public void setMataKuliah(String mataKuliah) { this.mataKuliah = mataKuliah; }
}