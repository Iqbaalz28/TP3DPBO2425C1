#include <bits/stdc++.h>
#include "University.cpp"
using namespace std;

int main() {
    University uni;

    // Data awal
    uni.addStudent(Student("S001","Budi",20,"2101","Informatika",3.75));
    uni.addStudent(Student("S002","Ani",21,"2102","SI",3.60));
    uni.addLecturer(Lecturer("L001","Dr. Agus",45,"NIDN1001","Informatika","Dosen Tetap"));
    uni.addLecturer(Lecturer("L002","Dr. Siti",42,"NIDN1002","SI","Dosen Tetap"));
    uni.addStaff(Staff("ST001","Pak Joko",40,"Admin",3500000,"Pagi"));
    uni.addStaff(Staff("ST002","Bu Rina",38,"Keuangan",4000000,"Siang"));
    uni.addTA(TeachingAssistant("TA001","Andi",22,"2201","Informatika",3.80,
                                "NIDN2001","Informatika","Asisten",10));

    // Print data awal
    uni.printStudents();
    uni.printLecturers();
    uni.printStaffs();
    uni.printTAs();

    // Menu tambah data
    int pilihan, n;
    cout << "\n=== Tambah Data Universitas ===\n";
    cout << "1. Student\n2. Lecturer\n3. Staff\n4. Teaching Assistant\nPilihan: ";
    cin >> pilihan;
    cout << "Berapa data yang ingin ditambahkan? ";
    cin >> n;
    cin.ignore();

    for (int i=0; i<n; i++) {
        cout << "\nInput data ke-" << (i+1) << endl;
        if (pilihan == 1) {
            string id,nama,nim,jurusan; int usia; double gpa;
            cout << "ID: "; getline(cin,id);
            cout << "Nama: "; getline(cin,nama);
            cout << "Usia: "; cin>>usia; cin.ignore();
            cout << "NIM: "; getline(cin,nim);
            cout << "Jurusan: "; getline(cin,jurusan);
            cout << "GPA: "; cin>>gpa; cin.ignore();
            uni.addStudent(Student(id,nama,usia,nim,jurusan,gpa));
        }
        else if (pilihan == 2) {
            string id,nama,nidn,departemen,jabatan; int usia;
            cout << "ID: "; getline(cin,id);
            cout << "Nama: "; getline(cin,nama);
            cout << "Usia: "; cin>>usia; cin.ignore();
            cout << "NIDN: "; getline(cin,nidn);
            cout << "Departemen: "; getline(cin,departemen);
            cout << "Jabatan: "; getline(cin,jabatan);
            uni.addLecturer(Lecturer(id,nama,usia,nidn,departemen,jabatan));
        }
        else if (pilihan == 3) {
            string id,nama,posisi,shift; int usia; double gaji;
            cout << "ID: "; getline(cin,id);
            cout << "Nama: "; getline(cin,nama);
            cout << "Usia: "; cin>>usia; cin.ignore();
            cout << "Posisi: "; getline(cin,posisi);
            cout << "Gaji: "; cin>>gaji; cin.ignore();
            cout << "Shift: "; getline(cin,shift);
            uni.addStaff(Staff(id,nama,usia,posisi,gaji,shift));
        }
        else if (pilihan == 4) {
            string id,nama,nim,jurusan,nidn,departemen,jabatan; 
            int usia,jam; double gpa;
            cout << "ID: "; getline(cin,id);
            cout << "Nama: "; getline(cin,nama);
            cout << "Usia: "; cin>>usia; cin.ignore();
            cout << "NIM: "; getline(cin,nim);
            cout << "Jurusan: "; getline(cin,jurusan);
            cout << "GPA: "; cin>>gpa; cin.ignore();
            cout << "NIDN: "; getline(cin,nidn);
            cout << "Departemen: "; getline(cin,departemen);
            cout << "Jabatan: "; getline(cin,jabatan);
            cout << "Jam Asistensi: "; cin>>jam; cin.ignore();
            uni.addTA(TeachingAssistant(id,nama,usia,nim,jurusan,gpa,nidn,departemen,jabatan,jam));
        }
    }

    // Print lagi setelah tambah data
    uni.printStudents();
    uni.printLecturers();
    uni.printStaffs();
    uni.printTAs();

    return 0;
}