// mapIndexed
fun main () {
    val pliga = listOf("A","B","C","D")
    val capi = pliga.mapIndexed {index,elem ->
        List (index+1) {elem}
        
    }
    println(capi)  // [[A], [B, B], [C, C, C], [D, D, D, D]]
}