// Lecturer.java
// Lecturer mewarisi Person (hierarchical inheritance)

public class Lecturer extends Person {
    private String nidn;
    private String departemen;
    private String jabatan;

    public Lecturer() {
        super();
        this.nidn = "";
        this.departemen = "";
        this.jabatan = "";
    }

    public Lecturer(String id, String nama, int usia, String nidn, String departemen, String jabatan) {
        super(id, nama, usia);
        this.nidn = nidn;
        this.departemen = departemen;
        this.jabatan = jabatan;
    }

    public String getNidn() { return nidn; }
    public String getDepartemen() { return departemen; }
    public String getJabatan() { return jabatan; }

    public void setNidn(String nidn) { this.nidn = nidn; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
}