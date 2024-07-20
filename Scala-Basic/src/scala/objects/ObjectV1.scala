package scala.objects

object ObjectV1 {
  println("Object Started")
  
  var name : String = "Naushad"
  var sal : Int = 100
  var age : Int = 0
  
  private val home = System.getProperty("user.home")

  override def toString() = s"$name => $sal => $age"
  
  def printHome() : Unit = println(s"Home = $home")
  def printConsData() : Unit = println(this)
  
  
  printHome()
  printConsData()
  println("Object End")
}