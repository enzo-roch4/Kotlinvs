// fazer um programa que verifica se é par ou impar

fun main(){
   println("Digite um numero:")
   val numero = readLine()!!.toInt()

   if(numero%2 == 0){
    println("é par")
   }else{
    println("é impar")
   }
}