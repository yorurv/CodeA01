/*
=> Program C++ <=
=> Nilai Siswa <=
Buatlah sebuah Array untuk menyimpan 10 nilai siswa.
Nilai dimasukkan kedalam Array satu- persatu hingga penuh.
Lalu cari nilai rata-rata, nilai tertinggi dan nilai terrendah.
*/

#include <iostream>

using namespace std;

int main() {
    // Write C++ code here
    cout << "Masukkan Jumlah Siswa : ";
    int jumlah_siswa;
    cin >> jumlah_siswa;
    
    int nilai_siswa[jumlah_siswa];
    
    for(int i=0; i < jumlah_siswa; i++) {
        cout << "Nilai Ke-" << (i+1) << " : ";
        cin >> nilai_siswa[i];
    }
    
    double total_nilai, rata_rata;
    int nilai_tertinggi = nilai_siswa[0],
        nilai_terrendah = nilai_siswa[0];
    
    for(int i=0; i < jumlah_siswa; i++) {
        // Nilai Tertinggi
        if(nilai_tertinggi < nilai_siswa[i]) {
            nilai_tertinggi = nilai_siswa[i];
        }
        // Nilai Terrendah
        if(nilai_terrendah > nilai_siswa[i]) {
            nilai_terrendah = nilai_siswa[i];
        }
        // Menghitung Total Nilai
        total_nilai += double(nilai_siswa[i]);
    }
    // Mencari Rata Rata
    rata_rata = total_nilai / double(jumlah_siswa);
    
    cout << "Total Nilai = " << total_nilai << "\n";
    cout << "Nilai Rata-Rata = " << rata_rata << "\n";
    cout << "Nilai Tertinggi = " << nilai_tertinggi << "\n";
    cout << "Nilai Terrendah = " << nilai_terrendah << "\n";

    return 0;
}
