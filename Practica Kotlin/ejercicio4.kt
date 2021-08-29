// Ejercicio 4
fun main(){
    print("Ingrese su salario mensual: ")
    val salario = readLine()?.toInt() as Int

    val validacion = when{
        salario in 0..5000 -> "No aplica al credito"
        salario in 5001..10000 -> "Disponibilidad de C$500 a C$1000"
        salario in 10001..20000 -> "Disponibilidad de C$1000 a C$3000"
        salario in 20001..40000 -> "Disponibilidad de C$3000 a C$5000"
        salario >= 40001 -> "Disponibilidad de C$5000 a C$2000"
        else -> "Error de salario"
    }

    println(validacion)
}