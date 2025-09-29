# main.py
# Entry point program: mengelola data universitas & input user

from university import University
from student import Student
from lecturer import Lecturer
from staff import Staff
from teaching_assistant import TeachingAssistant

if __name__ == "__main__":
    uni = University()

    # Data awal
    uni.add_student(Student("S001","Budi",20,"210101","Informatika",3.75))
    uni.add_student(Student("S002","Ani",21,"210232","SI",3.60))
    uni.add_lecturer(Lecturer("L001","Dr. Agus",45,"NIDN1001","Informatika","Dosen Tetap"))
    uni.add_lecturer(Lecturer("L002","Dr. Siti",42,"NIDN1002","SI","Dosen Tetap"))
    uni.add_staff(Staff("ST001","Pak Joko",40,"Admin",3500000,"Pagi"))
    uni.add_staff(Staff("ST002","Bu Rina",38,"Keuangan",4000000,"Siang"))
    uni.add_ta(TeachingAssistant("TA001","Jule",22,"2201","Informatika",3.80,10,"Algoritma dan Struktur Data"))

    # Print data awal
    uni.print_students()
    uni.print_lecturers()
    uni.print_staffs()
    uni.print_tas()

    # Menu tambah data
    print("\n=== Tambah Data Universitas ===")
    pilihan = int(input("1. Student\n2. Lecturer\n3. Staff\n4. Teaching Assistant\nPilihan: "))
    n = int(input("Berapa data yang ingin ditambahkan? "))

    for i in range(n):
        print(f"\nInput data ke-{i+1}")
        if pilihan == 1:
            id = input("ID: ")
            nama = input("Nama: ")
            usia = int(input("Usia: "))
            nim = input("NIM: ")
            jurusan = input("Jurusan: ")
            gpa = float(input("GPA: "))
            uni.add_student(Student(id,nama,usia,nim,jurusan,gpa))
        elif pilihan == 2:
            id = input("ID: ")
            nama = input("Nama: ")
            usia = int(input("Usia: "))
            nidn = input("NIDN: ")
            departemen = input("Departemen: ")
            jabatan = input("Jabatan: ")
            uni.add_lecturer(Lecturer(id,nama,usia,nidn,departemen,jabatan))
        elif pilihan == 3:
            id = input("ID: ")
            nama = input("Nama: ")
            usia = int(input("Usia: "))
            posisi = input("Posisi: ")
            gaji = float(input("Gaji: "))
            shift = input("Shift: ")
            uni.add_staff(Staff(id,nama,usia,posisi,gaji,shift))
        elif pilihan == 4:
            id = input("ID: ")
            nama = input("Nama: ")
            usia = int(input("Usia: "))
            nim = input("NIM: ")
            jurusan = input("Jurusan: ")
            gpa = float(input("GPA: "))
            jam = int(input("Jam Asistensi: "))
            mk = input("Mata Kuliah: ")
            uni.add_ta(TeachingAssistant(id,nama,usia,nim,jurusan,gpa,jam,mk))

    # Print lagi setelah tambah data
    uni.print_students()
    uni.print_lecturers()
    uni.print_staffs()
    uni.print_tas()