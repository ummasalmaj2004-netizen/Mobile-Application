data class Product(val name: String, val price: Double)

fun main() {
    val products = listOf(
        Product("Laptop", 3500.0),
        Product("Phone", 1200.0),
        Product("Headphones", 250.0)
    )

    // Using collections
    products.forEach { println("${it.name} costs RM${it.price}") }

    // Filtering
    val expensive = products.filter { it.price > 1000 }
    println("Expensive products: $expensive")
}
