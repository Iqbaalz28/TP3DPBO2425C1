# course.py
# Kelas Course berdiri sendiri (tidak diwarisi Person)
# Digunakan untuk menyimpan data mata kuliah

class Course:
    def __init__(self, kode="", nama="", sks=0, dosen_pengampu=""):
        self.kode = kode
        self.nama = nama
        self.sks = sks
        self.dosen_pengampu = dosen_pengampu

    def get_kode(self): return self.kode
    def set_kode(self, kode): self.kode = kode

    def get_nama(self): return self.nama
    def set_nama(self, nama): self.nama = nama

    def get_sks(self): return self.sks
    def set_sks(self, sks): self.sks = sks

    def get_dosen_pengampu(self): return self.dosen_pengampu
    def set_dosen_pengampu(self, dp): self.dosen_pengampu = dp
