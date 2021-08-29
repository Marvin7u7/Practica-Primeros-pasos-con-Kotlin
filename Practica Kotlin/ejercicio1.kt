// Ejercicio 1
fun main(){
    println("Ingrese la base: ")
    val base = readLine()?.toDouble() as Double
    println("Igresa la potencia: ")
    val exponente = readLine()?.toInt() as Int
    println(pot(base, exponente))
}

fun pot(a:Double, b:Int) : Double {
    var resultado:Double=1.0
    for(i in 1..b){
        resultado = resultado * a
    }
    return resultado
}