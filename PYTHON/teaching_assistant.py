# teaching_assistant.py
from student import Student
from lecturer import Lecturer

# TeachingAssistant mewarisi Student & Lecturer (Multiple Inheritance)
class TeachingAssistant(Student, Lecturer):
    def __init__(self, id="", nama="", usia=0,
                 nim="", jurusan="", gpa=0.0,
                 nidn="", departemen="", jabatan="",
                 jam_asistensi=0):
        Student.__init__(self, id, nama, usia, nim, jurusan, gpa)
        Lecturer.__init__(self, id, nama, usia, nidn, departemen, jabatan)
        self.__jam_asistensi = jam_asistensi

    # Getter & Setter
    def get_jam_asistensi(self): return self.__jam_asistensi
    def set_jam_asistensi(self, jam): self.__jam_asistensi = jam
