/*
  12345
  1234
  123
  12
  1 
*/
import java.util.Scanner

fun main() {
  val scn: Scanner = Scanner(System.`in`)

  print("Masukkan Tinggi Segitiga : ")
  var tinggi: Int = scn.nextInt()
  var n_kolom: Int = tinggi

  for(baris in 1..tinggi) {
    for(kolom in 1..n_kolom) {
      print(kolom)
    }
    n_kolom -= 1
    println("")
  }
}
