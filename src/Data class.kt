data class Student(
    val id : Int,
    val name : String,
    val grade : String
)
  fun main(){
      val student = Student(1, "frank", "good" )
      println(student.toString())
  }