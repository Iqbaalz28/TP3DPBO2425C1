// Lecturer mewarisi Person (Hierarchical Inheritance)
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

    // Getter & Setter
    public String getNidn() { return nidn; }
    public void setNidn(String nidn) { this.nidn = nidn; }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }
}