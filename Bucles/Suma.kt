import java.util.Scanner
import kotlin.intArrayOf

fun main(){
  var input = Scanner(System.`in`)
  var suma = 0
  var num: Int

  println("Ingrese hasta que numero desea sumar") 
  num = input.nextInt()

  for (i in 1.. num){
    
    println("$suma + $i")
    suma = suma + i
    println("= $suma")
    
  }
}