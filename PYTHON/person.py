# person.py
# Kelas dasar Person -> akan diwariskan ke Student, Lecturer, Staff

class Person:
    def __init__(self, id="", nama="", usia=0):
        self.__id = id
        self.__nama = nama
        self.__usia = usia

    # Getter
    def get_id(self): return self.__id
    def get_nama(self): return self.__nama
    def get_usia(self): return self.__usia

    # Setter
    def set_id(self, id): self.__id = id
    def set_nama(self, nama): self.__nama = nama
    def set_usia(self, usia): self.__usia = usia