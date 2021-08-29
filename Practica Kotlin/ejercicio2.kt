// Ejercicio 2
fun main(){
    val notas = intArrayOf(100, 100, 98, 13, 20)
    val promedio = notas.average() 
    println("El promedio es $promedio")

    if (promedio >= 90)
        println("Puede optar a una beca.")
    else
        println("No puedes optar a la beca. Siga esforzandose.")

}