fun main(){

  var myMap: Map<String, Int> = mutableMapOf()
  println(myMap)

  myMap = mutableMapOf("Jorge" to 10, "Jhon" to 16, "Katherine" to 20)
  println(myMap)

  println()

  println("Jorge tiene ${myMap["Jorge"]} manzanas")

  myMap["Jorge"] = 15

  println("Jorge tiene ${myMap["Jorge"]} manzanas")
}