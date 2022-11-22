fun main(){
    var contador = 0
    var soma = 0
    val numerosInt = (1..7).random()

    while (contador <= 7){
        soma += numerosInt
        contador ++
    }

    println("A soma dos 7 numeros inteiros são : ${soma}")
}