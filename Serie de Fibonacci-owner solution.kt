// Serie de Fibonacci, owner solution 28.10.26

fun fibon(n: Int): List<Int> {
    if (n == 1) return listOf(0)
    if (n == 2) return listOf(0, 1)

    val acum = mutableListOf(0, 1)
    (3..n).mapIndexed { i, _ ->         // i=0,1,2,..
        acum.add(acum[i] + acum[i + 1]) // necesito .add !
                                      
    }
    return acum  
}

fun main () {
    val orden = 10
    println ("Fibonacci de orden $orden es : ${fibon (orden)}")
    // Fibonacci de orden 10 es : [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
}