//programa que verifica se o usario possui ou não carteira de habilitação
fun main (){
    println("Digite sua idade:")
   val idade = readLine()!!.toInt()
    println("Possui carteira de motorista?(True ou False):")
   val carteira = readLine()!!.toBoolean()

   if(idade >= 18 && carteira == true){
    println("é maior de idade e possui carteira")
   }else if(idade >= 18 && carteira == false){
        println("é maior de idade e nao possui carteira")
   }else if(idade <= 18 && carteira == false){
         println("nao maior de idade e nao possui carteira")
    }else{
        println("nao deveria ter meu querido vai ser preso!")
    }
}