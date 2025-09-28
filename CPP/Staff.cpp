#pragma once
#include "Person.cpp"

// Staff juga turunan Person (hierarchical inheritance)
class Staff : virtual public Person {
private:
    string posisi;
    double gaji;
    string shift;

public:
    Staff() : Person(), posisi(""), gaji(0.0), shift("") {}
    Staff(string id, string nama, int usia, string posisi, double gaji, string shift)
        : Person(id, nama, usia), posisi(posisi), gaji(gaji), shift(shift) {}

    string getPosisi() const { return posisi; }
    double getGaji() const { return gaji; }
    string getShift() const { return shift; }

    void setPosisi(string posisi) { this->posisi = posisi; }
    void setGaji(double gaji) { this->gaji = gaji; }
    void setShift(string shift) { this->shift = shift; }
};