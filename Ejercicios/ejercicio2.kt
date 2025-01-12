/*
Cree un programa en Java que solicite al usuario dos números y responda si son positivos o si ambos lo son, utilizando el operador condicional ?.

Instrucciones:
Solicite al usuario un número y guárdelo en una variable llamada "a".
Solicite al usuario otro número y guárdelo en una variable llamada "b".
Utilice el operador condicional para evaluar si "a" es positivo y muestre "A es positivo" o "A no es positivo" en función de esa evaluación.
Use el operador condicional para verificar si "b" es positivo y muestre "B es positivo" o "B no es positivo" en función de esa evaluación.
Finalmente, utilice el operador condicional para determinar si ambos números son positivos y muestre "Ambos son positivos" o "Ambos no son positivos" según corresponda.
Entrada
*/

import java.util.Scanner

fun main(){
  var a: Int
  var b: Int
  var input = Scanner(System.`in`)

  println("Ingrese el numero a")
  a = input.nextInt()
  println("Ingrese el numero b")
  b = input.nextInt()

  println("------------------------------------------------------")

  if(a > 0){
    println("A es positivo")
  }
  else
  {
    println("A no es positivo")
  }

  if(b > 0){
    println("B es positivo")
  }else
  {
    println("B no es positivo")
  }

  if(a > 0 && b > 0){
    println("Ambos son positivos")
  }
  else{
    println("Ambos no son positivos")
  }

}