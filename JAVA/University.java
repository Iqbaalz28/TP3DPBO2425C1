import java.util.*;

// University adalah kelas composite yang menyimpan berbagai entitas
public class University {
    private String nama;
    private String alamat;
    private String akreditasi;

    private List<Student> students = new ArrayList<>();
    private List<Lecturer> lecturers = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    private List<TeachingAssistant> tas = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public University(String nama, String alamat, String akreditasi) {
        this.nama = nama;
        this.alamat = alamat;
        this.akreditasi = akreditasi;
    }

    // ========== METHOD UNTUK MENAMBAH DATA ==========
    public void addStudent(Student s) { students.add(s); }
    public void addLecturer(Lecturer l) { lecturers.add(l); }
    public void addStaff(Staff st) { staffs.add(st); }
    public void addTA(TeachingAssistant ta) { tas.add(ta); }
    public void addCourse(Course c) { courses.add(c); }

    // ========== CETAK IDENTITAS UNIVERSITAS ==========
    public void printInfo() {
        System.out.println("\n=== INFORMASI UNIVERSITAS ===");
        System.out.println("Nama       : " + nama);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Akreditasi : " + akreditasi);
        System.out.println("=======================================");
    }

    // ========== UTILITY CETAK TABEL ==========
    private void printLine(int[] width) {
        for (int w : width) {
            System.out.print("+");
            for (int j=0; j<w+2; j++) System.out.print("-");
        }
        System.out.println("+");
    }

    private void printRow(String[] data, int[] width) {
        for (int i=0; i<data.length; i++) {
            System.out.print("| " + data[i] + " ".repeat(width[i] - data[i].length() + 1));
        }
        System.out.println("|");
    }

    // ========== CETAK STUDENTS ==========
    public void printStudents() {
        System.out.println("\n=== DATA STUDENT ===");
        String[] header = {"ID","Nama","Usia","NIM","Jurusan","GPA"};
        int[] width = Arrays.stream(header).mapToInt(String::length).toArray();

        for (Student s : students) {
            width[0] = Math.max(width[0], s.getId().length());
            width[1] = Math.max(width[1], s.getNama().length());
            width[2] = Math.max(width[2], Integer.toString(s.getUsia()).length());
            width[3] = Math.max(width[3], s.getNim().length());
            width[4] = Math.max(width[4], s.getJurusan().length());
            width[5] = Math.max(width[5], String.format("%.2f", s.getGpa()).length());
        }

        printLine(width);
        printRow(header,width);
        printLine(width);

        for (Student s : students) {
            String[] row = {
                s.getId(),
                s.getNama(),
                Integer.toString(s.getUsia()),
                s.getNim(),
                s.getJurusan(),
                String.format("%.2f", s.getGpa())
            };
            printRow(row,width);
        }
        printLine(width);
    }

    // ========== CETAK LECTURERS ==========
    public void printLecturers() {
        System.out.println("\n=== DATA LECTURER ===");
        String[] header = {"ID","Nama","Usia","NIDN","Departemen","Jabatan"};
        int[] width = Arrays.stream(header).mapToInt(String::length).toArray();

        for (Lecturer l : lecturers) {
            width[0] = Math.max(width[0], l.getId().length());
            width[1] = Math.max(width[1], l.getNama().length());
            width[2] = Math.max(width[2], Integer.toString(l.getUsia()).length());
            width[3] = Math.max(width[3], l.getNidn().length());
            width[4] = Math.max(width[4], l.getDepartemen().length());
            width[5] = Math.max(width[5], l.getJabatan().length());
        }

        printLine(width);
        printRow(header,width);
        printLine(width);

        for (Lecturer l : lecturers) {
            String[] row = {
                l.getId(),
                l.getNama(),
                Integer.toString(l.getUsia()),
                l.getNidn(),
                l.getDepartemen(),
                l.getJabatan()
            };
            printRow(row,width);
        }
        printLine(width);
    }

    // ========== CETAK STAFF ==========
    public void printStaffs() {
        System.out.println("\n=== DATA STAFF ===");
        String[] header = {"ID","Nama","Usia","Posisi","Gaji","Shift"};
        int[] width = Arrays.stream(header).mapToInt(String::length).toArray();

        for (Staff st : staffs) {
            width[0] = Math.max(width[0], st.getId().length());
            width[1] = Math.max(width[1], st.getNama().length());
            width[2] = Math.max(width[2], Integer.toString(st.getUsia()).length());
            width[3] = Math.max(width[3], st.getPosisi().length());
            width[4] = Math.max(width[4], String.format("%.0f", st.getGaji()).length());
            width[5] = Math.max(width[5], st.getShift().length());
        }

        printLine(width);
        printRow(header,width);
        printLine(width);

        for (Staff st : staffs) {
            String[] row = {
                st.getId(),
                st.getNama(),
                Integer.toString(st.getUsia()),
                st.getPosisi(),
                String.format("%.0f", st.getGaji()),
                st.getShift()
            };
            printRow(row,width);
        }
        printLine(width);
    }

    // ========== CETAK TEACHING ASSISTANT ==========
    public void printTAs() {
        System.out.println("\n=== DATA TEACHING ASSISTANT ===");
        String[] header = {"ID","Nama","Usia","NIM","Jurusan","GPA","JamAsistensi","MataKuliah"};
        int[] width = Arrays.stream(header).mapToInt(String::length).toArray();

        for (TeachingAssistant ta : tas) {
            width[0] = Math.max(width[0], ta.getId().length());
            width[1] = Math.max(width[1], ta.getNama().length());
            width[2] = Math.max(width[2], Integer.toString(ta.getUsia()).length());
            width[3] = Math.max(width[3], ta.getNim().length());
            width[4] = Math.max(width[4], ta.getJurusan().length());
            width[5] = Math.max(width[5], String.format("%.2f", ta.getGpa()).length());
            width[6] = Math.max(width[6], Integer.toString(ta.getJamAsistensi()).length());
            width[7] = Math.max(width[7], ta.getMataKuliah().length());
        }

        printLine(width);
        printRow(header,width);
        printLine(width);

        for (TeachingAssistant ta : tas) {
            String[] row = {
                ta.getId(),
                ta.getNama(),
                Integer.toString(ta.getUsia()),
                ta.getNim(),
                ta.getJurusan(),
                String.format("%.2f", ta.getGpa()),
                Integer.toString(ta.getJamAsistensi()),
                ta.getMataKuliah()
            };
            printRow(row,width);
        }
        printLine(width);
    }

    // ========== CETAK COURSES ==========
    public void printCourses() {
        System.out.println("\n=== DATA COURSE ===");
        String[] header = {"Kode","Nama","SKS","DosenPengampu"};
        int[] width = Arrays.stream(header).mapToInt(String::length).toArray();

        for (Course c : courses) {
            width[0] = Math.max(width[0], c.getKode().length());
            width[1] = Math.max(width[1], c.getNama().length());
            width[2] = Math.max(width[2], Integer.toString(c.getSks()).length());
            width[3] = Math.max(width[3], c.getDosenPengampu().length());
        }

        printLine(width);
        printRow(header,width);
        printLine(width);

        for (Course c : courses) {
            String[] row = {
                c.getKode(),
                c.getNama(),
                Integer.toString(c.getSks()),
                c.getDosenPengampu()
            };
            printRow(row,width);
        }
        printLine(width);
    }
}