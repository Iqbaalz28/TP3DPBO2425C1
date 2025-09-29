# student.py
# Student mewarisi Person

from person import Person

class Student(Person):
    def __init__(self, id="", nama="", usia=0, nim="", jurusan="", gpa=0.0):
        super().__init__(id, nama, usia)
        self.nim = nim
        self.jurusan = jurusan
        self.gpa = gpa

    def get_nim(self): return self.nim
    def set_nim(self, nim): self.nim = nim

    def get_jurusan(self): return self.jurusan
    def set_jurusan(self, jurusan): self.jurusan = jurusan

    def get_gpa(self): return self.gpa
    def set_gpa(self, gpa): self.gpa = gpa