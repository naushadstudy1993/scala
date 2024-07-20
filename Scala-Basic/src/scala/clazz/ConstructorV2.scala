package scala.clazz

class ConstructorV2(var name : String, var sal :Int) {
  println("Constructor Started")
  
  var age : Int = 0
  
  private val home = System.getProperty("user.home")

  override def toString() = s"$name => $sal => $age"
  
  def printHome() : Unit = println(s"Home = $home")
  def printConsData() : Unit = println(this)
  
  
  printHome()
  printConsData()
  println("Constructor End")
}