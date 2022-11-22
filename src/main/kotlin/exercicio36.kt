fun main(){
    val carro = "luxo"
    val aluguelDiaria = 2
    val kmPercorrido = 500

    when (carro) {
        "popular" -> if (kmPercorrido <= 100){
            println("Valor a pagar: \nR$ ${(aluguelDiaria * 90) + (kmPercorrido * 0.20)}")
        } else {
            println("Valor a pagar: \nR$ ${(aluguelDiaria * 90) + (kmPercorrido * 0.10)}")
        }
        else -> if (kmPercorrido <= 200) {
            println("Valor a pagar: \nR$ ${(aluguelDiaria * 150) + (kmPercorrido * 0.30)}")
        } else {
            println("Valor a pagar: \nR$ ${(aluguelDiaria * 150) + (kmPercorrido * 0.25)}")
        }
    }
}