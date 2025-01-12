import java.util.Scanner

fun main(){
  //* Declaracion de variables */
  var x: Int
  var y: Int
  var z: Int
  var input = Scanner(System.`in`)
  
  //* Inicializacion de variables */
  println("Ingrese el numero en x")
  x = input.nextInt()

  println("Ingrese el numero en y")
  y = input.nextInt()

  println("Ingrese el numero en z")
  z = input.nextInt()

  if(x > y && x > z){
    println("El numero mayor es: $x")
  }
  else if(y > x && y > z){
    println("El numero mayor es: $y")
  }
  else if(z > x && z > y){
    println("El numero mayor es: $z")
  }
  else{
    println("Los numeros son iguales")
  }

}