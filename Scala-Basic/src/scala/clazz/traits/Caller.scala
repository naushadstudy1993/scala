package scala.clazz.traits

object Caller {
  
  def main(args: Array[String]): Unit = {
    println("Main Method")
    
    //traitJavaInterface
    //MultiTraits
    //traitAbstract
    traitsOnFly
  }
  
  def traitJavaInterface() : Unit ={
    var obj = new Dog()
    obj.startTail()
    obj.stopTail() 
  }
  
  def MultiTraits() : Unit = {
    var obj = new Dog1()
    obj.startRunning()
  }
  
  def traitAbstract : Unit = {
    var obj = new TraitAbstractClass
    obj.add(10, 5)
    obj.sub(20,10)
    
    obj.mul(10,5)
  }
  
  def traitsOnFly() : Unit = {
    var obj = new TraitsOnFlyClass() with TraitsOnFly
    obj.add(10, 5)
  }
  
}