package scala.clazz

class ConstructureDefaultValue(var name : String = "A", var sal : Int = 0, var age : Int =0) {
  
   
  override def toString() = s"$name => $sal => $age"
   
}