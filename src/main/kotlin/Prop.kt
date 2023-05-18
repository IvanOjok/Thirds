open class Lesson {
    private var time:Long = 1000
    open var location:String = ""
    open protected var subject:String = ""
}

class University:Lesson() {
    override var location: String = ""
    override var subject: String = ""
}

fun main() {
    val lesson1 = Lesson()
    //lesson1.time = 20000
    lesson1.location = "Kira"
    //lesson1.subject = ""

    val un1 = University()
    un1.location
//    un1.subject = ""
}


//Create a class named Shape with four attributes
//1. name
//2. number
//3. type
//4. dimension
//
//Make name and type private and protected respectively
//Create a second class named Circle with primary
//constructor called x, and make it inherit from Shape
//Assign x(Circle) to type(Shape)


