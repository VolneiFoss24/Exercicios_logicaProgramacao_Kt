fun main(){
        var contador = 0
        var somaNImpares = 0
        var somaNPares = 0

        while (contador <= 6){
            var numerosInt = (1..10).random()
            if (numerosInt % 2 == 0){
                somaNPares += 1

            } else if (numerosInt % 2 != 0) {
                somaNImpares += 1

            }
            contador++
        }

            println("total de pares são: ${somaNPares}")
            println("total de impares são: ${somaNImpares}")
}




