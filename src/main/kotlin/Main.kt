class House {
    var location:String = ""
    var type:String = ""
    var length:Int = 4

    fun getLength() {
        print("The location is $location")
    }

    fun getType() {
        print("the type is $type")
    }
}

fun main() {
    val a = House()
    a.location = "Ntinda"
    a.type = "Flat"

    a.getLength()
    a.getType()
}