import java.util.Scanner

fun main(){
   var input = Scanner(System.`in`)
   var x: Int

   println("Ingrese su calificacion final")
   x = input.nextInt()

  when(x)
  {
      10-> println("Matricula Honor")
      9 -> println("Sobresaliente")
      7 -> println("Notable")
      6 -> println("Bien")
      5 -> println("Aprobado")
      4 -> println("Suspenso")
  }
}