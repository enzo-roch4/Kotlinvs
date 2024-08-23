fun main (){
    println("Digite a nota:")
   val nota = readLine()!!.toInt()

   // usando when para o conceito de notas

   val conceito = when (nota){
    in 0..46 -> "F" //deu muito ruim
    in 50..59 -> "D" //deu ruim
    in 59..69 -> "C" //é ta ruim ainda
    in 69..79 -> "B" //bom 
    in 80..100 -> "A" //otimo
    else -> "Nota invalida"
   }

   println("Conceito:$conceito")

}