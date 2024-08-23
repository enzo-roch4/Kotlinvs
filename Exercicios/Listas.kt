//    listas!
//fun main() {
//    val numero = arrayOf (10, 20, 30)
//// loop
//    for (numero in numero) {
//        println("Numero: $numero")
//    }
//}

fun main() {
    val idades = arrayOf(8,30,45)

    // printar pela posição
    println("a idade solicitada é ${idades[1]}")

    val alturas = FloatArray(256)

    //outra forma de declaração
    alturas[0] = 1.71f
    alturas[1] = 1.78f
    alturas[2] = 1.90f
    alturas[3] = 1.50f
    //imprimindo pela posição

    println("O registo da posição UM de alturas é: %.2f".format(alturas[0]))
    println("O registo da posição DOIS de alturas é: %.2f".format(alturas[1]))
    println("O registo da posição TRES de alturas é: %.2f".format(alturas[2]))

    val nome = charArrayOf('A','B','C','E','F','G')
    println("O regstro 0 de nomes é ${nome[4]}")

    val empresa = "Fiap"
    println("O nome da empreesa é: ${empresa[3]}")

    var tamanho: Int
    tamanho = nome.size
    println("Posição do ultimo caractere de nome é: ${nome[tamanho -1]}")

    println("Quantidade de iteens: ${idades.size}")
    println("Peso do array: ${idades.size * 4} bytes")

    val pares = arrayOf(2,4,6,8)
    val impares = arrayOf(1,3,5,7)

    val soma = pares.size + impares.size

    println("a soma dos array é: ${soma}")
}