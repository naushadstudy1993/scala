package scala.clazz

class ConstructorNamedParameter(var name : String = "A", var sal : Int = 0, var age : Int = 0  ) {
  
  override def toString() = s"$name => $sal => $age"
}