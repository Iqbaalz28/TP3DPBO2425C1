# university.py
# Kelas University menampung array of object untuk Student, Lecturer, Staff, dan TA
# serta menyediakan fungsi untuk menampilkan tabel dinamis

from student import Student
from lecturer import Lecturer
from staff import Staff
from teaching_assistant import TeachingAssistant

class University:
    def __init__(self):
        self.students = []
        self.lecturers = []
        self.staffs = []
        self.tas = []

    def add_student(self, s: Student): self.students.append(s)
    def add_lecturer(self, l: Lecturer): self.lecturers.append(l)
    def add_staff(self, st: Staff): self.staffs.append(st)
    def add_ta(self, t: TeachingAssistant): self.tas.append(t)

    # Helper untuk membuat garis tabel
    def __line(self, width):
        print("+" + "+".join(["-" * (w + 2) for w in width]) + "+")

    # Helper untuk cetak tabel generik
    def __print_table(self, header, rows):
        width = [len(h) for h in header]
        for row in rows:
            for i, col in enumerate(row):
                width[i] = max(width[i], len(str(col)))

        self.__line(width)
        print("|" + "|".join([f" {header[i]:<{width[i]}} " for i in range(len(header))]) + "|")
        self.__line(width)
        for row in rows:
            print("|" + "|".join([f" {str(row[i]):<{width[i]}} " for i in range(len(row))]) + "|")
        self.__line(width)

    def print_students(self):
        print("\n=== DATA STUDENT ===")
        rows = [[s.get_id(), s.get_nama(), s.get_usia(),
                 s.get_nim(), s.get_jurusan(), s.get_gpa()] for s in self.students]
        self.__print_table(["ID","Nama","Usia","NIM","Jurusan","GPA"], rows)

    def print_lecturers(self):
        print("\n=== DATA LECTURER ===")
        rows = [[d.get_id(), d.get_nama(), d.get_usia(),
                 d.get_nidn(), d.get_departemen(), d.get_jabatan()] for d in self.lecturers]
        self.__print_table(["ID","Nama","Usia","NIDN","Departemen","Jabatan"], rows)

    def print_staffs(self):
        print("\n=== DATA STAFF ===")
        rows = [[s.get_id(), s.get_nama(), s.get_usia(),
                 s.get_posisi(), int(s.get_gaji()), s.get_shift()] for s in self.staffs]
        self.__print_table(["ID","Nama","Usia","Posisi","Gaji","Shift"], rows)

    def print_tas(self):
        print("\n=== DATA TEACHING ASSISTANT ===")
        rows = [[t.get_id(), t.get_nama(), t.get_usia(),
                 t.get_nim(), t.get_jurusan(), t.get_gpa(),
                 t.get_jam_asistensi(), t.get_mata_kuliah()] for t in self.tas]
        self.__print_table(["ID","Nama","Usia","NIM","Jurusan","GPA","JamAsistensi","MataKuliah"], rows)