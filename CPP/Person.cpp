#pragma once
#include <bits/stdc++.h>
using namespace std;

// Base class Person
class Person {
protected:
    string id;
    string nama;
    int usia;

public:
    Person() {}
    Person(string id, string nama, int usia) {
        this->id = id;
        this->nama = nama;
        this->usia = usia;
    }

    // Getter & Setter
    string getId() { return id; }
    string getNama() { return nama; }
    int getUsia() { return usia; }
    void setId(string id) { this->id = id; }
    void setNama(string nama) { this->nama = nama; }
    void setUsia(int usia) { this->usia = usia; }
};