// Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        University uni = new University();

        // Data awal
        uni.addStudent(new Student("S001","Budi",20,"2101","Informatika",3.75));
        uni.addStudent(new Student("S002","Ani",21,"2102","SI",3.60));
        uni.addLecturer(new Lecturer("L001","Dr. Agus",45,"NIDN1001","Informatika","Dosen Tetap"));
        uni.addLecturer(new Lecturer("L002","Dr. Siti",42,"NIDN1002","SI","Dosen Tetap"));
        uni.addStaff(new Staff("ST001","Pak Joko",40,"Admin",3500000,"Pagi"));
        uni.addStaff(new Staff("ST002","Bu Rina",38,"Keuangan",4000000,"Siang"));
        uni.addTA(new TeachingAssistant("TA001","Andi",22,"2201","Informatika",3.80,
                                        "NIDN2001","Informatika","Asisten",10));

        // Print data awal
        uni.printStudents();
        uni.printLecturers();
        uni.printStaffs();
        uni.printTAs();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Tambah Data Universitas ===");
        System.out.println("1. Student\n2. Lecturer\n3. Staff\n4. Teaching Assistant");
        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        System.out.print("Berapa data yang ingin ditambahkan? ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i=0; i<n; i++) {
            System.out.println("\nInput data ke-" + (i+1));
            if (pilihan == 1) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("NIM: "); String nim = sc.nextLine();
                System.out.print("Jurusan: "); String jurusan = sc.nextLine();
                System.out.print("GPA: "); double gpa = sc.nextDouble(); sc.nextLine();
                uni.addStudent(new Student(id,nama,usia,nim,jurusan,gpa));
            }
            else if (pilihan == 2) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("NIDN: "); String nidn = sc.nextLine();
                System.out.print("Departemen: "); String dept = sc.nextLine();
                System.out.print("Jabatan: "); String jab = sc.nextLine();
                uni.addLecturer(new Lecturer(id,nama,usia,nidn,dept,jab));
            }
            else if (pilihan == 3) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("Posisi: "); String pos = sc.nextLine();
                System.out.print("Gaji: "); double gaji = sc.nextDouble(); sc.nextLine();
                System.out.print("Shift: "); String shift = sc.nextLine();
                uni.addStaff(new Staff(id,nama,usia,pos,gaji,shift));
            }
            else if (pilihan == 4) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("NIM: "); String nim = sc.nextLine();
                System.out.print("Jurusan: "); String jurusan = sc.nextLine();
                System.out.print("GPA: "); double gpa = sc.nextDouble(); sc.nextLine();
                System.out.print("NIDN: "); String nidn = sc.nextLine();
                System.out.print("Departemen: "); String dept = sc.nextLine();
                System.out.print("Jabatan: "); String jab = sc.nextLine();
                System.out.print("Jam Asistensi: "); int jam = sc.nextInt(); sc.nextLine();
                uni.addTA(new TeachingAssistant(id,nama,usia,nim,jurusan,gpa,nidn,dept,jab,jam));
            }
        }

        // Print setelah tambah data
        uni.printStudents();
        uni.printLecturers();
        uni.printStaffs();
        uni.printTAs();

        sc.close();
    }
}