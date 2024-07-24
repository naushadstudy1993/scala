package scala.clazz.traits

trait TraitJavaInterface {
  def startTail(): Unit
  def stopTail() : Unit
}

class Dog extends TraitJavaInterface{
  
  def startTail() : Unit = println(s"$this.toString() => start tail")
  def stopTail() : Unit = println(s"$this.toString() => stop tail")
}