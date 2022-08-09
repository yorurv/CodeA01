import java.util.Scanner

fun main() {
  val scn: Scanner = Scanner(System.`in`)
  print("Input Sebuah Angka : ")

  var angka: Int = scn.nextInt()
  println("=============================")
  println("Angka yang dapat membagi " + angka + " tanpa sisa adalah :")

  var result = 0

  for(n in 1..angka) {
    if(angka % n == 0) {
      if(result == 0) {
        print("" + n)
      }
      else {
        print(", " + n)
      }
      result += 1
    }
  }
}
