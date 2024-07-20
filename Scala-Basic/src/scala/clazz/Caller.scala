package scala.clazz

object Caller {
  
  def main(args: Array[String]): Unit = {
    //clazzConstructor()
    //zeroArgConstructor
    //privateMembers
    //publicMembers()
    privateValues
  }
  
  def clazz() : Unit = {
    var c1 = new Clazz("Naushad", 10000.0)  
    println(c1.name)
    println(c1.sal)
  }
  
  def clazzConstructor(){
    var obj :ClazzConstructor = new ClazzConstructor("Naushad", 1000)
    var obj1 = new ClazzConstructor
    println(obj1)    
  }
  
  def zeroArgConstructor(){
    var obj = new ZeroArgConstructor()
    obj.m1
  }
  
  def privateMembers : Unit ={
    var obj = new PrivateMembers("Naushad", 100)
    println(obj.name)
    //obj.sal =3000 // compilation error: Reassignment to val   
    println(obj.sal)
  }
  
  def publicMembers(): Unit = {
    var obj = new PublicMembers("Naushad", 200)
    println(obj)
    
    obj.name = "Naaz"
    println(obj)
  }
  
  def privateValues() : Unit ={
    var obj = new PrivateValues("Naushad", 4000)
    //println(obj.name) // CE: Value name is not a member of class
    println(obj)
  }
  
}