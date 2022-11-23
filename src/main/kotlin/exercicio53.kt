fun main() {

    var contador = 1
    var totalHomens = 0
    var idadeHomens =0
    var totalMulheres = 0
    var idadeMulheres = 0
    var mulheresMaisVelhas = 0
    var media = 0


    while (contador <= 5){
        val sexo = (1..2).random()
        val idadeH = (1..100).random()
        val idadeM = (1..100).random()

        if (sexo == 1){
            totalHomens += 1
            idadeHomens += idadeH
        } else {
            totalMulheres += 1
            idadeMulheres += idadeM
            if (idadeM > 20){
                mulheresMaisVelhas +=1
            }
        }
        media = idadeM + idadeH
        contador++
    }

    println("A idade média do grupo é: ${(idadeHomens + idadeMulheres) / (totalHomens + totalMulheres)}")
    println("O total de homens cadastrados é: ${totalHomens}")
    println("O total de mulheres cadastradas é: ${totalMulheres}")
    println("A idade média dos homens é: ${idadeHomens / totalHomens}")
    println("O total de mulheres acima de 20 anos cadastradas é: ${mulheresMaisVelhas}")


}