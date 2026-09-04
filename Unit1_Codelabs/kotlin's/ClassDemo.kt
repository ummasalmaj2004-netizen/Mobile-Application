class Student(val name: String, val semester: Int) {
    fun introduce() {
        println("Hi, I am $name, currently in semester $semester.")
    }
}

fun main() {
    val student = Student("Ummasalma", 3)
    student.introduce()
}
