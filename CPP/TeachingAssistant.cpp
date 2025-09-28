#pragma once
#include "Student.cpp"
#include "Lecturer.cpp"

// TeachingAssistant mewarisi Student & Lecturer -> Multiple Inheritance
class TeachingAssistant : public Student, public Lecturer {
private:
    int jamAsistensi;

public:
    TeachingAssistant() : Student(), Lecturer(), jamAsistensi(0) {}
    TeachingAssistant(string id, string nama, int usia, string nim, string jurusan, double gpa,
                      string nidn, string departemen, string jabatan, int jamAsistensi)
        : Person(id, nama, usia),
          Student(id, nama, usia, nim, jurusan, gpa),
          Lecturer(id, nama, usia, nidn, departemen, jabatan),
          jamAsistensi(jamAsistensi) {}

    int getJamAsistensi() const { return jamAsistensi; }
    void setJamAsistensi(int jam) { jamAsistensi = jam; }
};