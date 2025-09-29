# staff.py
# Staff mewarisi Person

from person import Person

class Staff(Person):
    def __init__(self, id="", nama="", usia=0, posisi="", gaji=0.0, shift=""):
        super().__init__(id, nama, usia)
        self.posisi = posisi
        self.gaji = gaji
        self.shift = shift

    def get_posisi(self): return self.posisi
    def set_posisi(self, posisi): self.posisi = posisi

    def get_gaji(self): return self.gaji
    def set_gaji(self, gaji): self.gaji = gaji

    def get_shift(self): return self.shift
    def set_shift(self, shift): self.shift = shift