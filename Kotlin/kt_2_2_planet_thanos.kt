/*
Jumlah penduduk di Planet Thanos sangat unik.
- Di hari pertama, hanya ada 1 penduduk.
- Di hari-hari berikutnya - setiap harinya - Dr Strange muncul dan menggandakan penduduknya menjadi 3x lipat dari hari sebelumnya
- Namun di hari kelipatan 3, Thanos selalu muncul dan menghilangkan 1/2 jumlah penduduk (pembulatan ke bawah)
- Di saat Thanos muncul, Dr Strange tidak berani muncul

Berapa jumlah penduduk Planet Thanos di hari ke 50?

Hint: 
Hari ke-1: ada 1 penduduk
Hari ke-2: ada 3 penduduk = (1 * 3) -> Dr Strange muncul
Hari ke-3: ada 1 penduduk = (3 / 2) -> Thanos muncul
Hari ke-4: ada 3 penduduk = (1 * 3) -> Dr Strange muncul
Hari ke-5: ada 9 penduduk = (3 * 3) -> Dr Strange muncul
Hari ke-6: ada 4 penduduk = (9 / 2) -> Thanos muncul
*/
// Hari ke-50: ada 50.196.510.036 penduduk
import java.util.Scanner

fun main() {
  val scn: Scanner = Scanner(System.`in`)

  println("Cari Tau Jumlah Penduduk Di Planet Thanos")
  print("Masukkan Hari : ")
  var n_hari: Int = scn.nextInt()
  var penduduk: Long = 1

  for(h in 1..n_hari) {
    if(h != 1) {
      if(h % 3 ==0) { // Thanos Muncul
        penduduk /= 2
      }
      else { // Dr Strange Muncul
        penduduk *= 3
      }
    }
    println("Hari ke-"+h+": ada "+penduduk+" penduduk")
  }
  
}
