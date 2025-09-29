#pragma once
#include "Person.cpp"

// Lecturer inherits Person
class Lecturer : public Person {
private:
    string nidn, departemen, jabatan;

public:
    Lecturer() {}
    Lecturer(string id, string nama, int usia, string nidn, string departemen, string jabatan)
        : Person(id, nama, usia), nidn(nidn), departemen(departemen), jabatan(jabatan) {}

    string getNidn() { return nidn; }
    string getDepartemen() { return departemen; }
    string getJabatan() { return jabatan; }

    void setNidn(string nidn) { this->nidn = nidn; }
    void setDepartemen(string departemen) { this->departemen = departemen; }
    void setJabatan(string jabatan) { this->jabatan = jabatan; }
};