/*
## PROGRAM KASIR P.1 ##
------------------------
Harga Barang : 5000
Jumlah Barang : 5
------------------------
Total : 25000
Bayar : 50000
Kembalian : 25000
*/
#include <iostream>

using namespace std;

int main() {
    cout << "## PROGRAM KASIR P.1 ##" << "\n";
    cout << "------------------------" << "\n";
    
    cout << "Harga Barang : ";
    long harga_barang;
    cin >> harga_barang;
    
    cout << "Jumlah Barang : ";
    int jumlah_barang;
    cin >> jumlah_barang;
    
    cout << "------------------------" << "\n";
    
    long total = harga_barang * jumlah_barang;
    cout << "Total : " << total << "\n";
    
    cout << "Bayar : ";
    long bayar;
    cin >> bayar;
    
    long kembalian = bayar - total;
    cout << "Kembalian : " << kembalian;

    return 0;
}
