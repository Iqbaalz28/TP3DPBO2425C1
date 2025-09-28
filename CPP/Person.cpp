#pragma once
#include <string>
using namespace std;

// Kelas dasar Person -> akan diwariskan ke Student, Lecturer, Staff
class Person {
private:
    string id;
    string nama;
    int usia;

public:
    Person() : id(""), nama(""), usia(0) {}
    Person(string id, string nama, int usia) : id(id), nama(nama), usia(usia) {}

    string getId() const { return id; }
    string getNama() const { return nama; }
    int getUsia() const { return usia; }

    void setId(string id) { this->id = id; }
    void setNama(string nama) { this->nama = nama; }
    void setUsia(int usia) { this->usia = usia; }
};