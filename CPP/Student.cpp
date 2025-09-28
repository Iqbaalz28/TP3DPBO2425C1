#pragma once
#include "Person.cpp"

// Student mewarisi Person (hierarchical inheritance)
class Student : virtual public Person {
private:
    string nim;
    string jurusan;
    double gpa;

public:
    Student() : Person(), nim(""), jurusan(""), gpa(0.0) {}
    Student(string id, string nama, int usia, string nim, string jurusan, double gpa)
        : Person(id, nama, usia), nim(nim), jurusan(jurusan), gpa(gpa) {}

    string getNim() const { return nim; }
    string getJurusan() const { return jurusan; }
    double getGpa() const { return gpa; }

    void setNim(string nim) { this->nim = nim; }
    void setJurusan(string jurusan) { this->jurusan = jurusan; }
    void setGpa(double gpa) { this->gpa = gpa; }
};