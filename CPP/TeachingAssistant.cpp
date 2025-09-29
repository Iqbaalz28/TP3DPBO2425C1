#pragma once
#include "Student.cpp"

// TeachingAssistant inherits Student
class TeachingAssistant : public Student {
private:
    int jamAsistensi;
    string mataKuliah;

public:
    TeachingAssistant() {}
    TeachingAssistant(string id, string nama, int usia, string nim, string jurusan, double gpa,
                      int jamAsistensi, string mataKuliah)
        : Student(id, nama, usia, nim, jurusan, gpa),
          jamAsistensi(jamAsistensi), mataKuliah(mataKuliah) {}

    int getJamAsistensi() { return jamAsistensi; }
    string getMataKuliah() { return mataKuliah; }

    void setJamAsistensi(int jam) { this->jamAsistensi = jam; }
    void setMataKuliah(string mk) { this->mataKuliah = mk; }
};