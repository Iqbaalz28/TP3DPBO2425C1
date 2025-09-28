// TeachingAssistant.java
// TeachingAssistant mewarisi Student & Lecturer (Multiple Inheritance)

// Karena Java tidak mendukung multiple inheritance langsung dari class,
// Maka saya memanfaatkan EXTENDS Student + COMPOSITION Lecturer.

public class TeachingAssistant extends Student {
    private Lecturer lecturerPart;
    private int jamAsistensi;

    public TeachingAssistant() {
        super();
        this.lecturerPart = new Lecturer();
        this.jamAsistensi = 0;
    }

    public TeachingAssistant(String id, String nama, int usia,
                             String nim, String jurusan, double gpa,
                             String nidn, String departemen, String jabatan,
                             int jamAsistensi) {
        super(id, nama, usia, nim, jurusan, gpa);
        this.lecturerPart = new Lecturer(id, nama, usia, nidn, departemen, jabatan);
        this.jamAsistensi = jamAsistensi;
    }

    // Lecturer bagian
    public String getNidn() { return lecturerPart.getNidn(); }
    public String getDepartemen() { return lecturerPart.getDepartemen(); }
    public String getJabatan() { return lecturerPart.getJabatan(); }

    public void setNidn(String nidn) { lecturerPart.setNidn(nidn); }
    public void setDepartemen(String departemen) { lecturerPart.setDepartemen(departemen); }
    public void setJabatan(String jabatan) { lecturerPart.setJabatan(jabatan); }

    // TA khusus
    public int getJamAsistensi() { return jamAsistensi; }
    public void setJamAsistensi(int jam) { this.jamAsistensi = jam; }
}