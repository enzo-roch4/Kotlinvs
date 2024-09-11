
/* 
fun main(){
    //calculadora 
    println("Digite o primeiro numero: ")
    val num1 = readLine()!!.toInt()
    println("Digite o segundo numero: ")
    val num2 = readLine()!!.toInt()
    println("Digite a operação (+, -, *, /): ")
    val operacao = readLine()!!.trim()


    val calculoConta = when (operacao) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0) num1 / num2 else "Erro: Divisão por zero"
        else -> "Operação inválida"
        }

        println("o resultado do seu calculo e: $calculoConta")
}
 */

 
/* 
fun main(){
    //vendo se é palindromo ou n
    println("Digitee uma palavra para ver se é um palindomro ou não: ")
    val palavra = readLine()!!.toString()

    val palavraInvertida = palavra.reversed()

    if(palavra == palavraInvertida){
        println("A palavra $palavra é um palindromo")
    }else{
        println("A palavra $palavra não é um palindromo")
    }

}
 */