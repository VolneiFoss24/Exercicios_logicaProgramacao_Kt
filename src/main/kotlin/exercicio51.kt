fun main(){
    var contador   = 0
    var mediaIdade = 0
    var maiorIdade = 0
    var menorIdade = 0

    while (contador <= 10){
        val idadePessoas = (1..100).random()
        mediaIdade += idadePessoas
        println("idade : ${idadePessoas}")
        if (contador == 1){
            maiorIdade = idadePessoas
        } else if (maiorIdade < idadePessoas) {
            maiorIdade = idadePessoas
        } else if (idadePessoas < 5) {
            menorIdade += 1
        }

        contador++
    }

    println("A maior idade informada é: ${maiorIdade}")
    println("A quantidade de pessoas com idade inferior a 5 anos é ${menorIdade}")
    println("A media das idades informadas é ${mediaIdade/10}")

}