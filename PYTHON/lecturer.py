# lecturer.py
from person import Person

# Lecturer mewarisi Person (hierarchical inheritance)
class Lecturer(Person):
    def __init__(self, id="", nama="", usia=0, nidn="", departemen="", jabatan=""):
        super().__init__(id, nama, usia)
        self.__nidn = nidn
        self.__departemen = departemen
        self.__jabatan = jabatan

    # Getter
    def get_nidn(self): return self.__nidn
    def get_departemen(self): return self.__departemen
    def get_jabatan(self): return self.__jabatan

    # Setter
    def set_nidn(self, nidn): self.__nidn = nidn
    def set_departemen(self, departemen): self.__departemen = departemen
    def set_jabatan(self, jabatan): self.__jabatan = jabatan