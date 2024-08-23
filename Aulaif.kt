fun main() {

     println("Digite sua idade:")
     val idadeInput = readLine()
     

    if (idadeInput == null){
        println("Entrada invalida")
        return
    }   


    val idade = idadeInput.toIntOrNull()
    if(idade == null ){
        println("Entrada invalida")
        return
    }

    if(idade >= 18){
        println("Pode beber")
    }else{
        println("sai dae doido")
    }
}