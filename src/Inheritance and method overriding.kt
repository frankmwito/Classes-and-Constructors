open class Animal(
    val name: String,
    val sound: String
){
    open fun makeSound(){
        println(sound)
    }
}
class Dog(name: String) : Animal(name, "woof"){
    override fun makeSound() {
        println("$name says: $sound")
    }
}
fun main() {
    val animal = Animal(" dog name", "sound")
    animal.makeSound()
    val dog = Dog("Hercules")
    dog.makeSound()
}
