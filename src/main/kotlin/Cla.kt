open class Shape {
    private var name:String = ""
    var number:Int = 5
    open protected var type:String = ""
    public var dimension:String = ""

    open fun printNumber() {
        println("Number is $number")
    }

}

open class Circle(x:String): Shape() {
    override var type: String = x

    override fun printNumber() {
        super.printNumber()

        println("We've got it")
    }
}

class Sphere: Circle("Rest") {

}

fun main() {
    val shape1 = Shape()
    println("Function in Shape")
    shape1.printNumber()

    val circle1 = Circle("r")
    println("Function in Circle")
    circle1.printNumber()

    val s = Sphere()
    s.number
    s.dimension
    s.printNumber()
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
//Create a class named Sphere, make it inherit from Circle


