fun mainFor() {
  
  /*   En estos ejemplos:
- `1..5` crea un rango de números del 1 al 5.
- `listOf("Manzana", "Banana", "Cereza")` crea una lista de frutas.
- `step` se utiliza para especificar el incremento en cada iteración.
- `downTo` se utiliza para iterar en orden inverso.
- `frutas.indices` proporciona los índices de la lista `frutas`.
*/ 
    // Iterar sobre un rango de números del 1 al 5
    for (i in 1..5) 
    {
        println(i)
    }

      val frutas = listOf("Manzana", "Banana", "Cereza")      
      // Iterar sobre una lista de frutas
      for (fruta in frutas)
      {
        println(fruta)
      }

      // Iterar sobre un rango de números del 1 al 10 con un paso de 2
    for (i in 1..10 step 2) {
      println(i)
    }
            
    val frutas1 = listOf("Manzana", "Banana", "Cereza")

    // Iterar sobre los índices de la lista de frutas
    for (index in frutas1.indices) {
        println("Índice: $index, Fruta: ${frutas1[index]}")
    }

}
