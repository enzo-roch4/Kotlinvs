//verificando acesso usuario

fun main(){
//  pede as informações do usuario
    println("Digite seu usuario:")
    val usuario = readLine()!!.toString()
    println("Digite sua senha:")
    val senha = readLine()!!.toString()

//  faz a verificação 
    if(usuario == "kenzo" && senha == "senha123"){
        println("Acesso liberado")
    }else{
        println("Acesso negado")
    }
}