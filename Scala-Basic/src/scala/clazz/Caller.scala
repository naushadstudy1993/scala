package scala.clazz

object Caller {
  
  def main(args: Array[String]): Unit = {
    //clazzConstructor()
    //zeroArgConstructor
    //privateMembers
    //publicMembers()
    //privateValues
    //constructorV2
    //multiConstructor
    //constructureDefaultValue
    constructorNamedParameter
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
  
  def constructorV2() : Unit = {
    var obj = new ConstructorV2("Naushad", 100)
    obj.age = 30
    println(obj)
    obj.printConsData
    
  }
  
  def multiConstructor() = {
    var obj : Any = null;
    obj = new MultiConstructor("Naushad", 100)
    println(obj)
    obj = new MultiConstructor("Naushad")
    println(obj)
    obj = new MultiConstructor()
    println(obj)
    obj = new MultiConstructor("Naushad", 1000, 30)
    println(obj)
  }
  
  def constructureDefaultValue = {
     var obj : Any = null;
    obj = new ConstructureDefaultValue("Naushad", 100)
    println(obj)
    obj = new ConstructureDefaultValue("Naushad")
    println(obj)
    obj = new ConstructureDefaultValue()
    println(obj)
    obj = new ConstructureDefaultValue("Naushad", 1000, 30)
    println(obj)
    obj = new ConstructureDefaultValue("Naushad", age=30)
    println(obj)
  }
  
  def constructorNamedParameter() ={
    var obj = new ConstructorNamedParameter()
    println(obj)
    
  }
  
}