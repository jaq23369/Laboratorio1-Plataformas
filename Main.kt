package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun decimalToBinary(decimal: Int): String{
    return Integer.toBinaryString(decimal)
}

fun main(){
    println("Ingrese un numero decimal:")
    val input = readlnOrNull()?.toIntOrNull()

    if (input != null) {
        val binary = decimalToBinary(input)
        println("El numero $input en binario es: $binary")
    }else {
        println("Por favor, ingresa un numero valido")
    }
}