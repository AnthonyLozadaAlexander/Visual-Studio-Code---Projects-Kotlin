fun mainCondicionalIfElse() {
    val numero = 15

    if (numero > 0) {
        if (numero % 2 == 0) {
            println("El número es positivo y par")
        } else {
            println("El número es positivo e impar")
        }
    } else {
        if (numero == 0) {
            println("El número es cero")
        } else {
            println("El número es negativo")
        }
    }
}