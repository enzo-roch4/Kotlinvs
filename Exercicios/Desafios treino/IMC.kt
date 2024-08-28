import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var sair: Char

    do{
        coletarDados()
        println("Tele [c] para ontinuar ou [s] para sair: ")
        sair = scanner.next()[0]
    } while(sair != 's')

}

fun coletarDados(){

    val scanner = Scanner (System.`in`)
    var peso: Float
    var altura: Float

    println("Digite seu peso? ")
    peso = scanner.nextFloat()
    println("Digite sua altura? ")
    altura = scanner.nextFloat()

    val imc = calcularIMC(peso,altura)
    println("Seu IMC e: %2f | ".format(imc) )

    when {
    imc < 18.5 -> println("So a tripa")
    imc < 24.9 -> println("Normal" )
    imc < 29.9 -> println("Pesadinho")
    imc < 39.9 -> println("GIGA")
    imc < 45 -> println("IMENSO!")
    else -> println("Valor invalido")
   }

}


fun calcularIMC(peso:Float, altura: Float):Float{
    var resultado = peso /(altura * altura)
    return resultado
}