# teaching_assistant.py
# TeachingAssistant mewarisi Student

from student import Student

class TeachingAssistant(Student):
    def __init__(self, id="", nama="", usia=0, nim="", jurusan="", gpa=0.0, jam_asistensi=0, mata_kuliah=""):
        super().__init__(id, nama, usia, nim, jurusan, gpa)
        self.jam_asistensi = jam_asistensi
        self.mata_kuliah = mata_kuliah

    def get_jam_asistensi(self): return self.jam_asistensi
    def set_jam_asistensi(self, jam): self.jam_asistensi = jam

    def get_mata_kuliah(self): return self.mata_kuliah
    def set_mata_kuliah(self, mk): self.mata_kuliah = mk