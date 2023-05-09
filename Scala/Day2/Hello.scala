import Person.numOfPppl

import scala.language.postfixOps

case class Cash(pounds:Int, pence:Int)

class Money(currency:String, p1: Int, p2:Int) extends Cash(p1, p2)

// just constructor parameters, not attributes!!
class Person( fname:String,  lname:String, val age: Int){
  println("I'm in the constructor here!!")
  numOfPppl += 1;
  val fullName = fname + lname

  def getFullName() : String = fname+" " +lname

  def myMethod = "Martina"

  val myVal = "Martina"

  def +(p2: Person): Person = {
    new Person("new", "person", p2.age + this.age)
  }

  def oneParamMethod(a : Int) : Int = this.age + a
}
object Person{
  var numOfPppl = 0;
}


object Hello {

  def main(args:Array[String]): Unit = {
    println("Hello from Scala")
    var x: Int = 7
    x = 8
    val y = 9
    val z = {
      val a = 7; a + 3
    }
    //    println(a)
    //    println( multiply(4,5))
    //    comparisonWithThree(6)
    //    println(**(5))

    val person: Person = new Person("Martina", "Yusuf", 21)
    //println(person.fname)
    println(person.getFullName())
    println(person.fullName)
    person.myMethod
    //person.fname = "Eva"

    val person2: Person = new Person("John", "Doe", 34)
    val newPerson: Person = person.+(person2)
    val anotherPerson: Person = person + person2
    val result: Int = person oneParamMethod 3
    println(Person.numOfPppl)

    //the method isInstanceOf on Any does not take arguments, it's defined without the parentheses
    // it's parameterized, so the Person class is passed as a type parameter into the method
    person.isInstanceOf[Person]
    
  }

  def multiply(a: Int, b:Int) :Int = a*b

  def comparisonWithThree(a:Int):Int = if (a>3) a else 7


  def **(a:Int) : Int = a*a


}
