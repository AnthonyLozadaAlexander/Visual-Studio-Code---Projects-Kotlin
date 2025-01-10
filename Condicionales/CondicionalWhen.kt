import java.util.Scanner

fun main(){
  //Switch para los dias de la semana
  var dia: Int
  var input = Scanner(System.`in`)
  println("Ingrese un dia de la semana: [1,2,3,4,5,6,7]\n")
  dia = input.nextInt()

  when(dia){
    1 -> println("Lunes")
    2 -> println("Martes")
    3 -> println("Miercoles")
    4 -> println("Jueves")
    5 -> println("Viernes")
    6 -> println("Sabado")
    7 -> println("Domingo")
    else -> println("Dia no valido")
  }
}