fun main(){
    val maquina = (1..5).random()
    val escolhaUser = 2

    if (escolhaUser == maquina){
        println("Numero : ${maquina} \nParabéns você acertou!")
    } else {
        println("Numero : ${maquina} \nTente novamente, você nao acertou!")
    }
}