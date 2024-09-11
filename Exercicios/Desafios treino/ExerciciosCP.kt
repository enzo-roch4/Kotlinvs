
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

 class Tarefa(val nome: String, var concluida: Boolean = false)
fun main() {
    // Lista 
    val tarefas = mutableListOf<Tarefa>()

    // Loop para manter o programa executando
    while (true) {
        println(" Bem vindo a Lista de tarefas! Opções:")
        println("1. Adicionar sua tarefa")
        println("2. Listar todas as tarefas")
        println("3. Concluir uma tarefa")
        println("4. Sair")

        print("Escolha uma opção: ")
        val opcao = readLine()!!.toInt()
        when (opcao) {
            1 -> {
                // Adicionar tarefas
                print("Digite o nome da tarefa: ")
                val nomeTarefa = readLine()!!
                tarefas.add(Tarefa(nomeTarefa))
                println("Tarefa adicionada com sucesso!")
            }
            2 -> {
                // Listar tarefas
                println("Tarefas:")
                tarefas.forEachIndexed { index, tarefa ->
                    println("${index + 1}. ${tarefa.nome} - ${if (tarefa.concluida) "Concluída" else "Não concluída"}")
                }
            }
            3 -> {
                // Conclusao de tarefa :p
                print("Digite o número da tarefa para concluir: ")
                val numTarefa = readLine()!!.toInt() - 1
                if (numTarefa >= 0 && numTarefa < tarefas.size) {
                    tarefas[numTarefa].concluida = true
                    println("Tarefa concluída com sucesso!")
                } else {
                    println("Tarefa não encontrada!")
                }
            }
            4 -> {
                // Sair do programa
                println("Saindo do programa...")
                return
            }
            else -> {
                println("Opção inválida!")
            }
        }
    }
}