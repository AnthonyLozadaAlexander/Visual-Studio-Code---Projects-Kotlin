import kotlin.math.abs
import java.util.Scanner

fun main(){
  var num: Int
  var input = Scanner(System.`in`)
  var absoluto: Int

  println("Ingrese un número: ")
  num = input.nextInt()

  absoluto = abs(num)

  println("El valor absoluto de $num es: $absoluto")
  
}