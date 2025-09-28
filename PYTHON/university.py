# university.py
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

    # Tambah data
    def add_student(self, s): self.students.append(s)
    def add_lecturer(self, l): self.lecturers.append(l)
    def add_staff(self, st): self.staffs.append(st)
    def add_ta(self, t): self.tas.append(t)

    # Helper cetak tabel
    def print_table(self, header, rows):
        # Hitung lebar kolom
        width = [len(h) for h in header]
        for row in rows:
            for i, col in enumerate(row):
                width[i] = max(width[i], len(str(col)))

        # Cetak garis
        def line():
            print("".join("+" + "-" * (w + 2) for w in width) + "+")

        # Cetak header
        line()
        print("|" + "|".join(f" {header[i]}{' '*(width[i]-len(header[i])+1)}" for i in range(len(header))) + "|")
        line()

        # Cetak isi
        for row in rows:
            print("|" + "|".join(f" {str(row[i])}{' '*(width[i]-len(str(row[i]))+1)}" for i in range(len(row))) + "|")
        line()

    # Cetak data masing-masing
    def print_students(self):
        print("\n=== DATA STUDENT ===")
        rows = [[s.get_id(), s.get_nama(), s.get_usia(), s.get_nim(), s.get_jurusan(), f"{s.get_gpa():.2f}"] for s in self.students]
        self.print_table(["ID","Nama","Usia","NIM","Jurusan","GPA"], rows)

    def print_lecturers(self):
        print("\n=== DATA LECTURER ===")
        rows = [[d.get_id(), d.get_nama(), d.get_usia(), d.get_nidn(), d.get_departemen(), d.get_jabatan()] for d in self.lecturers]
        self.print_table(["ID","Nama","Usia","NIDN","Departemen","Jabatan"], rows)

    def print_staffs(self):
        print("\n=== DATA STAFF ===")
        rows = [[s.get_id(), s.get_nama(), s.get_usia(), s.get_posisi(), int(s.get_gaji()), s.get_shift()] for s in self.staffs]
        self.print_table(["ID","Nama","Usia","Posisi","Gaji","Shift"], rows)

    def print_tas(self):
        print("\n=== DATA TEACHING ASSISTANT ===")
        rows = [[t.get_id(), t.get_nama(), t.get_usia(), t.get_nim(), t.get_jurusan(), f"{t.get_gpa():.2f}",
                 t.get_nidn(), t.get_departemen(), t.get_jabatan(), t.get_jam_asistensi()] for t in self.tas]
        self.print_table(["ID","Nama","Usia","NIM","Jurusan","GPA","NIDN","Departemen","Jabatan","JamAsistensi"], rows)