// University.java
// Menampung array of object Student, Lecturer, Staff, dan TA
// serta mencetak data dengan format tabel sederhana

import java.util.*;

// University class
public class University {
    private List<Student> students = new ArrayList<>();
    private List<Lecturer> lecturers = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();
    private List<TeachingAssistant> tas = new ArrayList<>();

    // ---------------- Helper ----------------
    private void printLine(int[] width) {
        for (int w : width) {
            System.out.print("+");
            for (int j = 0; j < w + 2; j++) System.out.print("-");
        }
        System.out.println("+");
    }

    private void printTable(String[] header, List<String[]> rows) {
        int cols = header.length;
        int[] width = new int[cols];

        // inisialisasi dengan panjang header
        for (int i = 0; i < cols; i++) width[i] = header[i].length();

        // cek panjang maksimum isi data
        for (String[] row : rows) {
            for (int i = 0; i < cols; i++) {
                if (row[i].length() > width[i]) width[i] = row[i].length();
            }
        }

        // cetak header
        printLine(width);
        System.out.print("|");
        for (int i = 0; i < cols; i++) {
            System.out.print(" " + header[i] + " ".repeat(width[i] - header[i].length() + 1) + "|");
        }
        System.out.println();
        printLine(width);

        // cetak isi
        for (String[] row : rows) {
            System.out.print("|");
            for (int i = 0; i < cols; i++) {
                System.out.print(" " + row[i] + " ".repeat(width[i] - row[i].length() + 1) + "|");
            }
            System.out.println();
        }
        printLine(width);
    }

    // ---------------- Adders ----------------
    public void addStudent(Student s) { students.add(s); }
    public void addLecturer(Lecturer l) { lecturers.add(l); }
    public void addStaff(Staff st) { staffs.add(st); }
    public void addTA(TeachingAssistant t) { tas.add(t); }

    // ---------------- Printers ----------------
    public void printStudents() {
        System.out.println("\n=== DATA STUDENT ===");
        String[] header = {"ID","Nama","Usia","NIM","Jurusan","GPA"};
        List<String[]> rows = new ArrayList<>();
        for (Student s : students) {
            rows.add(new String[]{
                s.getId(),
                s.getNama(),
                String.valueOf(s.getUsia()),
                s.getNim(),
                s.getJurusan(),
                String.format("%.2f", s.getGpa())
            });
        }
        printTable(header, rows);
    }

    public void printLecturers() {
        System.out.println("\n=== DATA LECTURER ===");
        String[] header = {"ID","Nama","Usia","NIDN","Departemen","Jabatan"};
        List<String[]> rows = new ArrayList<>();
        for (Lecturer d : lecturers) {
            rows.add(new String[]{
                d.getId(),
                d.getNama(),
                String.valueOf(d.getUsia()),
                d.getNidn(),
                d.getDepartemen(),
                d.getJabatan()
            });
        }
        printTable(header, rows);
    }

    public void printStaffs() {
        System.out.println("\n=== DATA STAFF ===");
        String[] header = {"ID","Nama","Usia","Posisi","Gaji","Shift"};
        List<String[]> rows = new ArrayList<>();
        for (Staff st : staffs) {
            rows.add(new String[]{
                st.getId(),
                st.getNama(),
                String.valueOf(st.getUsia()),
                st.getPosisi(),
                String.valueOf((int) st.getGaji()),
                st.getShift()
            });
        }
        printTable(header, rows);
    }

    public void printTAs() {
        System.out.println("\n=== DATA TEACHING ASSISTANT ===");
        String[] header = {"ID","Nama","Usia","NIM","Jurusan","GPA","JamAsistensi","MataKuliah"};
        List<String[]> rows = new ArrayList<>();
        for (TeachingAssistant t : tas) {
            rows.add(new String[]{
                t.getId(),
                t.getNama(),
                String.valueOf(t.getUsia()),
                t.getNim(),
                t.getJurusan(),
                String.format("%.2f", t.getGpa()),
                String.valueOf(t.getJamAsistensi()),
                t.getMataKuliah()
            });
        }
        printTable(header, rows);
    }
}