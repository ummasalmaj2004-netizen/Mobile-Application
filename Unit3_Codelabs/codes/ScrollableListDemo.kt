fun main() {
    val items = listOf("Apple", "Banana", "Cherry", "Durian", "Mango")

    println("Scrollable List Simulation:")
    items.forEachIndexed { index, item ->
        println("Item ${index + 1}: $item")
    }

    // Simulate click listener
    val selectedItem = items[2]
    println("You clicked on: $selectedItem")
}
