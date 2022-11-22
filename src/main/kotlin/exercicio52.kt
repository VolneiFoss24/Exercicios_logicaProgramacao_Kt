fun main(){

    var contador = 0
    var idadeMasculino = 0
    var sexoMasculino = 0
    var idadeFeminino = 0
    var sexoFeminino = 0
    var mulherMaisVelha = 0

    while (contador <= 5){
        val idade = (1..100).random()
        val definirSexo = (1..2).random()

        if (definirSexo == 1){

            sexoMasculino += 1
            idadeMasculino += idade
        } else {

            sexoFeminino += 1
            idadeFeminino += idade
            mulherMaisVelha = idade

            if (mulherMaisVelha < idade){

                mulherMaisVelha = idade
            }
        }

        contador++
    }


    println("O total de homens cadastrados foi: ${sexoMasculino}")
    println("A media da idade dos homens cadastrados foi: ${idadeMasculino / sexoMasculino}")

    println("O total de mulheres cadastradas foi: ${sexoFeminino}")
    println("A idade mais avançada entre as mulheres é: ${mulherMaisVelha}")

    println("A media da idade do grupo é: ${(idadeFeminino + idadeMasculino) / 5}")


}