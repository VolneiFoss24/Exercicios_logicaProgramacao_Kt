import java.lang.String.format

fun main(){
    val altura = 1.95
    val peso = 65
    val imc = peso / (altura * altura)
    val resultado = format("%.2f", imc)
    when (imc){
        in 0.00 .. 18.5  -> println("Imc: ${resultado}, voce está abaixo do peso")
        in 18.5 .. 25.00 -> println("Imc: ${resultado}, voce está  no peso ideal")
        in 25.0 .. 30.0  -> println("Imc: ${resultado}, voce está  com sobrepeso")
        in 30.0 .. 40.0  -> println("Imc: ${resultado}, voce está  com obesidade")
        else             -> println("Imc: ${resultado}, Sua obesidade é morbida")
    }
}