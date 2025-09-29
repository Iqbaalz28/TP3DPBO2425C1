// Staff mewarisi Person (Hierarchical Inheritance)
public class Staff extends Person {
    private String posisi;
    private double gaji;
    private String shift;

    public Staff() {
        super();
        this.posisi = "";
        this.gaji = 0.0;
        this.shift = "";
    }

    public Staff(String id, String nama, int usia, String posisi, double gaji, String shift) {
        super(id, nama, usia);
        this.posisi = posisi;
        this.gaji = gaji;
        this.shift = shift;
    }

    // Getter & Setter
    public String getPosisi() { return posisi; }
    public void setPosisi(String posisi) { this.posisi = posisi; }

    public double getGaji() { return gaji; }
    public void setGaji(double gaji) { this.gaji = gaji; }

    public String getShift() { return shift; }
    public void setShift(String shift) { this.shift = shift; }
}