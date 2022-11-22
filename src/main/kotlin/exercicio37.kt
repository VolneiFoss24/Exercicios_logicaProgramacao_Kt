fun main(){
    val horasExercicioMensal = 40
    var pontuação = 0

    if (horasExercicioMensal <= 10) {
        pontuação = 2 * horasExercicioMensal
    } else if (horasExercicioMensal in 10..20) {
        pontuação = 5 * horasExercicioMensal
    } else {
        pontuação = 10 * horasExercicioMensal
    }

    println("Sua pontuação mensal: ${pontuação} \nVocê faturou com nosso programa de pontos o total de R$ ${pontuação * 0.05}")
}