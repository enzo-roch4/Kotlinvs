fun  main() {
    println("Digite o numero da sua coxinha (de 1 a 5) todas são 5 reais! \t Cerveja por 15")
    val coxinha = readLine()!!.toInt()

    val conceito = when (coxinha){
    in 1..1 -> "Frango" 
    in 2..2 -> "Frango e Bacon" 
    in 3..3 -> "Frango e Catupyri"
    in 4..4 -> "Calabresa" 
    in 5..5 -> "Rato" 
    else -> "nenhuma coxinha selecionado"
   }
   println("Coxinha:$conceito") 
    
    println("Digite a quantidade de cervejas: ")
    val quantidadeCerveja = readLine()!!.toInt()

    println("Digite a quantidade de coxinhas: ")
    val quantidadeCoxinha = readLine()!!.toInt()

    var quantidade1 = quantidadeCerveja
    var quantidade2 = quantidadeCoxinha
    var calculoCoxinha = quantidade2 * 5
    var calculoCerveja = quantidade1 * 15
    var calculo = calculoCerveja + calculoCoxinha
    println("o total da compra e: $calculo");

    println("Comanda\t\t Lanche: $conceito, quantidade coxinhas: $quantidadeCoxinha, quantidade cerveja: $quantidadeCerveja Total: $calculo");
    

    
}