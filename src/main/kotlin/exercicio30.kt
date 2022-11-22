fun main(){
    val nome = "Volnei"
    val salario = 1200
    val tempoEmpresa = 2

    if (tempoEmpresa < 3){
        println("Aumento: R$${(salario * 0.03)} \n${nome} este é seu novo salario R$ R$ ${salario + (salario * 0.03)}  ")
    } else if (tempoEmpresa in 3..10){
        println("Aumento: R$${(salario * 0.125)} \n${nome} este é seu novo salario R$ ${salario + (salario * 0.125)} ")
    } else {
        println("Aumento: R$${(salario * 0.20)} \n${nome} este é seu novo salario R$ ${salario + (salario * 0.20)} ")
    }
}