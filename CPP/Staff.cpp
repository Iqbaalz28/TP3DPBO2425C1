#pragma once
#include "Person.cpp"

// Staff inherits Person
class Staff : public Person {
private:
    string posisi, shift;
    double gaji;

public:
    Staff() {}
    Staff(string id, string nama, int usia, string posisi, double gaji, string shift)
        : Person(id, nama, usia), posisi(posisi), gaji(gaji), shift(shift) {}

    string getPosisi() { return posisi; }
    double getGaji() { return gaji; }
    string getShift() { return shift; }

    void setPosisi(string posisi) { this->posisi = posisi; }
    void setGaji(double gaji) { this->gaji = gaji; }
    void setShift(string shift) { this->shift = shift; }
};