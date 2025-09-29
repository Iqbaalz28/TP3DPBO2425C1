#pragma once
#include <bits/stdc++.h>
#include "Student.cpp"
#include "Lecturer.cpp"
#include "Staff.cpp"
#include "TeachingAssistant.cpp"
using namespace std;

class University {
private:
    vector<Student> students;
    vector<Lecturer> lecturers;
    vector<Staff> staffs;
    vector<TeachingAssistant> tas;

    // helper untuk format angka double
    string formatDouble(double val, int prec=2) {
        ostringstream out;
        out << fixed << setprecision(prec) << val;
        return out.str();
    }

    // helper buat garis tabel
    void printLine(const vector<int>& width) {
        for (int w : width) {
            cout << "+";
            for (int j = 0; j < w+2; j++) cout << "-";
        }
        cout << "+\n";
    }

public:
    University(){}

    void addStudent(const Student& s) { students.push_back(s); }
    void addLecturer(const Lecturer& l) { lecturers.push_back(l); }
    void addStaff(const Staff& st) { staffs.push_back(st); }
    void addTA(const TeachingAssistant& t) { tas.push_back(t); }

    // ================= STUDENTS =================
    void printStudents() {
        cout << "\n=== DATA STUDENT ===\n";
        vector<string> header = {"ID","Nama","Usia","NIM","Jurusan","GPA"};
        vector<int> width(header.size(),0);

        for (int i=0;i<header.size();i++) width[i]=header[i].length();

        for (auto &s: students) {
            width[0] = max(width[0], (int)s.getId().length());
            width[1] = max(width[1], (int)s.getNama().length());
            width[2] = max(width[2], (int)to_string(s.getUsia()).length());
            width[3] = max(width[3], (int)s.getNim().length());
            width[4] = max(width[4], (int)s.getJurusan().length());
            width[5] = max(width[5], (int)formatDouble(s.getGpa()).length());
        }

        printLine(width);
        cout << "|";
        for (int i=0;i<header.size();i++)
            cout << " " << header[i] << string(width[i]-header[i].length()+1,' ') << "|";
        cout << "\n";
        printLine(width);

        for (auto &s: students) {
            cout << "| " << s.getId() << string(width[0]-s.getId().length()+1,' ');
            cout << "| " << s.getNama() << string(width[1]-s.getNama().length()+1,' ');
            cout << "| " << s.getUsia() << string(width[2]-to_string(s.getUsia()).length()+1,' ');
            cout << "| " << s.getNim() << string(width[3]-s.getNim().length()+1,' ');
            cout << "| " << s.getJurusan() << string(width[4]-s.getJurusan().length()+1,' ');
            string gpa = formatDouble(s.getGpa());
            cout << "| " << gpa << string(width[5]-gpa.length()+1,' ') << "|\n";
        }
        printLine(width);
    }

    // ================= LECTURERS =================
    void printLecturers() {
        cout << "\n=== DATA LECTURER ===\n";
        vector<string> header = {"ID","Nama","Usia","NIDN","Departemen","Jabatan"};
        vector<int> width(header.size(),0);

        for (int i=0;i<header.size();i++) width[i]=header[i].length();

        for (auto &d: lecturers) {
            width[0] = max(width[0], (int)d.getId().length());
            width[1] = max(width[1], (int)d.getNama().length());
            width[2] = max(width[2], (int)to_string(d.getUsia()).length());
            width[3] = max(width[3], (int)d.getNidn().length());
            width[4] = max(width[4], (int)d.getDepartemen().length());
            width[5] = max(width[5], (int)d.getJabatan().length());
        }

        printLine(width);
        cout << "|";
        for (int i=0;i<header.size();i++)
            cout << " " << header[i] << string(width[i]-header[i].length()+1,' ') << "|";
        cout << "\n";
        printLine(width);

        for (auto &d: lecturers) {
            cout << "| " << d.getId() << string(width[0]-d.getId().length()+1,' ');
            cout << "| " << d.getNama() << string(width[1]-d.getNama().length()+1,' ');
            cout << "| " << d.getUsia() << string(width[2]-to_string(d.getUsia()).length()+1,' ');
            cout << "| " << d.getNidn() << string(width[3]-d.getNidn().length()+1,' ');
            cout << "| " << d.getDepartemen() << string(width[4]-d.getDepartemen().length()+1,' ');
            cout << "| " << d.getJabatan() << string(width[5]-d.getJabatan().length()+1,' ') << "|\n";
        }
        printLine(width);
    }

    // ================= STAFFS =================
    void printStaffs() {
        cout << "\n=== DATA STAFF ===\n";
        vector<string> header = {"ID","Nama","Usia","Posisi","Gaji","Shift"};
        vector<int> width(header.size(),0);

        for (int i=0;i<header.size();i++) width[i]=header[i].length();

        for (auto &s: staffs) {
            width[0] = max(width[0], (int)s.getId().length());
            width[1] = max(width[1], (int)s.getNama().length());
            width[2] = max(width[2], (int)to_string(s.getUsia()).length());
            width[3] = max(width[3], (int)s.getPosisi().length());
            width[4] = max(width[4], (int)to_string((int)s.getGaji()).length());
            width[5] = max(width[5], (int)s.getShift().length());
        }

        printLine(width);
        cout << "|";
        for (int i=0;i<header.size();i++)
            cout << " " << header[i] << string(width[i]-header[i].length()+1,' ') << "|";
        cout << "\n";
        printLine(width);

        for (auto &s: staffs) {
            cout << "| " << s.getId() << string(width[0]-s.getId().length()+1,' ');
            cout << "| " << s.getNama() << string(width[1]-s.getNama().length()+1,' ');
            cout << "| " << s.getUsia() << string(width[2]-to_string(s.getUsia()).length()+1,' ');
            cout << "| " << s.getPosisi() << string(width[3]-s.getPosisi().length()+1,' ');
            string gaji = to_string((int)s.getGaji());
            cout << "| " << gaji << string(width[4]-gaji.length()+1,' ');
            cout << "| " << s.getShift() << string(width[5]-s.getShift().length()+1,' ') << "|\n";
        }
        printLine(width);
    }

    // ================= TEACHING ASSISTANT =================
    void printTAs() {
        cout << "\n=== DATA TEACHING ASSISTANT ===\n";
        vector<string> header = {"ID","Nama","Usia","NIM","Jurusan","GPA","JamAsistensi","MataKuliah"};
        vector<int> width(header.size(),0);

        for (int i=0;i<header.size();i++) width[i]=header[i].length();

        for (auto &t: tas) {
            width[0] = max(width[0], (int)t.getId().length());
            width[1] = max(width[1], (int)t.getNama().length());
            width[2] = max(width[2], (int)to_string(t.getUsia()).length());
            width[3] = max(width[3], (int)t.getNim().length());
            width[4] = max(width[4], (int)t.getJurusan().length());
            width[5] = max(width[5], (int)formatDouble(t.getGpa()).length());
            width[6] = max(width[6], (int)to_string(t.getJamAsistensi()).length());
            width[7] = max(width[7], (int)t.getMataKuliah().length());
        }

        printLine(width);
        cout << "|";
        for (int i=0;i<header.size();i++)
            cout << " " << header[i] << string(width[i]-header[i].length()+1,' ') << "|";
        cout << "\n";
        printLine(width);

        for (auto &t: tas) {
            cout << "| " << t.getId() << string(width[0]-t.getId().length()+1,' ');
            cout << "| " << t.getNama() << string(width[1]-t.getNama().length()+1,' ');
            cout << "| " << t.getUsia() << string(width[2]-to_string(t.getUsia()).length()+1,' ');
            cout << "| " << t.getNim() << string(width[3]-t.getNim().length()+1,' ');
            cout << "| " << t.getJurusan() << string(width[4]-t.getJurusan().length()+1,' ');
            string gpa = formatDouble(t.getGpa());
            cout << "| " << gpa << string(width[5]-gpa.length()+1,' ');
            string jam = to_string(t.getJamAsistensi());
            cout << "| " << jam << string(width[6]-jam.length()+1,' ');
            cout << "| " << t.getMataKuliah() << string(width[7]-t.getMataKuliah().length()+1,' ') << "|\n";
        }
        printLine(width);
    }
};