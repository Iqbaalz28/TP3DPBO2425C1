# student.py
from person import Person

# Student mewarisi Person (hierarchical inheritance)
class Student(Person):
    def __init__(self, id="", nama="", usia=0, nim="", jurusan="", gpa=0.0):
        super().__init__(id, nama, usia)
        self.__nim = nim
        self.__jurusan = jurusan
        self.__gpa = gpa

    # Getter
    def get_nim(self): return self.__nim
    def get_jurusan(self): return self.__jurusan
    def get_gpa(self): return self.__gpa

    # Setter
    def set_nim(self, nim): self.__nim = nim
    def set_jurusan(self, jurusan): self.__jurusan = jurusan
    def set_gpa(self, gpa): self.__gpa = gpa