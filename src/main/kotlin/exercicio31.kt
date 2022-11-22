fun main(){
    val reta1 = 5
    val reta2 = 6
    val reta3 = 6

    if (reta1 == reta2 && reta3 == reta2){
        println("você consegue formar um triangulo equilatero")
    } else if (reta1 == reta2 && reta2 != reta3){
        println("você consegue formar um triangulo isósceles")
    } else {
        println("você consegue formar um triangulo escaleno")
    }
}