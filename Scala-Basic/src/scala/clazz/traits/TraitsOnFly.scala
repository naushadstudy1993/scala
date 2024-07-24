package scala.clazz.traits

trait TraitsOnFly {
  def add(a: Int, b : Int) : Unit ={
    var c = a+b
    println(s"$a + $b = $c")
  }
}


class TraitsOnFlyClass{
  println("Hello class")
}
