fun navigateTo(screen: String) {
    println("Navigating to $screen...")
}

fun main() {
    val screens = listOf("Home", "Profile", "Settings")
    screens.forEach { screen ->
        navigateTo(screen)
    }
}
