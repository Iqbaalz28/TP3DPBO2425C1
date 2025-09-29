// Class Course berdiri sendiri -> dikomposisi dalam University
public class Course {
    private String kode;
    private String nama;
    private int sks;
    private String dosenPengampu;

    public Course() {
        this.kode = "";
        this.nama = "";
        this.sks = 0;
        this.dosenPengampu = "";
    }

    public Course(String kode, String nama, int sks, String dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    // Getter & Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getSks() { return sks; }
    public void setSks(int sks) { this.sks = sks; }

    public String getDosenPengampu() { return dosenPengampu; }
    public void setDosenPengampu(String dosenPengampu) { this.dosenPengampu = dosenPengampu; }
}