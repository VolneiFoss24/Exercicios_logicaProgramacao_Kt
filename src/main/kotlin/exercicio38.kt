fun main(){
    var salarioAtual = 1200.0
    val genero = "f"
    val tempoEmpresa = 25

    if (genero == "F".lowercase()){
        salarioAtual = if (tempoEmpresa < 15) {
            (salarioAtual + (salarioAtual * 0.05))

        } else if (tempoEmpresa in 15 .. 20){
            (salarioAtual + (salarioAtual * 0.12))

        } else {
            (salarioAtual + (salarioAtual * 0.23))
        }

    } else {
        salarioAtual = if (tempoEmpresa < 15) {
            (salarioAtual + (salarioAtual * 0.03))

        } else if (tempoEmpresa in 15 .. 20){
            (salarioAtual + (salarioAtual * 0.13))

        } else {
            (salarioAtual + (salarioAtual * 0.25))
        }
    }


    println("Parabéns pelo seu tempo de colaboração em nossa empresa: " +
            "\nTomamos liberdade de lhe dar uma bonificação pelo seu feito seu novo salário é R$ ${salarioAtual} ")

}