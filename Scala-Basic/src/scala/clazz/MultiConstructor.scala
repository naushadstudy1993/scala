package scala.clazz


class MultiConstructor(var name : String, var sal : Int, var age : Int) {
  
  val Default_name : String = "A"
  val Default_sal : Int = 10
    
  def this(name : String) = {
    this(name, 0, 0)
  }
  
  def this(sal : Int) ={
    this("A", sal, 0)
  }
  
  def this() ={
    this("A", 10, 0)
  }
  
  def this(sal: Int, age: Int) ={
    this("A", sal, age)
  }
  
  def this(name : String, sal : Int) ={
    this("A", sal, 0)
  }
  
  override def toString() = s"$name => $sal => $age"
  
}