import java.util.Scanner

fun main() {
  // RUMUS LINGKARAN
  // K = pi * 2 * r
  // L = pi * r * r
  val scn: Scanner = Scanner(System.`in`)

  print("Masukkan Jari-Jari Lingkaran : ")
  var r: Double = scn.nextDouble()
  var pi: Double = 22.0 / 7.0
  var K: Double = pi * 2.0 * r
  var L: Double = pi * r * r

  println("Keliling = " + K)
  println("Luas = " + L)
}
