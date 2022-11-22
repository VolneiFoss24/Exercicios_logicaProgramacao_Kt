fun main(){
    val velocidadeVeiculo = 80
    if (velocidadeVeiculo > 80){
        println("Você foi multado em R$ ${(velocidadeVeiculo - 80) * 5}")
    } else {
        println("Você está dentro do limite permitido!")
    }

}

