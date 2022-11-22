fun main(){
    val nota1 = 5.0
    val nota2 = 7.5
    val media = (nota1 + nota2) / 2
    if ( media < 4.9){
        println("Media: ${media} \nVocê está reprovado")
    } else if (media in 5.0 .. 6.9) {
        println("Media: ${media} \nPrecisamos melhorar, você está de recuperação")
    } else {
        println("Media: ${media} \nParabéns, você está de aprovado!")
    }
}


