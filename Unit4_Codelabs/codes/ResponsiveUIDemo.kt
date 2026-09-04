fun main() {
    val windowSizes = listOf("Compact", "Medium", "Expanded")

    for (size in windowSizes) {
        when (size) {
            "Compact" -> println("UI adapted for phone screen")
            "Medium" -> println("UI adapted for tablet screen")
            "Expanded" -> println("UI adapted for desktop screen")
        }
    }
}
