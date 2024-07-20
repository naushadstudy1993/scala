package scala.clazz

class PublicMembers(var name : String, var sal: Int){
  override def toString() = s"$name => $sal"
}