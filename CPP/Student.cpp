#pragma once
#include "Person.cpp"

// Student inherits Person
class Student : public Person {
private:
    string nim, jurusan;
    double gpa;

public:
    Student() {}
    Student(string id, string nama, int usia, string nim, string jurusan, double gpa)
        : Person(id, nama, usia), nim(nim), jurusan(jurusan), gpa(gpa) {}

    string getNim() { return nim; }
    string getJurusan() { return jurusan; }
    double getGpa() { return gpa; }

    void setNim(string nim) { this->nim = nim; }
    void setJurusan(string jurusan) { this->jurusan = jurusan; }
    void setGpa(double gpa) { this->gpa = gpa; }
};