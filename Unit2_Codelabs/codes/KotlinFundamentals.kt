fun main() {
    // Conditionals
    val score = 85
    if (score >= 80) {
        println("Excellent performance!")
    } else {
        println("Keep practicing!")
    }

    // Lambda expression
    val square: (Int) -> Int = { x -> x * x }
    println("Square of 5 is ${square(5)}")

    // Class with function type
    class Student(val name: String) {
        fun greet(action: (String) -> String) {
            println(action(name))
        }
    }
    val student = Student("Ummasalma")
    student.greet { n -> "Hello, $n! Welcome to Unit 2." }
}
