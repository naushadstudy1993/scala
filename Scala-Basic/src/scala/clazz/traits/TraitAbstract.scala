package scala.clazz.traits

trait TraitAbstract {
  def add(a : Int, b : Int) : Unit ={
    var c = a + b
    println(s"$a + $b = $c")
  }
  def sub(a : Int, b : Int): Unit
  
  def mul(a: Int, b : Int) ={
    var c = a* b
    println(s"Trait: $a * $b = $c")
  }
  
}

class TraitAbstractClass extends TraitAbstract{
  def sub(a: Int, b : Int) : Unit = {
    var c = a - b
    println(s"$a - $b = $c")
  }
  
  override def mul(a: Int, b : Int) ={
    var c = a* b
    println(s"override: $a * $b = $c")
  }
}