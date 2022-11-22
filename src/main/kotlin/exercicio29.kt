fun main(){
    val comprimento = 20
    val largura = 30
    val areaTotal = comprimento * largura

    if (areaTotal < 100){
        println("Area total: ${areaTotal} \nEste é um terreno popular")
    } else if (areaTotal in 100..500){
        println("Area total: ${areaTotal} \nEste é um terreno master")
    } else {
        println("Area total: ${areaTotal} \nEste é um terreno vip")
    }
}