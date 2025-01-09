// val: Declara una variable de solo lectura (inmutable). Una vez asignado un valor, no puede ser cambiado.
// var: Declara una variable mutable. El valor de la variable puede ser cambiado después de su inicialización.
// const val: Declara una constante de tiempo de compilación. El valor de la constante debe ser asignado en tiempo de compilación y no puede ser cambiado.
// lateinit var: Declara una variable que no tiene un valor inicial. La variable debe ser inicializada antes de ser usada, de lo contrario, se lanzará una excepción.

fun mainVariables(){
  val nombre: String = "Juan" // constante/inmutable
  println("Hola: $nombre")

  var edad: Int = 25 // variable tipo int
  println("Edad: $edad")

  edad = 26
  println("Edad actualizada: $edad")

  //? tambien se puede declarar una variable sin especificar el tipo de dato, dado que el compilador va a inferir el tipo del valor asignado

  val nombre1 = "Juan"
  var edad1 = 29
  println("Nombre: $nombre1, Edad: $edad1")

  val altura: Double = 1.75
  val peso = 70.5f
  val esEstudiante = true
  val On = true
  val inicial = 'a'

  println(altura)
  println(peso)
  println(esEstudiante)
  println(On)
  println(inicial)

}