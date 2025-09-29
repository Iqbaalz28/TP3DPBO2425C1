#pragma once
#include "Person.cpp"

// Lecturer mewarisi Person (hierarchical inheritance)
class Lecturer : public Person {
private:
    string nidn;
    string departemen;
    string jabatan;

public:
    Lecturer() : Person(), nidn(""), departemen(""), jabatan("") {}
    Lecturer(string id, string nama, int usia, string nidn, string departemen, string jabatan)
        : Person(id, nama, usia), nidn(nidn), departemen(departemen), jabatan(jabatan) {}

    // Getter
    string getNidn() const { return nidn; }
    string getDepartemen() const { return departemen; }
    string getJabatan() const { return jabatan; }

    // Setter
    void setNidn(string nidn) { this->nidn = nidn; }
    void setDepartemen(string departemen) { this->departemen = departemen; }
    void setJabatan(string jabatan) { this->jabatan = jabatan; }
};