// University.java
import java.util.*;

public class University {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecturer> lecturers = new ArrayList<>();
    private ArrayList<Staff> staffs = new ArrayList<>();
    private ArrayList<TeachingAssistant> tas = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void addLecturer(Lecturer l) { lecturers.add(l); }
    public void addStaff(Staff s) { staffs.add(s); }
    public void addTA(TeachingAssistant t) { tas.add(t); }

    // Helper cetak tabel dinamis
    private void printTable(String[] header, ArrayList<String[]> rows) {
        int[] width = new int[header.length];
        for (int i=0; i<header.length; i++) width[i] = header[i].length();

        for (String[] row : rows) {
            for (int i=0; i<row.length; i++) {
                width[i] = Math.max(width[i], row[i].length());
            }
        }

        Runnable line = () -> {
            for (int w : width) {
                System.out.print("+");
                for (int j=0; j<w+2; j++) System.out.print("-");
            }
            System.out.println("+");
        };

        line.run();
        System.out.print("|");
        for (int i=0; i<header.length; i++) {
            System.out.print(" " + header[i] + " ".repeat(width[i]-header[i].length()+1) + "|");
        }
        System.out.println();
        line.run();

        for (String[] row : rows) {
            System.out.print("|");
            for (int i=0; i<row.length; i++) {
                System.out.print(" " + row[i] + " ".repeat(width[i]-row[i].length()+1) + "|");
            }
            System.out.println();
        }
        line.run();
    }

    public void printStudents() {
        System.out.println("\n=== DATA STUDENT ===");
        ArrayList<String[]> rows = new ArrayList<>();
        for (Student s : students) {
            rows.add(new String[]{s.getId(), s.getNama(), String.valueOf(s.getUsia()),
                    s.getNim(), s.getJurusan(), String.format("%.2f", s.getGpa())});
        }
        printTable(new String[]{"ID","Nama","Usia","NIM","Jurusan","GPA"}, rows);
    }

    public void printLecturers() {
        System.out.println("\n=== DATA LECTURER ===");
        ArrayList<String[]> rows = new ArrayList<>();
        for (Lecturer l : lecturers) {
            rows.add(new String[]{l.getId(), l.getNama(), String.valueOf(l.getUsia()),
                    l.getNidn(), l.getDepartemen(), l.getJabatan()});
        }
        printTable(new String[]{"ID","Nama","Usia","NIDN","Departemen","Jabatan"}, rows);
    }

    public void printStaffs() {
        System.out.println("\n=== DATA STAFF ===");
        ArrayList<String[]> rows = new ArrayList<>();
        for (Staff s : staffs) {
            rows.add(new String[]{s.getId(), s.getNama(), String.valueOf(s.getUsia()),
                    s.getPosisi(), String.valueOf((int)s.getGaji()), s.getShift()});
        }
        printTable(new String[]{"ID","Nama","Usia","Posisi","Gaji","Shift"}, rows);
    }

    public void printTAs() {
        System.out.println("\n=== DATA TEACHING ASSISTANT ===");
        ArrayList<String[]> rows = new ArrayList<>();
        for (TeachingAssistant t : tas) {
            rows.add(new String[]{t.getId(), t.getNama(), String.valueOf(t.getUsia()),
                    t.getNim(), t.getJurusan(), String.format("%.2f", t.getGpa()),
                    t.getNidn(), t.getDepartemen(), t.getJabatan(),
                    String.valueOf(t.getJamAsistensi())});
        }
        printTable(new String[]{"ID","Nama","Usia","NIM","Jurusan","GPA","NIDN","Departemen","Jabatan","JamAsistensi"}, rows);
    }
}