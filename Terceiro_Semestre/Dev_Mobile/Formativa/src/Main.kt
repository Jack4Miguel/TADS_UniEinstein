//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Insira a palavra:")
    val palavra  =  readln()
    for (i in palavra.length - 1 downTo 0 ) {
        print(palavra[i])
    }
}