# teaching_assistant.py
# TeachingAssistant mewarisi Student (multilevel inheritance)

from student import Student

class TeachingAssistant(Student):
    def __init__(self, id="", nama="", usia=0, nim="", jurusan="", gpa=0.0,
                 jam_asistensi=0, mata_kuliah=""):
        super().__init__(id, nama, usia, nim, jurusan, gpa)
        self.__jam_asistensi = jam_asistensi
        self.__mata_kuliah = mata_kuliah

    # Getter
    def get_jam_asistensi(self): return self.__jam_asistensi
    def get_mata_kuliah(self): return self.__mata_kuliah

    # Setter
    def set_jam_asistensi(self, jam): self.__jam_asistensi = jam
    def set_mata_kuliah(self, mk): self.__mata_kuliah = mk