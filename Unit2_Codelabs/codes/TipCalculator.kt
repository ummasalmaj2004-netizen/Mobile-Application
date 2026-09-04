fun main() {
    val billAmount = 100.0
    val tipPercentage = 15

    val tip = billAmount * tipPercentage / 100
    val total = billAmount + tip

    println("Bill: RM$billAmount")
    println("Tip ($tipPercentage%): RM$tip")
    println("Total: RM$total")
}
