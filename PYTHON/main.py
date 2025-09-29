# main.py
# Program utama -> membuat objek universitas, menambahkan data awal, menampilkan tabel, dan input data dinamis

from university import University
from student import Student
from lecturer import Lecturer
from staff import Staff
from teaching_assistant import TeachingAssistant
from course import Course

def main():
    # Membuat objek universitas
    uni = University("Universitas Pendidikan Indonesia", "Bandung, Jawa Barat", "A")

    # Data awal
    uni.add_student(Student("S001","Budi",20,"2101","Informatika",3.75))
    uni.add_student(Student("S002","Ani",21,"2102","Sistem Informasi",3.60))
    uni.add_lecturer(Lecturer("L001","Dr. Agus",45,"NIDN1001","Informatika","Dosen Tetap"))
    uni.add_lecturer(Lecturer("L002","Dr. Siti",42,"NIDN1002","Sistem Informasi","Dosen Tetap"))
    uni.add_staff(Staff("ST001","Pak Joko",40,"Admin",3500000,"Pagi"))
    uni.add_staff(Staff("ST002","Bu Rina",38,"Keuangan",4000000,"Siang"))
    uni.add_ta(TeachingAssistant("TA001","Jule",22,"2201","Informatika",3.80,10,"Algoritma dan Struktur Data"))
    uni.add_course(Course("IF101","Algoritma dan Struktur Data",3,"Dr. Agus"))
    uni.add_course(Course("SI201","Basis Data",3,"Dr. Siti"))

    # Cetak data awal
    print("========= DATA AWAL UNIVERSITAS =========")
    uni.print_info()
    uni.print_students()
    uni.print_lecturers()
    uni.print_staffs()
    uni.print_tas()
    uni.print_courses()

    # Menu tambah data
    print("\n=== Tambah Data ke Universitas ===")
    print("1. Student\n2. Lecturer\n3. Staff\n4. Teaching Assistant\n5. Course")
    pilihan = int(input("Pilihan: "))
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
            dept = input("Departemen: ")
            jabatan = input("Jabatan: ")
            uni.add_lecturer(Lecturer(id,nama,usia,nidn,dept,jabatan))
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
        elif pilihan == 5:
            kode = input("Kode: ")
            nama = input("Nama: ")
            sks = int(input("SKS: "))
            dp = input("Dosen Pengampu: ")
            uni.add_course(Course(kode,nama,sks,dp))

    # Cetak data setelah update
    print("\n========= DATA UNIVERSITAS SETELAH UPDATE =========")
    uni.print_info()
    uni.print_students()
    uni.print_lecturers()
    uni.print_staffs()
    uni.print_tas()
    uni.print_courses()

if __name__ == "__main__":
    main()