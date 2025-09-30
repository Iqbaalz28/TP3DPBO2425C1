# TP3DPBO2425C1

## Janji
Saya Iqbal Rizky Maulana dengan NIM 2408622 mengerjakan Tugas Praktikum 3 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## 📖 Deskripsi
Program ini merupakan implementasi konsep **Object-Oriented Programming (OOP)** dalam bahasa C++, Python, dan Java dengan studi kasus **Universitas**. Desain program menggunakan **hierarchical & multilevel inheritance**, **composition**, serta **array of object**, dan dapat menambahkan data secara **dinamis**.

## 🏫 Diagram UML
<img width="554" height="441" alt="Diagram Universitas TP3" src="https://github.com/user-attachments/assets/7c9861a3-52bb-4103-9e4b-5451b663446d" />

## 📖 Desain Program (Inheritance & Composition)

### 1. Inheritance digunakan agar tidak ada pengulangan atribut dasar (id, nama, usia).
→ Semua turunan Person otomatis punya atribut tersebut.
    
### 2. TeachingAssistant mewarisi Student karena TA = mahasiswa yang bekerja tambahan.
→ Jika dia bukan mahasiswa, tidak bisa menjadi TA.
    
### 3. Composition digunakan pada University, karena sebuah universitas terdiri dari banyak entitas (mahasiswa, dosen, staf, TA, mata kuliah).
→ Konsep "has-a": Universitas memiliki mahasiswa, dosen, dst.

## 🏛️ Atribut & Methods Kelas

### 1. **Person (Superclass)**
Kelas dasar yang merepresentasikan individu dalam universitas.  
**Atribut:** `id`, `nama`, `usia`  
**Method:** getter & setter  

### 2. **Student (extends Person)**
Mewakili mahasiswa.  
**Atribut:** `nim`, `jurusan`, `gpa`  
**Method:** getter & setter  

### 3. **Lecturer (extends Person)**
Mewakili dosen.  
**Atribut:** `nidn`, `departemen`, `jabatan`  
**Method:** getter & setter  

### 4. **Staff (extends Person)**
Mewakili pegawai universitas.  
**Atribut:** `posisi`, `gaji`, `shift`  
**Method:** getter & setter  

### 5. **TeachingAssistant (extends Student)**
Mewakili asisten dosen yang juga mahasiswa.  
**Atribut:** `jamAsistensi`, `mataKuliah`  
**Method:** getter & setter  

### 6. **Course**
Mewakili mata kuliah yang diajarkan di universitas.  
**Atribut:** `kode`, `nama`, `sks`, `dosenPengampu`  
**Method:** getter & setter  

### 7. **University (Composite Class)**
Kelas utama yang merepresentasikan universitas.  
**Atribut:** `nama`, `alamat`, `akreditasi`  
Memiliki koleksi: `students`, `lecturers`, `staffs`, `tas`, `courses`  
**Method:**  
- `addStudent()`, `addLecturer()`, `addStaff()`, `addTA()`, `addCourse()`  
- `printStudents()`, `printLecturers()`, `printStaffs()`, `printTAs()`, `printCourses()`  
- `printInfo()` → menampilkan identitas universitas

## 📖 Penjelasan Relasi

### 1. Inheritance (Generalization)
- Student, Lecturer, Staff, TeachingAssistant mewarisi Person
  → Karena semua entitas tersebut adalah manusia (memiliki id, nama, usia).
- TeachingAssistant mewarisi Student
  → Karena asisten dosen pada dasarnya adalah mahasiswa yang membantu mengajar.
  → Dia punya atribut tambahan: jamAsistensi dan mataKuliah.

### 2. Composition (Has-a Relationship)
- University memiliki banyak Student, Lecturer, Staff, TeachingAssistant, Course
  → Artinya data-data ini “dimiliki” oleh universitas.
  → Jika universitas dihapus, maka data anggota universitas (student, lecturer, dll) juga hilang.
- Course berdiri sendiri (bukan turunan Person), tapi dimiliki oleh University.

## 🔄 Alur Program

### 1. Inisialisasi Universitas
- Objek University dibuat dengan data identitas universitas (nama, alamat, akreditasi).
### 2. Pengisian Data Awal
- Beberapa objek Student, Lecturer, Staff, TeachingAssistant, dan Course ditambahkan ke universitas menggunakan method addStudent(), addLecturer(), dsb.
### 3. Menampilkan Informasi Awal
- Fungsi printInfo() menampilkan identitas universitas.
- Fungsi printStudents(), printLecturers(), printStaffs(), printTAs(), dan printCourses() menampilkan data dalam bentuk tabel dinamis.
- Lebar tabel dihitung otomatis berdasarkan panjang data terpanjang di setiap kolom.
### 4. Menu Tambah Data
- Program menampilkan menu pilihan (Student, Lecturer, Staff, TA, Course).
- User memilih kategori data yang ingin ditambahkan.
- User menginput data baru sesuai atribut kelas terkait.
### 5. Penyimpanan Data Baru
- Data yang dimasukkan user ditambahkan ke list universitas (vector<Student>, vector<Lecturer>, dll).
### 6. Menampilkan Data Setelah Penambahan
- Program kembali memanggil method print untuk menampilkan data terbaru, sehingga user bisa melihat perbedaan sebelum dan sesudah penambahan.

## 📸 Dokumentasi Program

- Output Program:

  <img width="695" height="555" alt="image" src="https://github.com/user-attachments/assets/f425f6e9-bf37-4ca3-b13f-854a29f3acb0" />
  
- Penambahan Data:

   <img width="478" height="221" alt="image" src="https://github.com/user-attachments/assets/15776617-7954-4daf-b905-bfdb90debce1" />
  
  <img width="733" height="555" alt="image" src="https://github.com/user-attachments/assets/69ee13a2-7a3b-4406-976b-f2fac4fb51a8" />

