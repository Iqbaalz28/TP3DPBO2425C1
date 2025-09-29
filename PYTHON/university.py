# university.py
# University adalah kelas composite -> memiliki kumpulan Student, Lecturer, Staff, TeachingAssistant, Course
# Juga memiliki atribut identitas (nama, alamat, akreditasi)

from student import Student
from lecturer import Lecturer
from staff import Staff
from teaching_assistant import TeachingAssistant
from course import Course

class University:
    def __init__(self, nama="", alamat="", akreditasi=""):
        self.nama = nama
        self.alamat = alamat
        self.akreditasi = akreditasi
        self.students = []
        self.lecturers = []
        self.staffs = []
        self.tas = []
        self.courses = []

    # Method tambah data
    def add_student(self, s): self.students.append(s)
    def add_lecturer(self, l): self.lecturers.append(l)
    def add_staff(self, st): self.staffs.append(st)
    def add_ta(self, ta): self.tas.append(ta)
    def add_course(self, c): self.courses.append(c)

    # Cetak informasi universitas
    def print_info(self):
        print("\n=== INFORMASI UNIVERSITAS ===")
        print(f"Nama       : {self.nama}")
        print(f"Alamat     : {self.alamat}")
        print(f"Akreditasi : {self.akreditasi}")
        print("===================================")

    # Utility cetak tabel
    def _print_table(self, header, rows):
        width = [len(h) for h in header]
        for row in rows:
            for i, col in enumerate(row):
                width[i] = max(width[i], len(col))

        # garis
        def line():
            print("".join("+" + "-"*(w+2) for w in width) + "+")

        # header
        line()
        print("".join(f"| {header[i]}{' '*(width[i]-len(header[i])+1)}" for i in range(len(header))) + "|")
        line()
        # isi
        for row in rows:
            print("".join(f"| {row[i]}{' '*(width[i]-len(row[i])+1)}" for i in range(len(row))) + "|")
        line()

    # Print tiap entitas
    def print_students(self):
        print("\n=== DATA STUDENT ===")
        rows = [[s.get_id(), s.get_nama(), str(s.get_usia()), s.get_nim(), s.get_jurusan(), f"{s.get_gpa():.2f}"] for s in self.students]
        self._print_table(["ID","Nama","Usia","NIM","Jurusan","GPA"], rows)

    def print_lecturers(self):
        print("\n=== DATA LECTURER ===")
        rows = [[l.get_id(), l.get_nama(), str(l.get_usia()), l.get_nidn(), l.get_departemen(), l.get_jabatan()] for l in self.lecturers]
        self._print_table(["ID","Nama","Usia","NIDN","Departemen","Jabatan"], rows)

    def print_staffs(self):
        print("\n=== DATA STAFF ===")
        rows = [[s.get_id(), s.get_nama(), str(s.get_usia()), s.get_posisi(), str(int(s.get_gaji())), s.get_shift()] for s in self.staffs]
        self._print_table(["ID","Nama","Usia","Posisi","Gaji","Shift"], rows)

    def print_tas(self):
        print("\n=== DATA TEACHING ASSISTANT ===")
        rows = [[t.get_id(), t.get_nama(), str(t.get_usia()), t.get_nim(), t.get_jurusan(), f"{t.get_gpa():.2f}", str(t.get_jam_asistensi()), t.get_mata_kuliah()] for t in self.tas]
        self._print_table(["ID","Nama","Usia","NIM","Jurusan","GPA","JamAsistensi","MataKuliah"], rows)

    def print_courses(self):
        print("\n=== DATA COURSE ===")
        rows = [[c.get_kode(), c.get_nama(), str(c.get_sks()), c.get_dosen_pengampu()] for c in self.courses]
        self._print_table(["Kode","Nama","SKS","DosenPengampu"], rows)