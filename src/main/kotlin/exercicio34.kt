fun main(){
    val valorImovel = 250000
    val prestacaoMensal = valorImovel / 120
    val salarioComprador = 5000

    if(prestacaoMensal <= salarioComprador * 0.30){
        println("Você pode adquirir este imovel no valor de R$ ${prestacaoMensal} por mes")
    } else {
        println("Infelizmente não podemos aprovar o credito para você")
    }

}