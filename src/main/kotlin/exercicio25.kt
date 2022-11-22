fun main(){
    val distanciaViagem = 201
    if (distanciaViagem <= 200){
        println("O total da sua passagem é R$ ${distanciaViagem * 0.50}")
    } else {
        println("O total da sua passagem é R$ ${distanciaViagem * 0.45}")
    }
}