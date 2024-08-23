fun main (){
      println("Digite um numero:")
   val numero = readLine()!!.toInt() //definicao do valor do numero  a ser verificado
    if(numero > 0){
        println("o numero é positivo")//se for verdade imprime isso
    }else if(numero < 0){ //caso contrario verifica se o numero e menor que 0
        println("O numero e negativo") //caso contrario verifica se o numero se e 0
    }else{
        println("O numero e 0")// e isso ai
    }
}