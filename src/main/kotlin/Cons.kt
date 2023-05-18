class Car(hosePower:String) {

    val t = hosePower
    fun getPower() {
        println("The hose power is $t")
    }
}

class Food(var type:Float) {

    fun getFoodType() {
        println(type)
    }
}

fun main() {
    val car1 = Car("56")
    car1.getPower()
}