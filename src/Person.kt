class Person(
    val name: String,
    val age: Int,
    val address: String
) {
   fun introduce(){
       println("My name is $name of age $age from $address")
   }
}
fun main(){
    val person = Person("John", 21, "Embakasi")
    person.introduce()
}