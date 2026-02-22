
fun media(soma: Int, contador: Int, contaPar: Int, somaPar: Int) {
    var media  = 0.0
    media = soma.toDouble() / contador

    val mediaPar: Double = (somaPar / contaPar).toDouble()
    print("\nA media dos numeros:" + media + "\n")
    print("A media dos numeros pares " + mediaPar + "\n")
}

fun main() {
    var soma = 0
    var contador = 0
    var maior = -999999
    var menor = 10000
    var contaimpar = 0
    var contaPar = 0
    var somaPar = 0
    do {
        print("Digite o numero: ")
        val numero = readln().toInt()

        if (numero == 0) break
        if (numero % 2 == 0) {
            somaPar += numero
            contaPar++
        }
        soma += numero
        contador++
        if (numero > maior) maior = numero
        if (numero < menor) menor = numero
        if(numero % 3 == 0){
            contaimpar ++
        }
    } while (numero != 0)

    print("Soma total dos numeros: " + soma)
    print("\nContador total dos numeros: " + contador)
    print("\nMenor numero: " + menor)
    print("\nMaior numero: " + maior)
    print("\nContador numero impar: " + contaimpar)

    media(soma, contador, contaPar, somaPar)
}
