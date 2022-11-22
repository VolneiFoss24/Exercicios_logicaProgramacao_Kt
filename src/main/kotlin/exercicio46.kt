fun main(){
    var contador = 500
    var soma = 0

    while (contador >= 0) {
        soma += contador
        contador -= 50
    }

    println("A Soma da operação é ${soma}")
}