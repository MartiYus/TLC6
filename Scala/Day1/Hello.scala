// just constructor parameters, not attributes!!
class Person( fname:String,  lname:String){
  println("I'm in the constructor here!!")
  val fullName = fname + lname

  def getFullName() : String = fname+" " +lname
}


object Hello {

  def main(args:Array[String]): Unit ={
    println("Hello from Scala")
    var x : Int = 7
    x = 8
    val y = 9
    val z = { val a = 7; a + 3}
//    println(a)
//    println( multiply(4,5))
//    comparisonWithThree(6)
//    println(**(5))

    val person:Person = new Person("Martina", "Yusuf")
    //println(person.fname)
    println(person.getFullName())
    println(person.fullName)
    //person.fname = "Eva"
  }

  def multiply(a: Int, b:Int) :Int = a*b

  def comparisonWithThree(a:Int):Int = if (a>3) a else 7


  def **(a:Int) : Int = a*a


}
