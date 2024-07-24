package scala.clazz.traits

trait Test2 {
 def add(a: Int, b : Int) : Unit ={
    var c = a+b
    println(s"$a + $b = $c")
  }
}


class Test2Class{
  println("Hello class")
}