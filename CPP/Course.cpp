#pragma once
#include <bits/stdc++.h>
using namespace std;

// Course (mata kuliah)
class Course {
private:
    string kode, nama;
    int sks;
    string dosenPengampu;

public:
    Course() {}
    Course(string kode, string nama, int sks, string dosenPengampu) {
        this->kode = kode;
        this->nama = nama;
        this->sks = sks;
        this->dosenPengampu = dosenPengampu;
    }

    string getKode() { return kode; }
    string getNama() { return nama; }
    int getSks() { return sks; }
    string getDosenPengampu() { return dosenPengampu; }

    void setKode(string kode) { this->kode = kode; }
    void setNama(string nama) { this->nama = nama; }
    void setSks(int sks) { this->sks = sks; }
    void setDosenPengampu(string dp) { this->dosenPengampu = dp; }
};