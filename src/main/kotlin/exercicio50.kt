fun main(){
    var contador = 0
    var maiorPreco = 0
    var menorPreco = 0

    while(contador <= 8) {
        var precoProdutos = (0..2000).random()
        println(precoProdutos)
        if (contador == 1){
            maiorPreco = precoProdutos
            menorPreco = precoProdutos

        } else if (precoProdutos > maiorPreco) {
            maiorPreco = precoProdutos

        } else if (precoProdutos < menorPreco){
            menorPreco = precoProdutos
        }
        contador++
    }
    println()
    println("O menor preço digitado foi R$ ${menorPreco}")
    println("O maior preço digitado foi R$ ${maiorPreco}")
}