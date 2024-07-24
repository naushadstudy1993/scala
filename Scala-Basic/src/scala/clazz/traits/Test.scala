package scala.clazz.traits

object Test {
  def main(args: Array[String]): Unit = {
     println("Main Method")
     
     var obj = new Test2Class() with Test2
     println(obj)
     obj.add(10, 5)
 
  }
}