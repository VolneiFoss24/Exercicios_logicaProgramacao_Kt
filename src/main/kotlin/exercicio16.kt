fun main () {
    var carroUsado: String = "popular"
    var kmPercorrido: Int = 150
    var diariaSelecionada: Int = 2
    var valorConta : Int
    when (carroUsado) {
        "popular" -> if( kmPercorrido <= 100){
            valorConta = ((kmPercorrido * 0.20) * (diariaSelecionada * 90)).toInt()
        } else{
            valorConta = ((kmPercorrido * 0.10) * (diariaSelecionada * 90)).toInt()
        }
        else -> if( kmPercorrido <= 200){
            valorConta = ((kmPercorrido * 0.30) * (diariaSelecionada * 150)).toInt()
        } else {
            valorConta = ((kmPercorrido * 0.25) * (diariaSelecionada * 150)).toInt()
        }
    }

    println(valorConta)
}