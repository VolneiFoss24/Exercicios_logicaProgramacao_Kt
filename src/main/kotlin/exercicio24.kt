fun main(){
    val nome = "Vitoria"
    val sexo = "f"
    val precoProduto = 200

    if (sexo == "M".lowercase()){
        println("${nome}, você ganhou um desconto de 5% o total da sua compra é ${precoProduto - (precoProduto * 0.05)}")
    } else {
        println("${nome}, parabéns pelo seu dia!, você ganhou um desconto de 13% o total da sua compra é ${precoProduto - (precoProduto * 0.13)}")
    }
0}