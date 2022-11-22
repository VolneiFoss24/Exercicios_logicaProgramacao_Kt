fun main(){
    var contador = 30

    while ( contador >= 1) {
        if (contador % 4 == 0){
            println("[${contador}]")
        } else {
            println(" $contador")
        }

        contador--
    }
}