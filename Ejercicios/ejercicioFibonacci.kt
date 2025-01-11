import java.util.Scanner

fun main() {
  var numLimit: Int
  var input = Scanner(System.`in`)
  var suma: Int 
  var a: Int
  var b: Int
  

  println("Ingrese el número límite para la serie de Fibonacci: ")
  numLimit = input.nextInt()

  println("------------------------------------------------------\n")
  a = 0
  b = 1

  println(a)
  println(b)
  
  println("La serie de Fibonacci es: ")
  for(i in 0..numLimit)
  { 
    suma = (a + b)
    println(suma)
    a = b
    b = suma
    
  }
}