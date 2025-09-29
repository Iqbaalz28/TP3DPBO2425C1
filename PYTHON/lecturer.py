# lecturer.py
# Lecturer mewarisi Person

from person import Person

class Lecturer(Person):
    def __init__(self, id="", nama="", usia=0, nidn="", departemen="", jabatan=""):
        super().__init__(id, nama, usia)
        self.nidn = nidn
        self.departemen = departemen
        self.jabatan = jabatan

    def get_nidn(self): return self.nidn
    def set_nidn(self, nidn): self.nidn = nidn

    def get_departemen(self): return self.departemen
    def set_departemen(self, departemen): self.departemen = departemen

    def get_jabatan(self): return self.jabatan
    def set_jabatan(self, jabatan): self.jabatan = jabatan