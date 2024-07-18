package org.example

fun esPalindroma(word: String): Boolean{
    val cleanedWord = word.lowercase()
    return cleanedWord == cleanedWord.reversed()
}

fun containsAtLeastTwoDifferentVowels(word: String): Boolean{
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val vocalesEncontradas = mutableSetOf<Char>()
    for (char in word.lowercase()) {
        if (char in vocales) {
            vocalesEncontradas.add(char)
            if (vocalesEncontradas.size >= 2) {
                return true
            }
        }
    }
    return false
}

fun empiezaConConsonante(word: String): Boolean{
    val consonante = "bcdfghjklmnpqrstvwxyz"
    return word.isNotEmpty() && word[0].lowercaseChar() in consonante
}

fun main(){
    println("Ingresa varias palabras separadas por espacios")
    val input = readLine()

    if (input != null && input.isNotBlank()) {
        val palabras = input.split(" ")
        var contadorPalindromas = 0
        var contadorPalabrasConDosVocales = 0
        var contadorPalabrasInicianConConsonante = 0

        for (word in palabras) {
            if (esPalindroma(word)) contadorPalindromas++
            if (containsAtLeastTwoDifferentVowels(word)) contadorPalabrasConDosVocales++
            if (empiezaConConsonante(word)) contadorPalabrasInicianConConsonante++
        }

        println("Cantidad de palabras palíndromas: $contadorPalindromas")
        println("Cantidad de palabras con al menos 2 vocales distintas: $contadorPalabrasConDosVocales")
        println("Cantidad de palabras que inician con una letra consonante: $contadorPalabrasInicianConConsonante")
    } else {
        println("Por favor, ingrese palabras válidas.")
    }

}