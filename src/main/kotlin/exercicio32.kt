fun main(){
    val maquina = (1..3).random()
    val usuario = 2

    when (usuario){
        1 -> println("Usuario: Papel")
        2 -> println("Usuario: Tesoura")
        else -> println("Usuario: pedra")
    }

    when (maquina) {
        1 -> println("Maquina: Papel")
        2 -> println("Maquina: Tesoura")
        else -> println("Maquina: pedra")
    }

    if (usuario > maquina){
        println("Usuario ganhou!")
    } else if (maquina > usuario){
        println("Maquina ganhou de você!")
    } else {
        println("Opa!, houve empate :)")
    }
}