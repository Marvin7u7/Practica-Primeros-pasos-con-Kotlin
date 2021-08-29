// Ejercicio 5
fun main(){
    print("Ingrese el numero 1: ")
    val num1 = readLine()?.toInt() as Int

    print("Ingrese el numero 2: ")
    val num2 = readLine()?.toInt() as Int

    print("Ingrese el numero 3: ")
    val num3 = readLine()?.toInt() as Int

    val mayor = if (num1 >num2 && num1 > num3) num1 else if (num2 > num3) num2 else num3
    println ("El mayor de la lista es $mayor")

}