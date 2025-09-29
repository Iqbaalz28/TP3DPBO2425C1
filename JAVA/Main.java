import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek universitas
        University uni = new University("Universitas Pendidikan Indonesia",
                                        "Bandung, Jawa Barat",
                                        "A");

        // ========== DATA AWAL ==========
        uni.addStudent(new Student("S001","Budi",20,"2101","Informatika",3.75));
        uni.addStudent(new Student("S002","Ani",21,"2102","Sistem Informasi",3.60));

        uni.addLecturer(new Lecturer("L001","Dr. Agus",45,"NIDN1001","Informatika","Dosen Tetap"));
        uni.addLecturer(new Lecturer("L002","Dr. Siti",42,"NIDN1002","Sistem Informasi","Dosen Tetap"));

        uni.addStaff(new Staff("ST001","Pak Joko",40,"Admin",3500000,"Pagi"));
        uni.addStaff(new Staff("ST002","Bu Rina",38,"Keuangan",4000000,"Siang"));

        uni.addTA(new TeachingAssistant("TA001","Jule",22,"2201","Informatika",3.80,10,"Algoritma dan Struktur Data"));

        uni.addCourse(new Course("IF101","Algoritma dan Struktur Data",3,"Dr. Agus"));
        uni.addCourse(new Course("SI201","Basis Data",3,"Dr. Siti"));

        // ========== CETAK DATA AWAL ==========
        System.out.println("========= DATA AWAL UNIVERSITAS =========");
        uni.printInfo();
        uni.printStudents();
        uni.printLecturers();
        uni.printStaffs();
        uni.printTAs();
        uni.printCourses();

        // ========== TAMBAH DATA DINAMIS ==========
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=== Tambah Data ke Universitas ===");
        System.out.println("1. Student\n2. Lecturer\n3. Staff\n4. Teaching Assistant\n5. Course");
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
            } else if (pilihan == 2) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("NIDN: "); String nidn = sc.nextLine();
                System.out.print("Departemen: "); String dept = sc.nextLine();
                System.out.print("Jabatan: "); String jabatan = sc.nextLine();
                uni.addLecturer(new Lecturer(id,nama,usia,nidn,dept,jabatan));
            } else if (pilihan == 3) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("Posisi: "); String posisi = sc.nextLine();
                System.out.print("Gaji: "); double gaji = sc.nextDouble(); sc.nextLine();
                System.out.print("Shift: "); String shift = sc.nextLine();
                uni.addStaff(new Staff(id,nama,usia,posisi,gaji,shift));
            } else if (pilihan == 4) {
                System.out.print("ID: "); String id = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("Usia: "); int usia = sc.nextInt(); sc.nextLine();
                System.out.print("NIM: "); String nim = sc.nextLine();
                System.out.print("Jurusan: "); String jurusan = sc.nextLine();
                System.out.print("GPA: "); double gpa = sc.nextDouble(); sc.nextLine();
                System.out.print("Jam Asistensi: "); int jam = sc.nextInt(); sc.nextLine();
                System.out.print("Mata Kuliah: "); String mk = sc.nextLine();
                uni.addTA(new TeachingAssistant(id,nama,usia,nim,jurusan,gpa,jam,mk));
            } else if (pilihan == 5) {
                System.out.print("Kode: "); String kode = sc.nextLine();
                System.out.print("Nama: "); String nama = sc.nextLine();
                System.out.print("SKS: "); int sks = sc.nextInt(); sc.nextLine();
                System.out.print("Dosen Pengampu: "); String dp = sc.nextLine();
                uni.addCourse(new Course(kode,nama,sks,dp));
            }
        }

        // ========== CETAK DATA SETELAH UPDATE ==========
        System.out.println("\n========= DATA UNIVERSITAS SETELAH UPDATE =========");
        uni.printInfo();
        uni.printStudents();
        uni.printLecturers();
        uni.printStaffs();
        uni.printTAs();
        uni.printCourses();
    }
}