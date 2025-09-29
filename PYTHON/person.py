# person.py
# Kelas dasar Person yang akan diwarisi oleh Student, Lecturer, Staff, TeachingAssistant

class Person:
    def __init__(self, id="", nama="", usia=0):
        self.id = id
        self.nama = nama
        self.usia = usia

    # Getter dan Setter
    def get_id(self): return self.id
    def set_id(self, id): self.id = id

    def get_nama(self): return self.nama
    def set_nama(self, nama): self.nama = nama

    def get_usia(self): return self.usia
    def set_usia(self, usia): self.usia = usia