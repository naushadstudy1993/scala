package scala.clazz.traits

trait MultiTraits {
  
}

trait Speaker {
  def speak() : String
}
trait TailWagger1{
  def startTail() : Unit
  def stopTail() : Unit
}
trait Runner{
  def startRunning() : Unit
  def stopRunning() : Unit
}

class Dog1 extends Speaker with TailWagger1 with Runner {
  
  def speak() : String = "Speak"
  
  def startTail() : Unit = println("startTail")
  def stopTail() : Unit = println("StopTail")
  
  def startRunning() : Unit = println("Start Running")
  def stopRunning() : Unit = println("Stop Running")
}