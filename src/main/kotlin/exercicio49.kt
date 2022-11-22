fun main(){
    var contador = 0
    var numeroAcima5 = 0
    var numeroDivisivel = 0
    while (contador <= 20) {
        var numeroInt = (1..10).random()
        println("Numero sorteado: ${numeroInt}")
        if (numeroInt >= 5) {
            numeroAcima5 += 1
        } else if (numeroInt % 3 == 0 ) {
            numeroDivisivel += 1
        }

        contador++
    }
    println()
    println("Os numeros divisiveis por 3 sao : ${numeroDivisivel}")
    println("Os numeros acima de 5 sao : ${numeroAcima5}")
}