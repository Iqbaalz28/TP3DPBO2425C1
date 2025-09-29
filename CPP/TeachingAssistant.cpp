#pragma once
#include "Student.cpp"

// TeachingAssistant mewarisi Student (Multilevel Inheritance)
class TeachingAssistant : public Student {
private:
    int jamAsistensi;
    string mataKuliah; // atribut baru

public:
    TeachingAssistant() : Student(), jamAsistensi(0), mataKuliah("") {}

    TeachingAssistant(string id, string nama, int usia, 
                      string nim, string jurusan, double gpa,
                      int jamAsistensi, string mataKuliah)
        : Student(id, nama, usia, nim, jurusan, gpa),
          jamAsistensi(jamAsistensi), mataKuliah(mataKuliah) {}

    // Getter
    int getJamAsistensi() const { return jamAsistensi; }
    void setJamAsistensi(int jam) { jamAsistensi = jam; }

    // Setter
    string getMataKuliah() const { return mataKuliah; }
    void setMataKuliah(string mk) { mataKuliah = mk; }
};