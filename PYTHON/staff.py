# staff.py
from person import Person

# Staff juga turunan Person (hierarchical inheritance)
class Staff(Person):
    def __init__(self, id="", nama="", usia=0, posisi="", gaji=0.0, shift=""):
        super().__init__(id, nama, usia)
        self.__posisi = posisi
        self.__gaji = gaji
        self.__shift = shift

    # Getter
    def get_posisi(self): return self.__posisi
    def get_gaji(self): return self.__gaji
    def get_shift(self): return self.__shift

    # Setter
    def set_posisi(self, posisi): self.__posisi = posisi
    def set_gaji(self, gaji): self.__gaji = gaji
    def set_shift(self, shift): self.__shift = shift