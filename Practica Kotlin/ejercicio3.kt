// Ejercicio 3
fun main(){
    print("Escriba el numero del 1 al 12: ")
    val n = readLine()?.toInt() as Int

    if(n==1)
        println("Enero")
    else if (n==2)
        println("Febrero")
    else if (n==3)
        println("Marzo")
    else if (n==4)
        println("El mes que nacio marquito")
    else if (n==5)
        println("Mayo")
    else if (n==6)
        println("Junio")
    else if (n==7)
        println("Julio")
    else if (n==8)
        println("Agosto")
    else if (n==9)
        println("Septiembre")
    else if (n==10)
        println("Octubre")
    else if (n==11)
        println("Noviembre")
    else if (n==12)
        println("Diciembre")
    else
        println("El numero no esta en el rango :(")
}