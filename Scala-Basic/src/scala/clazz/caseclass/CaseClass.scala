package scala.clazz.caseclass

object CaseClass {
  
  def main(args: Array[String]): Unit = {
    case class Person(name: String, sal: Int)
    var obj = Person("Naushad", 100)
   // obj.name = "Naaz"
    obj=obj.copy("Naushad", 300)
   
    println(obj)
  } 
}